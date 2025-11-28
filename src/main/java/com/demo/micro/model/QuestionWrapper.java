package com.demo.micro.model;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class QuestionWrapper {
	@Id
    private String id;
	
	private String questionTitle;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	
}