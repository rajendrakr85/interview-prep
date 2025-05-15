package com.pack;

import java.util.Objects;

public class Employee {
	Integer id;
	String dept;
	Integer salary;
	
	public Employee(Integer id,String dept, Integer salary) {
		super();
		this.id=id;
		this.dept = dept;
		salary = salary;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSalary(Integer salary) {
		salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public Integer getSalary() {
		return salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id,this.dept,this.salary);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Employee)) {
			return false;
		}
		Employee e=(Employee)obj;
		return e.id==this.id && e.dept.equalsIgnoreCase(this.dept) && e.salary==this.salary;
	}
}
