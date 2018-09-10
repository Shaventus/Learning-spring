package com.Sha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sha.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
