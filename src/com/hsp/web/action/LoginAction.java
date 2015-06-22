package com.hsp.web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.hsp.domain.Employee;
import com.hsp.service.Interface.EmployeeServiceInterface;
import com.hsp.web.forms.EmployeeForm;




public class LoginAction extends DispatchAction {
	
	@Resource
	EmployeeServiceInterface employeeService;
	
	public ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
				
				
				EmployeeForm employeeForm=(EmployeeForm) form;
			
				Employee e=new Employee();
				e.setId(Integer.parseInt(employeeForm.getId()));
				e.setPwd(employeeForm.getPwd());
				e=employeeService.checkEmployee(e);
				
				if (e!=null && e.getGrade()==1){
					
					request.getSession().setAttribute("loginuser",e);
					return mapping.findForward("ok");
				}
				else{
					
					return mapping.findForward("error");
				}
		
	}
	
	public ActionForward goMainPage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
				
			if (request.getSession().getAttribute("loginuser")!=null){
				return mapping.findForward("ok");
			}
			return mapping.findForward("error");
				
		
	}
	public ActionForward logout(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
				if (request.getSession().getAttribute("loginuser")!=null){
					request.getSession().removeAttribute("loginuser");
					return mapping.findForward("logout");
				}
				return mapping.findForward("error");
		
	}
	/**
	 * @param employeeService the employeeService to set
	 */
	public void setEmployeeService(
			EmployeeServiceInterface employeeService) {
		System.out.println("employeeserviceinterface is used");
		this.employeeService = employeeService;
	}
	
}
