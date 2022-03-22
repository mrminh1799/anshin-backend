package com.anshinbackend.controller.admin;

import com.anshinbackend.dao.ColorDAO;
import com.anshinbackend.dao.ProductDAO;
import com.anshinbackend.dao.SizeDAO;
import com.anshinbackend.dto.Admin.ProductDetailDTO;
import com.anshinbackend.entity.Color;
import com.anshinbackend.entity.DetailProduct;
import com.anshinbackend.entity.Product;
import com.anshinbackend.entity.Size;
import com.anshinbackend.service.DetailProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/detailProduct")
@CrossOrigin("*")

public class AdminDetailProductController {
    @Autowired
    DetailProductService _detaiProductService;
    @Autowired
    ProductDAO _productDAO;
    @Autowired
    SizeDAO _sizeDAO;
    @Autowired
    ColorDAO _colorDAO;


    @GetMapping("/findAll")
    public ResponseEntity<List<DetailProduct>> findAll(){
        return  ResponseEntity.ok().body(_detaiProductService.findAll());
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<DetailProduct> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok().body(_detaiProductService.findById(id));
    }

    @PostMapping("/insert")
    public ResponseEntity<DetailProduct> insert(@RequestBody ProductDetailDTO dto){
        Size size = _sizeDAO.findById(dto.getIdSize()).get();
        Color color = _colorDAO.findById(dto.getIdColor()).get();
        Product product = _productDAO.findById(dto.getIdProduct()).get();

        DetailProduct p = new DetailProduct();
        p.setIsDeleted(false);
        p.setQuantity(dto.getQuantity());
        p.setColor(color);
        p.setSize(size);
        p.setProduct(product);
        p.setImage(dto.getImage());


        return ResponseEntity.ok().body(_detaiProductService.insert(p));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<DetailProduct> update(@PathVariable("id") Integer id,@RequestBody ProductDetailDTO dto){
        Size size = _sizeDAO.findById(dto.getIdSize()).get();
        Color color = _colorDAO.findById(dto.getIdColor()).get();
        Product product = _productDAO.findById(dto.getIdProduct()).get();

        DetailProduct p = new DetailProduct();
        p.setIsDeleted(false);
        p.setQuantity(dto.getQuantity());
        p.setColor(color);
        p.setSize(size);
        p.setProduct(product);
        p.setImage(dto.getImage());
        p.setId(id);
        return ResponseEntity.ok().body(_detaiProductService.update(p));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DetailProduct> update(@PathVariable Integer id){
        _detaiProductService.delete(id);
         return ResponseEntity.ok().body(null);

    }

    @GetMapping("/findAllById/{id}")
    public ResponseEntity<List<DetailProduct>> findAllby(@PathVariable("id") Integer id){
        return ResponseEntity.ok().body(_detaiProductService.findAllByid(id));
    }



}
