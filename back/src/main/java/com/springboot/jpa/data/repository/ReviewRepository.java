package com.springboot.jpa.data.repository;

import com.springboot.jpa.data.dto.ReviewDto;
import com.springboot.jpa.data.entity.License;
import com.springboot.jpa.data.entity.Member;
import com.springboot.jpa.data.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReviewRepository  extends JpaRepository<Review, String> {
    Optional<ReviewDto> findByReviewName(String name);
}
