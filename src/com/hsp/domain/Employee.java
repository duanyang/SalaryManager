package com.hsp.domain;

import java.util.Date;

public class Employee {
	private String name;
	private Integer id;
	private String email;
	private java.util.Date hireDate;
	private Float salary;
	private String pwd;
	private Integer grade;
	private Department department;
	
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * @return the grade
	 */
	public Integer getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Employee(){
		
	}
	
	public Employee(String name, String email, Date hireDate, Float salary,
			String pwd, Integer grade) {
		
		this.name = name;
		this.email = email;
		this.hireDate = hireDate;
		this.salary = salary;
		this.pwd = pwd;
		this.grade = grade;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the hireDate
	 */
	public java.util.Date getHireDate() {
		return hireDate;
	}
	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(java.util.Date hireDate) {
		this.hireDate = hireDate;
	}
	/**
	 * @return the salary
	 */
	public Float getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Float salary) {
		this.salary = salary;
	}
}
