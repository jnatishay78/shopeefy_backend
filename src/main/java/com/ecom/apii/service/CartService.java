package com.ecom.apii.service;

import com.ecom.apii.exception.ProductException;
import com.ecom.apii.modal.Cart;
import com.ecom.apii.modal.CartItem;
import com.ecom.apii.modal.User;
import com.ecom.apii.request.AddItemRequest;//

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
