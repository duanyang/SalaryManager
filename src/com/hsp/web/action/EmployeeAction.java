package com.hsp.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.hsp.domain.Department;
import com.hsp.domain.Employee;

import com.hsp.service.Interface.DepartmentServiceInterface;
import com.hsp.service.Interface.EmployeeServiceInterface;
import com.hsp.web.forms.EmployeeForm;

public class EmployeeAction extends DispatchAction {
	
	private DepartmentServiceInterface departmentService;
	private EmployeeServiceInterface  employeeService;
	/**
	 * @param employeeService the employeeService to set
	 */
	public void setEmployeeService(EmployeeServiceInterface employeeService) {
		this.employeeService = employeeService;
	}

	/**
	 * @return the service
	 */
	public DepartmentServiceInterface getDepartmentService() {
		return departmentService;
	}

	/**
	 * @param service the service to set
	 */
	public void setDepartmentService(DepartmentServiceInterface service) {
		this.departmentService = service;
	}

	public ActionForward addEmployee(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		return mapping.findForward("goAddEmployee");	
	}
	
	public ActionForward listEmployee(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		String s_pageNow=request.getParameter("pageNow");
		int pageNow=1;
		if(s_pageNow!=null){
			pageNow=Integer.parseInt(s_pageNow);
		}
		
		request.setAttribute("employeeList", employeeService.showEmployeeList(3, pageNow));
		int pageCount=employeeService.getPageCount(3);
		request.setAttribute("pageCount",pageCount);
		return mapping.findForward("goListEmployee");	
	}
	
	public ActionForward deleteEmployee(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		try{
			employeeService.deleteById(Employee.class, Integer.parseInt(id));
		}
		catch(Exception ex){
			return mapping.findForward("operationerror");
		}
		return mapping.findForward("operationok");
	}
	
	public ActionForward update(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		EmployeeForm employeeForm=(EmployeeForm)form;
		
		Employee employee=new Employee();
		employee.setId(Integer.parseInt(employeeForm.getId()));
		employee.setEmail(employeeForm.getEmail());
		employee.setPwd(employeeForm.getPwd());
		employee.setName(employeeForm.getName());
		employee.setGrade(Integer.parseInt(employeeForm.getGrade()));
		employee.setSalary(Float.parseFloat(employeeForm.getSalary()));
		employee.setDepartment((Department)departmentService.findById(Department.class, Integer.parseInt(employeeForm.getDepartmentId())));
		try{
		employeeService.update(employee);
		}
		catch(Exception ex){
			return mapping.findForward("operationerror");
		}
		return mapping.findForward("operationok");
	}
	
	public ActionForward updateEmployee(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		Employee e=(Employee)employeeService.findById(Employee.class, Integer.parseInt(id));
		
		request.setAttribute("employee", e);
		return mapping.findForward("goUpdateEmployee");
	}
	
	public ActionForward add(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		EmployeeForm employeeForm=(EmployeeForm)form;
		Employee employee=new Employee();
		employee.setEmail(employeeForm.getEmail());
		employee.setName(employeeForm.getName());
		employee.setGrade(Integer.parseInt(employeeForm.getGrade()));
		employee.setPwd(employeeForm.getPwd());
		employee.setHireDate(new java.util.Date());
		employee.setSalary(Float.parseFloat(employeeForm.getSalary()));
		employee.setDepartment((Department)departmentService.findById(Department.class, Integer.parseInt(employeeForm.getDepartmentId())));
		try{
			employeeService.add(employee);
		}
		catch(Exception ex){
			return mapping.findForward("operationerror");
		}
		//System.out.println(employeeForm.getDepartmentId()+""+employeeForm.getPwd());
		return mapping.findForward("operationok");
		
	}
}
