package com.anshinbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="categories")
public class Categories {
	@Id
	@Column(name="id")
	private int categoryId;
	@Column(name="category_name")
	private String categoryName;
	@Column(name="category_parent_id")
	private int categoryParentId;
	@Column(name="is_deleted")
	private boolean isDeleted;
}
