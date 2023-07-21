package com.springboot.jpa.controller;

import com.springboot.jpa.data.dto.MemberDto;
import com.springboot.jpa.data.dto.MemberResponseDto;
import com.springboot.jpa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final MemberService memberService;

    @Autowired
    public LoginController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping()
    public String getMember(@RequestBody MemberDto memberDto) {
        if(memberService.findMember(memberDto))
            return "로그인 성공하였습니다.";
        else return "로그인 실패하였습니다.";
    }

}
