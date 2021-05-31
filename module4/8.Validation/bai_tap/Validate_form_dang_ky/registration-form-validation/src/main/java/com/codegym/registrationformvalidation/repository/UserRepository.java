package com.codegym.registrationformvalidation.repository;

import com.codegym.registrationformvalidation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
