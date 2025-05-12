package com.learn.java8;

public class Employee {

	String name;
	String Department;
	int age;
	int salary;
	boolean isPermanent;
	public Employee(String name, String department, int age, int salary, boolean isPermanent) {
		super();
		this.name = name;
		Department = department;
		this.age = age;
		this.salary = salary;
		this.isPermanent = isPermanent;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isPermanent() {
		return isPermanent;
	}
	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Department=" + Department + ", age=" + age + ", salary=" + salary
				+ ", isPermanent=" + isPermanent + "]";
	}
	
}
