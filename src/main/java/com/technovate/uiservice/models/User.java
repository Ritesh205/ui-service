package com.technovate.uiservice.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String name;
    private String email;
    private String password;
    private String address;

    @OneToOne
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    Role role;
}
