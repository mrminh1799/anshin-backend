package com.anshinbackend.controller.website;

import com.anshinbackend.dto.Customer.ImageProductDetailDTO;
import com.anshinbackend.dto.ProductDetailDTO;
import com.anshinbackend.entity.DetailProduct;
import com.anshinbackend.service.DetailProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productDetail")
@CrossOrigin
public class ProductDetailController {
    @Autowired
    DetailProductService _detailProductService;
@GetMapping("/finByColorSizeProduct/{idColor}/{idSize}/{idProduct}")
    public ResponseEntity<?> finByColorSizeProduct(@PathVariable("idColor") Integer idColor,
                                                   @PathVariable("idSize") Integer idSize,
                                                   @PathVariable("idProduct") Integer idProduct
                                                   ){
    return ResponseEntity.ok(_detailProductService.findByProductColorSize(idColor, idSize, idProduct));
}

    @GetMapping("/findById/{id}")
    public ResponseEntity<DetailProduct> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok().body(_detailProductService.findById(id));
    }

    @GetMapping("/findAllById/{id}")
    public ResponseEntity<List<DetailProduct>> findAllby(@PathVariable("id") Integer id){
        return ResponseEntity.ok().body(_detailProductService.findAllByid(id));
    }


    @GetMapping("/findAllImageProductDetailByProduct/{id}")
    public ResponseEntity<List<ImageProductDetailDTO>> findAllImageProductDetailByProduct(@PathVariable("id") Integer id) {
        return ResponseEntity.ok().body(_detailProductService.findAllImageProductDetailByProduct(id));
    }
    @GetMapping("/findImage/{idProduct}/{idColor}")
    public ResponseEntity<?> findImageByProductAndColorId(@PathVariable("idProduct") Integer idProduct, @PathVariable("idColor") Integer idColor){
        return  ResponseEntity.ok(_detailProductService.findImage(idProduct, idColor));

    }
}
