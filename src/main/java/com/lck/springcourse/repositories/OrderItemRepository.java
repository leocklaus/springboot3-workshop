package com.lck.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lck.springcourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
