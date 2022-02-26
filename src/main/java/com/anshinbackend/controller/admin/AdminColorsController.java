package com.anshinbackend.controller.admin;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anshinbackend.entity.Categories;
import com.anshinbackend.entity.Colors;
import com.anshinbackend.service.impl.ColorsServiceImp;

@RestController
@RequestMapping("/admin/colors")
public class AdminColorsController {
	@Autowired
	ColorsServiceImp colorsService;

	// fill all Colors

	@GetMapping("/")
	public ResponseEntity<Iterable<Colors>> getAllCategories() {
		return new ResponseEntity<Iterable<Colors>>(colorsService.findAll(), HttpStatus.OK);
	}

	// search id
	@GetMapping("/{id}")
	public ResponseEntity<Colors> getColorsById(@PathVariable int id) {
		Optional<Colors> ColorsOptional = colorsService.findById(id);
		return ColorsOptional.map(a -> new ResponseEntity<>(a, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// create Colors
	@PostMapping("/create")
	public ResponseEntity<Colors> createColors(@RequestBody Colors Colors) {
		return new ResponseEntity<Colors>(colorsService.save(Colors), HttpStatus.OK);
	}

	// update by id
	@PutMapping("/{id}")
	public ResponseEntity<Colors> updateColors(@PathVariable int id, @RequestBody Colors colors) {
		Optional<Colors> colorsOptional = colorsService.findById(id);
		return colorsOptional.map(a -> {
			return new ResponseEntity<>(colorsService.save(colors), HttpStatus.OK);
		}).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// delete by id
	@DeleteMapping("/{id}")
	public ResponseEntity<Colors> deleteColors(@PathVariable int id) {
		Optional<Colors> ColorsOptional = colorsService.findById(id);
		return ColorsOptional.map(a -> {
			colorsService.remove(id);
			return new ResponseEntity<>(a, HttpStatus.OK);
		}).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
}
