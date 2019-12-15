package com.programming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programming.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
