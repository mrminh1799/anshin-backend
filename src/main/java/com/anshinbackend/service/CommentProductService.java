package com.anshinbackend.service;

import com.anshinbackend.entity.Comment;

public interface CommentProductService {

	void delete(int id);

	Comment findById(int id);

	Comment addNew(Comment comment);

}
