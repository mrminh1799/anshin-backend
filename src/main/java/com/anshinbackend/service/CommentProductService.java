package com.anshinbackend.service;

import com.anshinbackend.entity.Comment;

import java.util.List;


public interface CommentProductService {



	void delete(int id);

	Comment findById(Integer id);

	Comment addNew(Comment comment);
	List<Comment> findAll();

	List<Comment> getAllByProductId(int id);
}
