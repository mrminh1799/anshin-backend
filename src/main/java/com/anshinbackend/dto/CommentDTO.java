package com.anshinbackend.dto;

import java.util.Date;

import com.anshinbackend.entity.Acount;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
    private int id;
    private String content;
    private Date timeCreate;
    private Acount account;

}
