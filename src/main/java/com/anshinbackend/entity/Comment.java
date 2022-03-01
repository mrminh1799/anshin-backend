package com.anshinbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "content")
    private String content;
    @Column(name = "timeCreate")
    private Date timeCreate;

    @ManyToOne
    @JoinColumn(name="id_acount")
    private Acount account;
    @ManyToOne
    @JoinColumn(name="id_product")
    private Product product;

}
