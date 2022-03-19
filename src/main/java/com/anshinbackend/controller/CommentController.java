package com.anshinbackend.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;

import com.anshinbackend.dto.CommentDTO;
import com.anshinbackend.entity.Acount;

import com.anshinbackend.service.impl.CommentProductServiceImp;

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

import com.anshinbackend.entity.Comment;


import java.util.List;

@RestController
@RequestMapping("/auth/comment")
public class CommentController {
	@Autowired
	CommentProductServiceImp commentService;

	@Autowired
	ModelMapper modelMapper;

	@PostMapping("/addNew")
	public ResponseEntity<Comment> insert(@RequestBody Comment comment) {
		return ResponseEntity.ok().body(commentService.addNew(comment));
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Comment> delete(@PathVariable Integer id) {
		commentService.delete(id);
		return ResponseEntity.ok().body(null);

	}


	@GetMapping("/findById/{id_product}")
	public ResponseEntity<List<Comment>> findById(@PathVariable("id_product") Integer id) {
		return ResponseEntity.ok(commentService.getAllByProductId(id));
	}

	@GetMapping("/getByAccountAndProduct/{id_acount}/{id_product}")
	public ResponseEntity<List<CommentDTO>> findByAccAndProduct(@PathVariable("id_acount")int id_acc, @PathVariable("id_product")int id_pro) {
		
		return ResponseEntity.ok(commentService.getAllCommentByAccountAndProduct(id_acc, id_pro).stream().map(comment -> modelMapper.map(comment,CommentDTO.class)).collect(Collectors.toList()));
	
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Comment> update(@PathVariable("id") int id,@RequestBody Comment comment){
		Comment c= commentService.findById(id);
		c.setContent(comment.getContent());
		c.setTimeCreate(comment.getTimeCreate());
		return ResponseEntity.ok().body(commentService.update(comment));

	}
	

}
