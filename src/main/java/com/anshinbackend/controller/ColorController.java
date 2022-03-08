package com.anshinbackend.controller;

import java.util.List;

import com.anshinbackend.service.impl.ColorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anshinbackend.entity.Color;


@RestController
@RequestMapping("/color")
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
}
