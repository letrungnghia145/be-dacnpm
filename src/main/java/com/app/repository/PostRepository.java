package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.app.model.post.Post;

@EnableJpaRepositories
public interface PostRepository extends JpaRepository<Post, Long> {
	
}
