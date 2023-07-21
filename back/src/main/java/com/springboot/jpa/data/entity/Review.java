package com.springboot.jpa.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    private String review1;
    private String review2;
    private String review3;
    private String review4;
    private String review5;
    private String review6;
    private String review7;
    private String review8;
    private String review9;
    private String review10;
    private String review11;
    private String review12;
    private String review13;
    private String review14;
    private String review15;
    private String review16;
    private String review17;
    private String review18;
    private String review19;
    private String review20;

}
