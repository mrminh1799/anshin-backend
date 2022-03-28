package com.anshinbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table( name = "role_acount")
public class RoleAcount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @ManyToOne
    @JoinColumn(name = "role_id")
    Role role;

    @ManyToOne
    @JoinColumn(name="acount_id")
    Acount acount;

    public RoleAcount(Role role, Acount acount) {
        this.role = role;
        this.acount = acount;
    }
}
