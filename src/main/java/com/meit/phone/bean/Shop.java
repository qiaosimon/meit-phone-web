package com.meit.phone.bean;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(nullable = false)
    private String shopname;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private int cityid;

    @Column(nullable = false)
    private int cateid;

    @Column(nullable = false)
    private int avgscore;

    @Column(nullable = false)
    private int comments;

    @Column(nullable = false)
    private int historycouponcount;

    @Column(nullable = false)
    private int state;
}
