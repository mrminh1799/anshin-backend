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

import com.anshinbackend.entity.Comments;
import com.anshinbackend.service.impl.CommentsServiceImp;

@RestController
@RequestMapping("/admin/comments")
public class AdminCommentsController {
	@Autowired
	CommentsServiceImp commentsService;

	// fill all Comments
	@GetMapping("/")
	public ResponseEntity<Iterable<Comments>> getAllComments() {
		return new ResponseEntity<Iterable<Comments>>(commentsService.findAll(), HttpStatus.OK);
	}

	// search id
	@GetMapping("/{id}")
	public ResponseEntity<Comments> getCommentsById(@PathVariable int id) {
		Optional<Comments> CommentsOptional = commentsService.findById(id);
		return CommentsOptional.map(a -> new ResponseEntity<>(a, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// create Comments
	@PostMapping("/create")
	public ResponseEntity<Comments> createComments(@RequestBody Comments Comments) {
		return new ResponseEntity<Comments>(commentsService.save(Comments), HttpStatus.OK);
	}

	// update by id
	@PutMapping("/{id}")
	public ResponseEntity<Comments> updateComments(@PathVariable int id, @RequestBody Comments Comments) {
		Optional<Comments> commentsOptional = commentsService.findById(id);
		return commentsOptional.map(a -> {
			return new ResponseEntity<>(commentsService.save(Comments), HttpStatus.OK);
		}).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	// delete by id
	@DeleteMapping("/{id}")
	public ResponseEntity<Comments> deleteComments(@PathVariable int id) {
		Optional<Comments> commentsOptional = commentsService.findById(id);
		return commentsOptional.map(a -> {
			commentsService.remove(id);
			return new ResponseEntity<>(a, HttpStatus.OK);
		}).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
}
