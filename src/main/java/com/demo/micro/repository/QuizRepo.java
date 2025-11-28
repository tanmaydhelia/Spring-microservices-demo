package com.demo.micro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.micro.model.Quiz;

public interface QuizRepo extends MongoRepository<Quiz, String>{
	
}
