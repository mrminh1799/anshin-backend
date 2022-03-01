package com.anshinbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table( name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "product_name")
    String productName;
    @Column(name = "description")
    String description;

    @Column (name = "is_deleted")
    Boolean isDelete;

    @Column(name = "image")
    String image;

    @JsonIgnore
    @OneToMany(mappedBy = "product" , fetch = FetchType.EAGER)
    List<DetailProduct> listProductDetails;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    List<Favorite> listFavorite;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    List<Comment> listComment;

    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category;

}
