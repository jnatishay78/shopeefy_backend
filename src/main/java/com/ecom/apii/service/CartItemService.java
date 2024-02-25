package com.ecom.apii.service;

import com.ecom.apii.exception.CartItemException;
import com.ecom.apii.exception.UserException;
import com.ecom.apii.modal.Cart;
import com.ecom.apii.modal.CartItem;
import com.ecom.apii.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
