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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cart_items")
public class CartItems {
	@Id
	@Column(name="id")
	private int cartItemId;
	private int quantity;
	@ManyToOne
	@JoinColumn(name="id")
	private Cart cart;
	@ManyToOne
	@JoinColumn(name="id")
	private DetailProduct productDetail;
}
