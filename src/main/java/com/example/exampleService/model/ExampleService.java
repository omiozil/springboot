package com.example.exampleService.model;

public class ExampleService {

	private String name;
	private String desc;
	private String rating;
	
	public ExampleService() {
		
	}
	
	public ExampleService(String name, String desc, String rating) {
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

}
