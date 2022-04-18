package com.anshinbackend.controller;

import com.anshinbackend.dao.AcountDAO;
import com.anshinbackend.dao.CartItemDAO;
import com.anshinbackend.dao.ProductDAO;
import com.anshinbackend.dto.CartItemDTO;
import com.anshinbackend.dto.Customer.OrderChangeReturnDTO;
import com.anshinbackend.dto.NavBar.CartDetailDTO;
import com.anshinbackend.entity.CartItem;
import com.anshinbackend.entity.DetailProduct;
import com.anshinbackend.service.CartItemService;
import com.anshinbackend.service.DetailProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@RestController
@RequestMapping("/cart")
@CrossOrigin("*")

public class CartController {
    @Autowired
    CartItemService _cartItemService;

    @Autowired
    AcountDAO _acountDao;

    @Autowired
    ProductDAO _productDao;

    @Autowired
    CartItemDAO _cartItemDao;

    @Autowired
    DetailProductService _detailProductService;
    @GetMapping("/findAll")
    public ResponseEntity<List<CartItem>> findAll(){
        return  ResponseEntity.ok(_cartItemService.findAll());
    }

    @GetMapping("/findByIdAcount/{id}")
    public ResponseEntity<List<CartItemDTO>> findByIDAcount(@PathVariable("id") Integer id){
        return  ResponseEntity.ok(_cartItemService.findByAccountId(id));
    }


    @GetMapping("/findByIdAcount2/{id}")
    public ResponseEntity<?> findByIDAcount2(@PathVariable("id") Integer id){

        return  ResponseEntity.ok(_cartItemService.findByIdAcount(id));
    }


    @GetMapping("/findDetailCartItem/{idProductDetail}")
    public ResponseEntity<?> findProductDetaiForCart(@PathVariable("idProductDetail") Integer id){
        DetailProduct p =  _detailProductService.findById(id);
        CartDetailDTO c = new CartDetailDTO();
        c.setIdProduct(p.getId());
        c.setProductName(p.getProduct().getProductName());
        c.setColorImage(p.getImage());
        c.setColorName(p.getColor().getColorName());
        c.setSizeName(p.getSize().getSize_name());
        c.setPrice(p.getProduct().getPrice());
        return  ResponseEntity.ok(c);
    }


    @DeleteMapping("/deleteAllByIdAccount/{cid}")
    public void findBy(@PathVariable("cid") Integer id) {
        _cartItemService.deleteBy(id);
    }

    @PostMapping("/createForAcount/{idAcount}/{idProductDetail}/{quantity}")
    public ResponseEntity<?> createCartItem(@PathVariable("idAcount") Integer idAcount,
                                            @PathVariable("idProductDetail") Integer idProductDetail,
                                            @PathVariable("quantity")  Integer quantity){
        List<CartItem> listCart =  _cartItemDao.findByAcountId(idAcount);
        System.out.println(idAcount);
        System.out.println(idProductDetail);
        System.out.println(quantity);
        AtomicReference<Boolean> check = new AtomicReference<>(false);
        listCart.forEach(x->{
            if(x.getDetailProduct().getId()== idProductDetail){
                x.setQuantity(quantity);
                _cartItemDao.save(x);
                check.set(true);

            }
        });

        if(check.get() == false) {
            CartItem cartItem = new CartItem();
            cartItem.setQuantity(quantity);
            cartItem.setAccount(_acountDao.findById(idAcount).get());
            cartItem.setDetailProduct(_detailProductService.findById(idProductDetail));
            _cartItemService.Create(cartItem);
        }
        return  ResponseEntity.ok("Thêm vào cart thành công");
    }

    @DeleteMapping("/deleteByidProduct/{aid}/{productid}")
    public void deleteByIdProduct(@PathVariable("aid")Integer acountid, @PathVariable("productid") Integer productid){
        _cartItemService.deleteByIdProduct(acountid, productid);
    }
}
