package Buoi7;

import java.io.Serializable;

public class Employee implements Serializable {
	private String name;
	private int experience;
	private double salary;
	
	public Employee() {
	}
	
	public Employee(String name, int experience, Double salary) {
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}
	
	public String getToString() {
		return String.format("Name is %s, Experience is %d, Salary is %.2f", this.name, this.experience, this.salary);
	}
}
