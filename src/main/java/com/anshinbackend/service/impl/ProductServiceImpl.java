package com.anshinbackend.service.impl;

import com.anshinbackend.dao.ProductDAO;
import com.anshinbackend.dto.ColorProductDetailDTO;
import com.anshinbackend.dto.Customer.ProductDTO;
import com.anshinbackend.dto.ProductDetailDTO;
import com.anshinbackend.entity.Product;
import com.anshinbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Tuple;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl  implements ProductService {
    @Autowired
    ProductDAO _productDAO;

    @Autowired
    EntityManager em;

    @Override
    public List<ProductDTO> findAll() {

        List<ProductDTO> list= new ArrayList<>();
        _productDAO.findByIsDeleteIsFalse().forEach(x->{
            ProductDTO e = new ProductDTO();
            e.setId(x.getId());
            e.setName(x.getProductName());
            e.setImage(x.getImage());
            e.setPrice(x.getPrice());
            e.setDescription(x.getDescription());
            list.add(e);
        });
        return list;
    }



    @Override
    public Product findById(Integer id) {
        return _productDAO.findById(id).get();
    }

    @Override
    public Product inset(Product p) {
        p.setIsDelete(false);
        Integer id = _productDAO.save(p).getId();
        p.setId(id);
        return p;
    }

    @Override
    public Product update(Product p) {
        return _productDAO.save(p);

    }

    @Override
    public Integer delete(Integer id) {
        _productDAO.deleteProduct(id);
        return  1;
    }



    @Override
    public List<ProductDTO> findByTop(
//            Sort sort
    ) {
       Integer currentPage = 0;
       Integer sizePage = 10;
        Pageable page = PageRequest.of(currentPage, sizePage);
        List<ProductDTO> list= new ArrayList<>();


        _productDAO.findByTop(page).forEach(x->{
            ProductDTO e = new ProductDTO();
            e.setId(x.getId());
            e.setName(x.getProductName());
            e.setImage(x.getImage());
            e.setPrice(x.getPrice());
            e.setDescription(x.getDescription());
            list.add(e);
        });
        return list ;
//
        }




    @Override
    public List<ProductDTO> findBySumTop() {
        Integer currentPage = 0;
        Integer sizePage = 10;
        Pageable page = PageRequest.of(currentPage, sizePage);
        List<ProductDTO> list= new ArrayList<>();
        _productDAO.findBySumTop(page).forEach(x->{
            ProductDTO e = new ProductDTO();
            e.setId(x.getId());
            e.setName(x.getProductName());
            e.setImage(x.getImage());
            e.setPrice(x.getPrice());
            e.setDescription(x.getDescription());
            list.add(e);
        });
        return list ;


    }
    @Override
    public List<ProductDTO> findAllPage(Integer currentPage, Integer sizePage) {

        Pageable page = PageRequest.of(currentPage, sizePage);
        List<ProductDTO> list= new ArrayList<>();
        _productDAO.findByIsDeleteIsFalse(page).forEach(x->{
            ProductDTO e = new ProductDTO();
            e.setId(x.getId());
            e.setName(x.getProductName());
            e.setImage(x.getImage());
            e.setPrice(x.getPrice());
            e.setDescription(x.getDescription());
            list.add(e);
        });
        return list;
    }

    @Override
    public ProductDetailDTO showDetailProduct(Integer id) {
        Product p =_productDAO.findById(id).get();

        ProductDetailDTO dto = new ProductDetailDTO();
        dto.setId(p.getId());
        dto.setName(p.getProductName());
        dto.setImage(p.getImage());
        dto.setPrice(p.getPrice());
        dto.setListDetailProduct(p.getListProductDetails());
        dto.setDescription(p.getDescription());
        return  dto;

    }


    @Override
    public List<ProductDTO> findAllByIdCategory(Integer id) {
        List<ProductDTO> list= new ArrayList<>();
        _productDAO.findAllByIdCategory(id).forEach(x->{
            ProductDTO e = new ProductDTO();
            e.setId(x.getId());
            e.setName(x.getProductName());
            e.setImage(x.getImage());
            e.setPrice(x.getPrice());
            e.setDescription(x.getDescription());
            list.add(e);
        });
        return list ;
    }

    
    @Override
        public List<ProductDTO> findByColorSizePrice(Integer idColor, Integer idSize,Integer bottomPrice ,Integer topPrice){

        String sql ="SELECT products.id, product_name, price, products.image, description FROM products join detail_products on products.id = detail_products.id " +
                "WHERE id_color="+idColor+" and id_size= "+ idSize;
                if(idColor==0){
                     sql ="SELECT products.id, product_name, price, products.image, description FROM products join detail_products on products.id = detail_products.id " +
                            "WHERE  id_size="+ idSize;
                }
                if(idSize==0){
                     sql ="SELECT products.id, product_name, price, products.image, description FROM products join detail_products on products.id = detail_products.id " +
                            "WHERE id_color="+idColor;
                }
                if(idColor ==0  && idSize ==0){
                    sql ="SELECT products.id, product_name, price, products.image, description FROM products join detail_products on products.id = detail_products.id ";
                }

        Query query = em.createNativeQuery(sql, Tuple.class);
        List<Tuple> listResult = query.getResultList();
        System.out.println(listResult.size());
        List<ProductDTO> list = new ArrayList<>();
        for(Tuple x: listResult){
            Integer id = x.get("id", Integer.class);
            String productName  = x.get("product_name", String.class);
            Integer price =x.get("price", Integer.class);
            String image = x.get("image", String.class);
            String description = x.get("description", String.class);
           // listReturn.add(new ColorProductDetailDTO(id, nameColor, image));
            list.add(new ProductDTO(id, productName, price, image, description));
        }

        List<ProductDTO> listFilter = new ArrayList<>();
        list.forEach(x->{
            if(x.getPrice()<=topPrice && x.getPrice()>=bottomPrice){
                listFilter.add(x);
            }
            if(topPrice==0){
                listFilter.add(x);
            }

        });

        return listFilter;
    }



    @Override
    public List<ProductDTO> findAllByNameCategory(String name) {
        List<ProductDTO> list = new ArrayList<>();
        _productDAO.findAllByNameCategory(name).forEach(x -> {
            ProductDTO e = new ProductDTO();
            e.setId(x.getId());
            e.setName(x.getProductName());
            e.setImage(x.getImage());
            e.setPrice(x.getPrice());
            e.setDescription(x.getDescription());
            list.add(e);
        });
        return list;
    }
}
