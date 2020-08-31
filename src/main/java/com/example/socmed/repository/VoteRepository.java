package com.example.socmed.repository;

import com.example.socmed.model.Post;
import com.example.socmed.model.User;
import com.example.socmed.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
