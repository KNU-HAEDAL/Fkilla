package com.springboot.jpa.service;

import com.springboot.jpa.data.dto.ReviewDto;
import com.springboot.jpa.data.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }


    public Optional<ReviewDto> findReview(String name){
        return reviewRepository.findByReviewName(name);
    }

}
