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

import com.anshinbackend.entity.Cart;
import com.anshinbackend.service.impl.CartServiceImp;

@RestController
@RequestMapping("/admin/cart")
public class AdminCartController {
	@Autowired
	CartServiceImp cartService;

	// fill all Cart
	@GetMapping("/")
	public ResponseEntity<Iterable<Cart>> getAllCart() {
		return new ResponseEntity<Iterable<Cart>>(cartService.findAll(), HttpStatus.OK);
	}

	// search id
	@GetMapping("/{id}")
	public ResponseEntity<Cart> getCartById(@PathVariable int id) {
		Optional<Cart> CartOptional = cartService.findById(id);
		return CartOptional.map(a -> new ResponseEntity<>(a, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// create Cart
	@PostMapping("/create")
	public ResponseEntity<Cart> createCart(@RequestBody Cart Cart) {
		return new ResponseEntity<Cart>(cartService.save(Cart), HttpStatus.OK);
	}

	// update by id
	@PutMapping("/{id}")
	public ResponseEntity<Cart> updateCart(@PathVariable int id, @RequestBody Cart Cart) {
		Optional<Cart> CartOptional = cartService.findById(id);
		return CartOptional.map(a -> {
			return new ResponseEntity<>(cartService.save(Cart), HttpStatus.OK);
		}).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// delete by id
	@DeleteMapping("/{id}")
	public ResponseEntity<Cart> deleteCart(@PathVariable int id) {
		Optional<Cart> CartOptional = cartService.findById(id);
		return CartOptional.map(a -> {
			cartService.remove(id);
			return new ResponseEntity<>(a, HttpStatus.OK);
		}).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
}
