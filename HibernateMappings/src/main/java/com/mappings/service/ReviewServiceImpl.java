package com.mappings.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.mappings.entity.ReviewEntity;
import com.mappings.model.ReviewModel;
import com.mappings.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {

	private ReviewRepository reviewRepo;

	@Override
	public Integer saveReviewDtls(Integer id, ReviewModel reviewModel) {
	
		ReviewEntity reviewEntity=new ReviewEntity();
		BeanUtils.copyProperties(reviewModel, reviewEntity);
			
		return reviewRepo.save(reviewEntity).getId();
	}

}
