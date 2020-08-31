package com.example.socmed.repository;

import com.example.socmed.model.Subblues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubbluesRepository extends JpaRepository<Subblues, Long> {
    Optional<Subblues> findByName(String subbluesName);
}
