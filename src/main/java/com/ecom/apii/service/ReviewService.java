package com.ecom.apii.service;

import java.util.List;

import com.ecom.apii.exception.ProductException;
import com.ecom.apii.modal.Review;
import com.ecom.apii.modal.User;
import com.ecom.apii.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
