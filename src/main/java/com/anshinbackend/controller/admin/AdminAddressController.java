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

import com.anshinbackend.entity.Address;
import com.anshinbackend.service.impl.AddressServiceImp;

@RestController
@RequestMapping("/admin/address")
public class AdminAddressController {
	@Autowired
	AddressServiceImp addressService;

	// fill all address
	@GetMapping("/")
	public ResponseEntity<Iterable<Address>> getAllAddress() {
		return new ResponseEntity<Iterable<Address>>(addressService.findAll(), HttpStatus.OK);
	}

	// search id
	@GetMapping("/{id}")
	public ResponseEntity<Address> getAddressById(@PathVariable int id) {
		Optional<Address> addressOptional = addressService.findById(id);
		return addressOptional.map(a -> new ResponseEntity<>(a, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// create address
	@PostMapping("/create")
	public ResponseEntity<Address> createAddress(@RequestBody Address address) {
		return new ResponseEntity<Address>(addressService.save(address), HttpStatus.OK);
	}

	// update by id
	@PutMapping("/{id}")
	public ResponseEntity<Address> updateAddress(@PathVariable int id, @RequestBody Address address) {
		Optional<Address> addressOptional = addressService.findById(id);
		return addressOptional.map(a -> {
			return new ResponseEntity<>(addressService.save(address), HttpStatus.OK);
		}).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// delete by id
	@DeleteMapping("/{id}")
	public ResponseEntity<Address> deleteAddress(@PathVariable int id) {
		Optional<Address> addressOptional = addressService.findById(id);
		return addressOptional.map(a -> {
			addressService.remove(id);
			return new ResponseEntity<>(a, HttpStatus.OK);
		}).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
}
