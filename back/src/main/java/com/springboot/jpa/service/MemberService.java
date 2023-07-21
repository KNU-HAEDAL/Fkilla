package com.springboot.jpa.service;

import com.springboot.jpa.data.dto.MemberDto;
import com.springboot.jpa.data.entity.Member;
import com.springboot.jpa.data.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private final MemberRepository memberRepository;
    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    public boolean findMember(MemberDto memberDto) {
        Member member = memberRepository.findByMemberID(memberDto.getMemberID()).orElseThrow();
        if(member.getPassword().equals(memberDto.getPassword())){
            return true;
        }
        return false;
    }

    public void sign(Member member){
        memberRepository.save(member);
    }
    public void modify(Member member) { memberRepository.save(member);}
}
