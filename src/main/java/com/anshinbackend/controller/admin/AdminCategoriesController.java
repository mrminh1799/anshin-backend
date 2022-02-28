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
import com.anshinbackend.service.impl.CategoriesServiceImp;

@RestController
@RequestMapping("/admin/categories")
public class AdminCategoriesController {
	@Autowired
	CategoriesServiceImp categoriesService;

	// fill all Categories
	@GetMapping("/")
	public ResponseEntity<Iterable<Categories>> getAllCategories() {
		return new ResponseEntity<Iterable<Categories>>(categoriesService.findAll(), HttpStatus.OK);
	}

	// search id
	@GetMapping("/{id}")
	public ResponseEntity<Categories> getCategoriesById(@PathVariable int id) {
		Optional<Categories> CategoriesOptional = categoriesService.findById(id);
		return CategoriesOptional.map(a -> new ResponseEntity<>(a, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// create Categories
	@PostMapping("/create")
	public ResponseEntity<Categories> createCategories(@RequestBody Categories Categories) {
		return new ResponseEntity<Categories>(categoriesService.save(Categories), HttpStatus.OK);
	}

	// update by id
	@PutMapping("/{id}")
	public ResponseEntity<Categories> updateCategories(@PathVariable int id, @RequestBody Categories categories) {
		Optional<Categories> categoriesOptional = categoriesService.findById(id);
		return categoriesOptional.map(a -> {
			return new ResponseEntity<>(categoriesService.save(categories), HttpStatus.OK);
		}).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// delete by id
	@DeleteMapping("/{id}")
	public ResponseEntity<Categories> deleteCategories(@PathVariable int id) {
		Optional<Categories> categoriesOptional = categoriesService.findById(id);
		return categoriesOptional.map(a -> {
			categoriesService.remove(id);
			return new ResponseEntity<>(a, HttpStatus.OK);
		}).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
}
