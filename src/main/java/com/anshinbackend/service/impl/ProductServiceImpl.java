package com.anshinbackend.service.impl;

                  
import com.anshinbackend.dao.DiscountDAO;
import com.anshinbackend.dao.ProductDAO;
import com.anshinbackend.dao.SaleEventDAO;

import com.anshinbackend.dao.ColorDAO;
import com.anshinbackend.dao.ProductDAO;
import com.anshinbackend.dao.ProductDetailDAO;
import com.anshinbackend.dao.SizeDAO;
import com.anshinbackend.dto.Admin.ProductAndProductDetailDTO;
import com.anshinbackend.dto.ColorDTO;

import com.anshinbackend.dto.ColorProductDetailDTO;
import com.anshinbackend.dto.Customer.ProductDTO;
import com.anshinbackend.dto.Customer.ProductsssDTO;
import com.anshinbackend.dto.ProductDetailDTO;

import com.anshinbackend.entity.Category;
import com.anshinbackend.entity.Discount;
import com.anshinbackend.entity.Product;
import com.anshinbackend.entity.SaleEvent;

import com.anshinbackend.dto.SizeDTO;
import com.anshinbackend.entity.*;

import com.anshinbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Tuple;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl  implements ProductService {

    @Autowired
    ProductDAO _productDAO;

    @Autowired
    SaleEventDAO sdao;
    @Autowired
    DiscountDAO ddao;
    @Autowired
    EntityManager em;

    @Autowired
    ProductDetailDAO _productDetailDAO;

    @Autowired
    ColorDAO _colorDAO;

    @Autowired
    SizeDAO _sizeDAO;


    @Override
    public List<ProductDTO> findAll() {

        List<ProductDTO> list= new ArrayList<>();
        _productDAO.findByIsDeleteIsFalse().forEach(x->{
            if(x.getIsDelete()== false) {
                ProductDTO e = new ProductDTO();
                e.setId(x.getId());
                e.setName(x.getProductName());
                e.setImage(x.getImage());
                e.setPrice(x.getPrice());
                e.setDescription(x.getDescription());
                e.setStatus(x.getStatus());
                list.add(e);
            }
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
        dto.setCategoryId(p.getCategory().getId());
        dto.setCategoryName(p.getCategory().getCategoryName());

        List<DetailProduct> listNotDelete = new ArrayList<>();
        p.getListProductDetails().forEach(e->{
            if(!e.getIsDeleted()){
                listNotDelete.add(e);
            }
        });




        dto.setDescription(p.getDescription());
        List<Size> listSize = _sizeDAO.findAll();
        List<Color> listColor = _colorDAO.findAll();
        List<SizeDTO> listSizeDTO = new ArrayList<>();
        List<ColorDTO> listColorDTO = new ArrayList<>();
        dto.setListDetailProduct(listNotDelete);

        listSize.forEach(s->{
            SizeDTO sizeDTO = new SizeDTO();
            sizeDTO.setIsSelected(false);
            sizeDTO.setNameSize(s.getSize_name());
            sizeDTO.setIdSize(s.getId());
            listNotDelete.forEach(pr->{
                if (pr.getSize().getId() == s.getId()) {
                    sizeDTO.setIsSelected(true);
                }
            });
            listSizeDTO.add(sizeDTO);
        });


        listColor.forEach(c->{
            ColorDTO colorDTO = new ColorDTO();
            colorDTO.setIsSelected(false);
            colorDTO.setNameColor(c.getColorName());
            colorDTO.setIdColor(c.getId());
            listNotDelete.forEach(pr->{
                if (pr.getColor().getId() == c.getId()) {
                    colorDTO.setIsSelected(true);
                }
            });
            listColorDTO.add(colorDTO);
        });

        dto.setListSize(listSizeDTO);
        dto.setListColor(listColorDTO);
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
        List<ProductDTO> list = new ArrayList<>();
        for(Tuple x: listResult){
            Integer id = x.get("id", Integer.class);
            String productName  = x.get("product_name", String.class);
            Integer price =x.get("price", Integer.class);
            String image = x.get("image", String.class);
            String description = x.get("description", String.class);
           // listReturn.add(new ColorProductDetailDTO(id, nameColor, image));
            list.add(new ProductDTO(id, productName, price, image, null, description));
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
    public List<ProductsssDTO> findAllBySaleEvent() {
        List<ProductsssDTO> list= new ArrayList<>();
//        _productDAO.findAllBySaleEvent().forEach(x->{
//            ProductDTO e = new ProductDTO();
//            e.setId(x.getId());
//            e.setName(x.getProductName());
//            e.setImage(x.getImage());
//            e.setPrice(x.getPrice());
//            e.setDescription(x.getDescription());
//            list.add(e);
//        });

        _productDAO.findAllBySaleEvent().forEach(x->{
            Discount discount =  ddao.findById(x.getId()).get();
            list.add(new ProductsssDTO(x.getId(),x.getProductName(),x.getPrice(),x.getImage(),x.getDescription(),discount.getStyleDiscount(),discount.getDiscountprice()));
        });

        return list ;
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

    @Override
    public List<ProductDTO> findByCartegoryParentID(Integer id) {
        String sql = "SELECT id, product_name, price, image, description from products \n" +
                "WHERE category_id in (\n" +
                "SELECT id from categories where category_parent_id ="+id+")";
        Query query = em.createNativeQuery(sql, Tuple.class);
        List<Tuple> listResualt = query.getResultList();
        List<ProductDTO> list = new ArrayList<>();
        listResualt.forEach(x->{
            Integer idProduct = x.get("id", Integer.class);
            String productName  = x.get("product_name", String.class);
            Integer price =x.get("price", Integer.class);
            String image = x.get("image", String.class);
            String description = x.get("description", String.class);
            // listReturn.add(new ColorProductDetailDTO(id, nameColor, image));
            list.add(new ProductDTO(idProduct, productName, price, image, null, description));
        });

        return list;
    }

    @Override
    public Integer insertProductAndProductDetail(ProductAndProductDetailDTO dto) {
        String name = dto.getName();
        String description = dto.getDescription();
        Integer price  = dto.getPrice();
        Integer categoryId = dto.getCategoryId();
        Integer id = dto.getId();
        List<com.anshinbackend.dto.Admin.ProductDetailDTO> listDetail = dto.getListDetail();
        String image = dto.getImage();
        Product p = new Product();
        p.setProductName(name);
        p.setDescription(description);
        p.setPrice(price);
        Category c = new Category();
        c.setId(categoryId);
        p.setCategory(c);
        p.setImage(image);
        p.setIsDelete(false);
        p.setTime_create(new Date());

        Product  product =  _productDAO.save(p);
        listDetail.forEach(x->{
            Integer idSize = x.getIdSize();
            Integer idColor = x.getIdColor();
            String imageProductDetail = x.getImage();
            Integer quantity = x.getQuantity();
            Size size = new Size();
            size.setId(idSize);
            Color color = new Color();
            color.setId(idColor);
            DetailProduct productDetail = new DetailProduct();
            productDetail.setImage(imageProductDetail);
            productDetail.setIsDeleted(false);
            productDetail.setSize(size);
            productDetail.setColor(color);
           // productDetail.setImage(image);
            productDetail.setQuantity(quantity);
            productDetail.setProduct(product);
            _productDetailDAO.save(productDetail);

        });



return  product.getId();
    }

    @Override
    public void updateStatusProduct(Integer id) {


        Product p = _productDAO.findById(id).get();
        Integer status = p.getStatus();
        Integer statusUpdate=null;
        if(status==1){
            statusUpdate=0;
        }else {
            statusUpdate=1;
        }
        System.out.println(status);
        System.out.println(statusUpdate);


        _productDAO.updateStatus(statusUpdate, id);

    }


}
