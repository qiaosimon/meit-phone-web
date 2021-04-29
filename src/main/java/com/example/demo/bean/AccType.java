package com.example.demo.bean;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "AccType")
public class AccType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String code;

    @Column(nullable = false)
    private String name;
}
