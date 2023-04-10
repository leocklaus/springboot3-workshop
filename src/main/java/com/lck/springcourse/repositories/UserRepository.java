package com.lck.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lck.springcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
