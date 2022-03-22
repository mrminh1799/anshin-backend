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

	Comment update(Comment comment);

	List<Comment> getAllCommentByIdAccount(int accountId);

	List<Comment> getAllCommentByIdAccount(Acount account);

	List<Comment> getAllCommentByAccountAndProduct(int productId, int accountId);
}
