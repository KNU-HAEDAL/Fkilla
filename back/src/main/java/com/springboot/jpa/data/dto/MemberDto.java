package com.springboot.jpa.data.dto;

import com.springboot.jpa.data.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;

import static java.sql.Types.NULL;

// 예제 6.19
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class MemberDto {

    private String memberID;
    private String name;
    private String password;
    private String phoneNumber;

    public Member toEntity(MemberDto memberDto){
        return Member.builder()
                .memberID(memberID)
                .name(name)
                .password(password)
                .phoneNumber(phoneNumber)
                .part(NULL)
                .license(NULL)
                .company(NULL)
                .build();
    }

}
