package com.anshinbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshinbackend.entity.Comment;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentProductDAO extends JpaRepository<Comment, Integer> {


    List<Comment> findCommentsByProductId(int id);

}
