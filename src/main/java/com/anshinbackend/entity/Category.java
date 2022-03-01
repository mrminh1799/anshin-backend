package com.anshinbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name="category_name")
    private String categoryName;
    @Column(name="category_parent_id")
    private Integer categoryParentId;
    @Column(name="is_deleted")
    private boolean isDeleted;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    List<Product> listProduct;
}
