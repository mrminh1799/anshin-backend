package com.anshinbackend.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="comments")
public class Comments {
	private int commentId;
	private String content;
	private LocalDate timeCreate;
	@ManyToOne
	@JoinColumn(name="id")
	private Account account;
	@ManyToOne
	@JoinColumn(name="id")
	private Product product;
	
}
