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
    @Column(name = "category_id")
    Integer categoryId;
    @Column (name = "is_deleted")
    Boolean isDelete;

    @JsonIgnore
    @OneToMany(mappedBy = "product" , fetch = FetchType.EAGER)
    List<DetailProduct> listProductDetails;

}
