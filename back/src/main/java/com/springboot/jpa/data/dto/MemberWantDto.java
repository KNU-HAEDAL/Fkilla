package com.springboot.jpa.data.dto;
import com.springboot.jpa.data.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class MemberWantDto {
    private int part;

    private int company;

    private int license;

    public static MemberWantDto of(int part, int company, int license){
        return new MemberWantDto(part, company, license);
    }

    public Member toEntity(MemberWantDto memberWantDto){
        return Member.builder()
                .part(part)
                .company(company)
                .license(license)
                .build();
    }
}
