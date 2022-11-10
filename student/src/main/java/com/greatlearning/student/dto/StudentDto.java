package com.greatlearning.student.dto;

public class StudentDto {

	private String name;

	private String department;

	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public StudentDto() {

	}

	public StudentDto(String name, String department, String country) {
		super();
		this.name = name;
		this.department = department;
		this.country = country;
	}

}
