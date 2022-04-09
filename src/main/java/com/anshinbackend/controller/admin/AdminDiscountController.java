package com.anshinbackend.controller.admin;

import com.anshinbackend.entity.CartItem;
import com.anshinbackend.entity.Discount;
import com.anshinbackend.entity.Product;
import com.anshinbackend.service.DiscountService;
import com.anshinbackend.service.ProductService;
import com.anshinbackend.service.SaleEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin/Discount")
@CrossOrigin("*")
public class AdminDiscountController {
    @Autowired
    DiscountService discountService;
    @Autowired
    ProductService productService;
    @Autowired
    SaleEventService service;

    @GetMapping("/findAll")
    public ResponseEntity<List<Discount>> findAll(){
        return ResponseEntity.ok().body(discountService.findAll());
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Optional<Discount>> getOne(@PathVariable("id")Integer id){
        return  ResponseEntity.ok().body(discountService.findById(id));
    }
    @PostMapping("/create/{pricediscount}/{idProduct}/{idSaleEvent}/{styleDiscount}")


    public ResponseEntity<?> insert(@PathVariable("pricediscount") Integer pricediscount,
                                    @PathVariable("idProduct") Integer idProduct,
                                    @PathVariable("idSaleEvent")  Integer  idSaleEvent,
                                    @PathVariable("styleDiscount")  Boolean styleDiscount){
        Discount discount = new Discount();
        discount.setDiscountprice(pricediscount);
        discount.setProduct(productService.findById(idProduct));
        discount.setSaleEvent(service.findById(idSaleEvent));
        discount.setStyleDiscount(styleDiscount);
        discountService.insert(discount);
        return  ResponseEntity.ok("Thêm vào discount thành công");
    }

    @PutMapping("/update/{idProduct}/{idSaleEvent}")
    public ResponseEntity<Discount> update(@PathVariable("idProduct") Integer idProduct,
                                           @PathVariable("idSaleEvent")  Integer  idSaleEvent,
                                           @RequestBody Discount discount){
        discount.setProduct(productService.findById(idProduct));
        discount.setSaleEvent(service.findById(idSaleEvent));
        return ResponseEntity.ok().body(discountService.update(discount));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Discount> delete(@PathVariable("id") Integer id){
        discountService.delete(id);
        return  ResponseEntity.ok(null);
    }
}
