package com.lck.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lck.springcourse.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
