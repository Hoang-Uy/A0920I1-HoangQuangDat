package com.codegym.demoa09jpa.repository;

import com.codegym.demoa09jpa.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
