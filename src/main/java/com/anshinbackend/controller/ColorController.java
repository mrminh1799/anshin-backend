package com.anshinbackend.controller;

import java.util.List;

import com.anshinbackend.service.impl.ColorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.anshinbackend.entity.Color;


@RestController
@RequestMapping("/color")
@CrossOrigin("*")
public class ColorController {
	@Autowired
	ColorServiceImpl colorService;

	@GetMapping("/findAll")
	public ResponseEntity<List<Color>> get() {
	
		return ResponseEntity.ok().body(colorService.findAll());
	}

	@PostMapping("/create")
	public ResponseEntity<Color> createColor(@RequestBody Color color) {
		return ResponseEntity.ok().body(colorService.create(color));
	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<Color> findByID(@PathVariable("id") Integer id) {
		return ResponseEntity.ok().body(colorService.findAll().get(id));
	}
	@GetMapping("/findByProductId/{idProduct}")
	public ResponseEntity<List<?>> findForProduct(@PathVariable("idProduct") Integer id){
		return ResponseEntity.ok(colorService.findAllForProduct(id));
	}
}
