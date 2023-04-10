package com.lck.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lck.springcourse.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
