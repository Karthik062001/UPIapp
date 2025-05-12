package com.learn.java8;

import java.util.List;

public class NewEmp {

	String name;
	String Department;
	int salary;
	List<String>skills;
	public NewEmp(String name, String department, int salary, List<String> skills) {
		super();
		this.name = name;
		Department = department;
		this.salary = salary;
		this.skills = skills;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "NewEmp [name=" + name + ", Department=" + Department + ", salary=" + salary + ", skills=" + skills
				+ "]";
	}
	
	
}
