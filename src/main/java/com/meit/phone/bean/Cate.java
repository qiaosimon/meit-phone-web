package com.meit.phone.bean;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cate")
public class Cate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cateid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int count;
}
