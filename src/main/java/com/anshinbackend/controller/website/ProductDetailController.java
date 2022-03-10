package com.anshinbackend.controller.website;

import com.anshinbackend.service.DetailProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
