package com.springboot.jpa.data.repository;

import com.springboot.jpa.data.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// 예제 6.7
public interface MemberRepository extends JpaRepository<Member, String> {

    Optional<Member> findByMemberID(String memberID);
}
