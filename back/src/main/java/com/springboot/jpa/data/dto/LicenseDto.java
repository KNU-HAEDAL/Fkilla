package com.springboot.jpa.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class LicenseDto {

    private String name;

    private int part;

    private String engName;

    private Integer belonging;

    private String agency;

    private String qualifi1;

    private String qualifi2;

    private String passQauli1;

    private String passQauli2;

    private Integer price;

    private String howTo1;

    private String howTo2;

    private Integer duaration;

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
