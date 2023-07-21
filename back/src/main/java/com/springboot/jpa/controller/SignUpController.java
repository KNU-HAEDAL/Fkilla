package com.springboot.jpa.controller;

import com.springboot.jpa.data.dto.MemberDto;
import com.springboot.jpa.data.dto.MemberResponseDto;
import com.springboot.jpa.data.dto.MemberWantDto;
import com.springboot.jpa.data.entity.Member;
import com.springboot.jpa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sign-up")
public class SignUpController {

    private final MemberService memberService;

    @Autowired
    public SignUpController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping()
    public long createMember(@RequestBody MemberDto memberDto) {
        Member member;
        memberService.sign(member = memberDto.toEntity(memberDto));
        return member.getId();
    }



}
