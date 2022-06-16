package com.h2kinfosys.spring2;

public class Greetings {
	
	private String language;
	private String state;
	
	public Greetings(String language, String state) {
		this.language = language;
		this.setState(state);
	}
	
	public Greetings(String language) {
		this.language = language;
	}
	
	
	public void start() {
		System.out.println("Making sure Greetings defined in language Map");
	}
	
	
	
	public void sayHello() {
		if(this.language.equals("English")) {
			System.out.println("Hello!");
		}else {
			System.out.println("Hola!");
		}
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void destroy() {
		System.out.println("Destoy Greetings");
	}

}
