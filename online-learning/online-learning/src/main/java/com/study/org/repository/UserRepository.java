package com.study.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.org.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
