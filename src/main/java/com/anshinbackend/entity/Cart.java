package com.anshinbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cart")
public class Cart {

    @Id
    @Column(name="id")
    private Integer id;

    @JsonIgnore
    @OneToMany(mappedBy = "cart")
    List<CartItem> listCartItem;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_acount", referencedColumnName = "id")
    private Acount acount;


}
