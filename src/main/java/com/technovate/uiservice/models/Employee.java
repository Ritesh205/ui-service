package com.technovate.uiservice.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {

    @Id
    private int id;
    private String name;
    private String address;
    private int salary;

    @OneToOne
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    Role role;
}
