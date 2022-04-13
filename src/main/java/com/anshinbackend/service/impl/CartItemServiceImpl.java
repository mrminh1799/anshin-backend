package com.anshinbackend.service.impl;

import com.anshinbackend.dao.CartItemDAO;
import com.anshinbackend.dto.CartItemDTO;
import com.anshinbackend.dto.Customer.ProductDTO;
import com.anshinbackend.dto.NavBar.CartDetailDTO;
import com.anshinbackend.entity.CartItem;
import com.anshinbackend.entity.DetailProduct;
import com.anshinbackend.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CartItemServiceImpl implements CartItemService {
    @Autowired
    CartItemDAO _cartItemDao;

    @Autowired
    EntityManager em;
    @Override
    public List<CartItemDTO> findByAccountId(Integer id) {
        List<CartItemDTO> list= new ArrayList<>();
        _cartItemDao.findByAcountId(id).forEach(x->{
            list.add(new CartItemDTO(x.getDetailProduct().getId(), x.getQuantity()));
        });
        return  list;
    }

    @Override
    public List<CartItem> findAll() {
        return _cartItemDao.findAll();
    }

    @Override

    public void deleteBy(Integer id) {
        _cartItemDao.deleteBy(id);
    }

    public void Create(CartItem cartItem) {
        _cartItemDao.save(cartItem);
    }

    @Override
    public List<CartDetailDTO> findByIdAcount(Integer id) {


        String sql = "select cart_items.product_detail_id, products.product_name, sizes.size_name, colors.color_name, detail_products.image, products.price,SUM(cart_items.quantity) as quantity from cart_items  INNER join detail_products ON \n" +
                " detail_products.id = cart_items.id INNER join colors ON colors.id = detail_products.id_color\n" +
                "INNER join sizes ON sizes.id = detail_products.id_size INNER join products ON products.id = detail_products.id_product    \n" +
                " WHERE acount_id=1 GROUP BY cart_items.product_detail_id";
        Query query = em.createNativeQuery(sql, Tuple.class);
        List<Tuple> listResult = query.getResultList();

        List<CartDetailDTO> listCartItems = new ArrayList<>();

        for(Tuple x: listResult){
            Integer idProduct = x.get("product_detail_id", Integer.class);
            String productName  = x.get("product_name", String.class);
            String size =x.get("size_name", String.class);
            String color = x.get("color_name", String.class);
            String image = x.get("image", String.class);
            Integer price = x.get("price", Integer.class);
            BigDecimal quantity = x.get("quantity", BigDecimal.class);
            // listReturn.add(new ColorProductDetailDTO(id, nameColor, image));
            listCartItems.add(new CartDetailDTO(idProduct, productName, size, color, image,price, quantity.intValue() ));
        }



        return listCartItems;
    }

}
