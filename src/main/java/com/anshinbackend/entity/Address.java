package com.anshinbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="address")
public class Address {
	@Id
	@Column(name="id")
	private int addressId;
	@Column(name="dress_detail")
	private String dressDetail;
	@Column(name="dress_name")
	private String dressName;
	@ManyToOne
	@JoinColumn(name="id")
	private Acount account;
}
