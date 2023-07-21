package com.springboot.jpa.data.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

// 예제 6.6, 예제 6.30, 6.31, 6.32, 6.33, 6.34, 6.35, 6.36, 6.37
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "license")

public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int part;

    private String name;

    private String engName;

    @Column(nullable = false)
    private int belonging;

    private String agency;

    private String qualifi1;

    private String qualifi2;

    private String passQauli1;

    private String passQauli2;

    @Column(nullable = false)
    private int price;

    private String howTo1;

    private String howTo2;

    @Column(nullable = true)
    private int duaration;

    private String WhatDo;

    private String Date1;
    private String Date2;
    private String Date3;
    private String Date4;
    private String Date5;
    private String Date6;
    private String Date7;
    private String Date8;
    private String Date9;
    private String Date10;

}
