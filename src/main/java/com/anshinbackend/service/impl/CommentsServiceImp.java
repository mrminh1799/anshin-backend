package com.anshinbackend.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.anshinbackend.dao.CommentsDAO;
import com.anshinbackend.dao.IGenericDAO;
import com.anshinbackend.entity.Comments;

public class CommentsServiceImp implements IGenericDAO<Comments> {
	@Autowired
	private CommentsDAO commentsDAO;
	
	@Override
	public Iterable<Comments> findAll() {
		
		return commentsDAO.findAll();
	}

	@Override
	public Optional<Comments> findById(Integer id) {
		
		return commentsDAO.findById(id);
	}

	@Override
	public Comments save(Comments t) {
		
		return commentsDAO.save(t);
	}

	@Override
	public void remove(Integer id) {
		commentsDAO.deleteById(id);
		
	}
	
	
	

}