package com.anshinbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "acounts")
@Entity
@Data
public class Acount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "photo")
    private String photo;

    @JsonIgnore
    @OneToMany(mappedBy = "acount")
    List<RoleAcount> roleAcounts;

    @OneToMany(mappedBy = "acount")
    @JsonIgnore
    List<Address> listAddress;

    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<Favorite> listFavorite;

    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<Comment> listComment;
    
    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<CartItem> listCartItem;
    @JsonIgnore
    @OneToMany(mappedBy = "acount")
    List<Order> listOrder;



}
