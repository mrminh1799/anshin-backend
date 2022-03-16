package com.anshinbackend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anshinbackend.entity.Acount;
import com.anshinbackend.entity.Comment;

@Repository
public interface CommentProductDAO extends JpaRepository<Comment, Integer> {


    List<Comment> findCommentsByProductId(int id);
    @Query(value="Select * from Comments c where c.id_acount=?1")
    List<Comment> findAllByAccount(Acount account);
    @Query(value="Select * from Comments c where c.id_acount=?1 and c.id_product=?2")
    List<Comment> findAllCommentsByAccountAndProduct(int accountId, int prouductId);
}
