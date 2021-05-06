package com.meit.phone.bean;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cityid;

    @Column(nullable = false)
    private String cityname;

    @Column(nullable = false)
    private String abbr;

    @Column(nullable = false)
    private int state;
}

