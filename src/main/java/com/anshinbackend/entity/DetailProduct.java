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
@Table( name = "detail_products")
public class DetailProduct {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "quantity")
    Integer quantity;

    @Column(name="import_price")
    Integer importPrice;

    @Column(name = "export_price")
    Integer exportPrice;




    @Column(name = "is_deleted")
    Boolean isDeleted;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_product")
    Product product;


    @JsonIgnore
    @OneToMany(mappedBy = "detailProduct")
    List<Discount> listDiscount;

    @ManyToOne
    @JoinColumn(name = "id_color")
    Color color;

    @ManyToOne
    @JoinColumn(name = "id_size")
    Size size;

    @Column(name = "image")
    String image;

    @JsonIgnore
    @OneToMany(mappedBy = "detailProduct")
    List<CartItem> listCartItems;

    @JsonIgnore
    @OneToMany(mappedBy = "detailProduct")
    List<OrderDetail> listOrderDetail;






}
