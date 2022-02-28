package com.anshinbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshinbackend.entity.Comments;

public interface CommentsDAO extends JpaRepository<Comments, Integer>{

}
