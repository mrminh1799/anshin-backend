package com.anshinbackend.controller;

import java.util.List;

import com.anshinbackend.entity.Size;
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

	@GetMapping("/findById/{id}")
	public ResponseEntity<Color> findByID(@PathVariable("id") Integer id) {
		return ResponseEntity.ok().body(colorService.findAll().get(id));
	}
	@GetMapping("/findByProductId/{idProduct}")
	public ResponseEntity<List<?>> findForProduct(@PathVariable("idProduct") Integer id){
		return ResponseEntity.ok(colorService.findAllForProduct(id));
	}

	@PostMapping("/create")
	public ResponseEntity<Color> createColor(@RequestBody Color color) {
		return ResponseEntity.ok().body(colorService.create(color));
	}

	@PutMapping("{id}")
	public Color update(@PathVariable("id")Integer id, @RequestBody Color color) {
		return colorService.update(color);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Color> deleteByID(@PathVariable Integer id) {
		colorService.delete(id);
		return ResponseEntity.ok().body(null);
	}

	@GetMapping("/findByIsdeleteColor")
	public List<Color> findByIsdeleteColor(){
		return colorService.findByIsdeleteColor();
	}
}
