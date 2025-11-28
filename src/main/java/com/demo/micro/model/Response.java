package com.demo.micro.model;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Response {
	@Id
    private String id;
	private String rightAnswer;
}
