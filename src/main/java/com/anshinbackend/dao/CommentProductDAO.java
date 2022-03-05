package com.anshinbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshinbackend.entity.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentProductDAO extends JpaRepository<Comment, Integer> {

}
