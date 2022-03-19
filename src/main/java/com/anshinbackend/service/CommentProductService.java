package com.anshinbackend.service;


import java.util.List;

import com.anshinbackend.entity.Acount;

import com.anshinbackend.entity.Comment;


public interface CommentProductService {



	void delete(int id);

	Comment findById(Integer id);

	Comment addNew(Comment comment);
	List<Comment> findAll();

	List<Comment> getAllByProductId(int id);
}
