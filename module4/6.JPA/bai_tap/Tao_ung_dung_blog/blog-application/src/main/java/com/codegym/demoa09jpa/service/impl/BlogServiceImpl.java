package com.codegym.demoa09jpa.service.impl;

import com.codegym.demoa09jpa.model.Blog;
import org.springframework.stereotype.Service;

import com.codegym.demoa09jpa.model.Blog;
import com.codegym.demoa09jpa.repository.BlogRepository;
import com.codegym.demoa09jpa.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> findAllBlog() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findBlogById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void saveBlog(Blog blog){
        blogRepository.save(blog);
    }

    @Override
    public void updateBlog(int id, Blog blog){

    }

    @Override
    public void deleteBlog(int id) {
        blogRepository.deleteById(id);
    }

}
