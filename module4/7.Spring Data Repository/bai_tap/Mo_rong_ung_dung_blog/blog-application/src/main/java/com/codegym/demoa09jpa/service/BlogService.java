package com.codegym.demoa09jpa.service;

import com.codegym.demoa09jpa.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAllBlog();
    Blog findBlogById(int id);
    void saveBlog(Blog blog);
    void updateBlog(int id, Blog blog);
    void deleteBlog(int id);
}
