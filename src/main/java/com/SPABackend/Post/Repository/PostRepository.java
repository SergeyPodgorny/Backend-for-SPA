package com.SPABackend.Post.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SPABackend.Post.Entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}