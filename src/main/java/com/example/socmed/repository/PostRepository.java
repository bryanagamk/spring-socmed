package com.example.socmed.repository;

import com.example.socmed.model.Post;
import com.example.socmed.model.Subblues;
import com.example.socmed.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubblues(Subblues subblues);

    List<Post> findByUser(User user);
}
