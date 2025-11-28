package com.demo.micro.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Data;

@Document(collection = "Quiz")
@Data
public class Quiz {

	@Id
	private String id;
	
	private String title;
	
	@DBRef
	private List<Question> questions;

}