package com.example.exampleService.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api")
public class exampleController {
	
	@RequestMapping("/user")
	public ResponseEntity<String>getSubjects() throws JsonProcessingException{
		
		Map<String, String> map = new HashMap<>();
		
		map.put("A", "Java");
		map.put("B", "ESB");
		map.put("C", "Openshift");
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(map);
		
		return new ResponseEntity<String>(json,HttpStatus.OK);
		
		
	}

}
