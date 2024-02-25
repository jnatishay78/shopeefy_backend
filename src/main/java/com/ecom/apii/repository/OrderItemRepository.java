package com.ecom.apii.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.apii.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
