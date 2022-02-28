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

import com.anshinbackend.entity.CartItems;
import com.anshinbackend.service.impl.CartItemServiceImp;


@RestController
@RequestMapping("/admin/CartItems")
public class AdminCartItemController {
	@Autowired
	CartItemServiceImp cartItemsService;

	// fill all CartItems
	@GetMapping("/")
	public ResponseEntity<Iterable<CartItems>> getAllCartItems() {
		return new ResponseEntity<Iterable<CartItems>>(cartItemsService.findAll(), HttpStatus.OK);
	}

	// search id
	@GetMapping("/{id}")
	public ResponseEntity<CartItems> getCartItemsById(@PathVariable int id) {
		Optional<CartItems> CartItemsOptional = cartItemsService.findById(id);
		return CartItemsOptional.map(a -> new ResponseEntity<>(a, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// create CartItems
	@PostMapping("/create")
	public ResponseEntity<CartItems> createCartItems(@RequestBody CartItems CartItems) {
		return new ResponseEntity<CartItems>(cartItemsService.save(CartItems), HttpStatus.OK);
	}

	// update by id
	@PutMapping("/{id}")
	public ResponseEntity<CartItems> updateCartItems(@PathVariable int id, @RequestBody CartItems cartItems) {
		Optional<CartItems> cartItemsOptional = cartItemsService.findById(id);
		return cartItemsOptional.map(a -> {
			return new ResponseEntity<>(cartItemsService.save(cartItems), HttpStatus.OK);
		}).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// delete by id
	@DeleteMapping("/{id}")
	public ResponseEntity<CartItems> deleteCartItems(@PathVariable int id) {
		Optional<CartItems> cartItemsOptional = cartItemsService.findById(id);
		return cartItemsOptional.map(a -> {
			cartItemsService.remove(id);
			return new ResponseEntity<>(a, HttpStatus.OK);
		}).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
}
