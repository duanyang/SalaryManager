package com.hsp.service.Interface;

import com.hsp.basic.basicServiceInterface;
import com.hsp.domain.Employee;
import java.util.List;


public interface EmployeeServiceInterface extends basicServiceInterface {
	
	public Employee checkEmployee(Employee e);
	
	public List showEmployeeList(int pageSize, int pageNow);
	
	public int getPageCount(int pageSize);
	
	
}
