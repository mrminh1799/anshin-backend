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
@Table
@Entity(name="colors")
public class Colors {
	@Id
	@Column(name="id")
	private int colorId;
	@Column(name="color_name")
	private String colorName;
}
