package com.hsp.test;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hsp.domain.Department;
import com.hsp.domain.Employee;
import com.hsp.service.Interface.DepartmentServiceInterface;
import com.hsp.service.Interface.EmployeeServiceInterface;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		DepartmentServiceInterface departmentServiceInterface=(DepartmentServiceInterface) context.getBean("departmentService");
		EmployeeServiceInterface employeeServiceInterface=(EmployeeServiceInterface) context.getBean("employeeService");
		Employee employee=new Employee("a", "vv@yahoo.com", new java.util.Date(), 33243.13f, "123", 1);
		Employee employee2=new Employee("b", "vv@yahoo.com", new java.util.Date(), 33243.13f, "123", 1);
		Employee employee3=new Employee("c", "vv@yahoo.com", new java.util.Date(), 33243.13f, "123", 1);
		
		//employeeServiceInterface.addEmployee(employee);
		//employeeServiceInterface.addEmployee(employee2);
		//employeeServiceInterface.addEmployee(employee3);
		
		Department department=new Department("math");
		
		//departmentServiceInterface.addDepartment(department);
		
	}

}
