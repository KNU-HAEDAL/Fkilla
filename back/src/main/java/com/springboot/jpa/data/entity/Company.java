package com.springboot.jpa.data.entity;

import lombok.*;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "company")

public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Integer num;

    @Column(nullable = false)
    private String name;

    private int needLicense1;
    private int needLicense2;
    private int needLicense3;
    private int needLicense4;
    private int needLicense5;
    private int needLicense6;
    private int needLicense7;
    private int needLicense8;
    private int needLicense9;
    private int needLicense10;

}
