package com.lck.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lck.springcourse.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
