package com.anshinbackend.controller.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anshinbackend.entity.Comment;
import com.anshinbackend.service.CommentProductService;

@RestController
@RequestMapping("/auth/comment")
public class CommentController {
	@Autowired
	CommentProductService commentService;

	@PostMapping("/addNew")
	public ResponseEntity<Comment> insert(@RequestBody Comment comment) {
		return ResponseEntity.ok().body(commentService.addNew(comment));
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Comment> update(@PathVariable Integer id) {
		commentService.delete(id);
		return ResponseEntity.ok().body(null);

	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<Comment> findById(@PathVariable("id") Integer id) {
		return ResponseEntity.ok().body(commentService.findById(id));
	}
}
