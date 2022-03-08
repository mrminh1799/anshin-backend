package com.anshinbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.anshinbackend.dao.CommentProductDAO;
import com.anshinbackend.entity.Comment;
import com.anshinbackend.service.CommentProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentProductServiceImp implements CommentProductService{
	@Autowired
	CommentProductDAO commentDAO;
	@Override
	public Comment addNew(Comment comment) {
			return commentDAO.save(comment);
		}

	@Override
	public List<Comment> findAll() {
		return commentDAO.findAll();
	}


	@Override
	public Comment findById(Integer id) {
		return commentDAO.findById(id).get();
	}
	@Override
	public void delete(int id) {
		 commentDAO.deleteById(id);
	}
	@Override
	public List<Comment> getAllByProductId(int id){
		return commentDAO.findCommentsByProductId(id);
	}
}
