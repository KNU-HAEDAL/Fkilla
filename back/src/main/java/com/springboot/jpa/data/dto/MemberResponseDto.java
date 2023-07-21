package com.springboot.jpa.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// 예제 6.20
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberResponseDto {

    private String ID;

    private String name;

    private String password;

    private Integer part;

    private Integer company;

    private Integer license;

}
