package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.Feedback;

public interface FeedbackRepo extends JpaRepository<Feedback, Integer>{

}
