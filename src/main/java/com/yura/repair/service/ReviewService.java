package com.yura.repair.service;

import com.yura.repair.dto.ReviewDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ReviewService {

    void add(ReviewDto reviewDto);

    Page<ReviewDto> findAll(Pageable pageable);

    void delete(ReviewDto reviewDto);
}
