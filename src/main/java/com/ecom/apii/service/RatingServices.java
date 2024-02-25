package com.ecom.apii.service;

import java.util.List;

import com.ecom.apii.exception.ProductException;
import com.ecom.apii.modal.Rating;
import com.ecom.apii.modal.User;
import com.ecom.apii.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
