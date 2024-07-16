package com.ron.fullstack_backend.repository;

import com.ron.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository has all the methods and we pass on the type of model along with the type of primary key
public interface UserRepository extends JpaRepository<User,Long> {
}
