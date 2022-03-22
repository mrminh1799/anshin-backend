package com.anshinbackend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anshinbackend.dao.AcountDAO;
import com.anshinbackend.dao.CommentProductDAO;
import com.anshinbackend.entity.Acount;
import com.anshinbackend.entity.Comment;
import com.anshinbackend.service.CommentProductService;

@Service
public class CommentProductServiceImp implements CommentProductService{
	@Autowired
	private CommentProductDAO commentDAO;
	@Autowired
	private AcountDAO accountDAO;
	
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
	
	@Override
	public Comment update(Comment comment) {
		return commentDAO.save(comment);
	}
	
	@Override
	public List<Comment> getAllCommentByIdAccount(Acount account){
		return commentDAO.findAllByAccount(account);
	}
	@Override
	public List<Comment> getAllCommentByIdAccount(int accountId){
		Acount account= accountDAO.getById(accountId);
		return commentDAO.findAllByAccount(account);
	}
	
	@Override
	public List<Comment> getAllCommentByAccountAndProduct(int productId,int accountId){
		return commentDAO.findAllCommentsByAccountAndProduct(accountId, productId);
	}
}
