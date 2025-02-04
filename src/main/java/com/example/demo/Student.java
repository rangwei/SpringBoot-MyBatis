package com.example.demo;

import lombok.Data;

@Data
public class Student {
	
	private Long id;
	private String name;
	private String passportNumber;
	
	public Student() {
		super();
	}

	public Student(Long id, String name, String passportNumber) {
		super();
		this.id = id;
		this.name = name;
		this.passportNumber = passportNumber;
	}

	public Student(String name, String passportNumber) {
		super();
		this.name = name;
		this.passportNumber = passportNumber;
	}
	
	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, passportNumber=%s]", id, name, passportNumber);
	}

}
