package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.EmployeeDao;
import dao.UserDao;
import model.Department;
import model.Employee;

@Controller
public class LoginController {

	@Autowired
	public UserDao user;

	@Autowired
	public EmployeeDao emp;
	
	

	// @Autowired
	// public DepartmentDao dep;

	@RequestMapping(value = "check", method = RequestMethod.POST)
	public ModelAndView process(HttpServletResponse response, HttpServletRequest request) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String message = "invalid credentials";

		if (user.checkuser(username, password)) {
			System.out.println("modellll");
			message = "Welcome " + username + "!!";
			System.out.println("rrrr");

			return new ModelAndView("crud", "message", message);

		} else

		{
			// response.sendRedirect("index.jsp");
			return new ModelAndView("index", "message", message);
		}

	}

	@RequestMapping(value = "add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse respone) throws IOException {

		try {
			int a = Integer.parseInt(request.getParameter("id"));

			System.out.println(a);
			String b = request.getParameter("name");
			String c = request.getParameter("gender");
			int d = Integer.parseInt(request.getParameter("age"));

			System.out.println(d);
			String e = request.getParameter("email");
			int f = Integer.parseInt(request.getParameter("salary"));
			System.out.println(f);
			String g = request.getParameter("designation");
			String h = request.getParameter("department");

			emp.add(a, b, c, d, e, f, g, h);

		} catch (HibernateException e) {
			System.out.println(e);
		}
		return new ModelAndView("add");

	}

	@RequestMapping(value = "list")
	public ModelAndView list() {
		List<Employee> emp1 = emp.getlist();

		return new ModelAndView("list", "emp1", emp1);

	}

	@RequestMapping(value = "empid")
	public ModelAndView getbyid() {
		List<Employee> emp1 = emp.getbyid();

		return new ModelAndView("list", "emp1", emp1);

	}

	@RequestMapping(value = "empname")
	public ModelAndView getbyname() {
		List<Employee> emp1 = emp.getbyname();

		return new ModelAndView("list", "emp1", emp1);

	}

	@RequestMapping(value = "empsal")
	public ModelAndView getbysalary() {
		List<Employee> emp1 = emp.getbysalary();

		return new ModelAndView("list", "emp1", emp1);
	}

	@RequestMapping(value = "empdept")
	public ModelAndView getbydepartment() {
		List<Employee> emp1 = emp.getbydepartment();

		return new ModelAndView("list", "emp1", emp1);
	}

	@RequestMapping(value = "empdesg")
	public ModelAndView getbydesignation() {
		List<Employee> emp1 = emp.getbydesignation();

		return new ModelAndView("list", "emp1", emp1);
	}

	@RequestMapping(value = "edit")
	public ModelAndView edit(@RequestParam int id) {

		Employee emp1 = emp.edit(id);
		return new ModelAndView("add1", "emp1", emp1);

	}

	@RequestMapping(value = "update")
	public ModelAndView update(@ModelAttribute Employee Employee) {
		System.out.println("update");
		//String department=request.getParameter("department");
		emp.update(Employee);
		return new ModelAndView("redirect:list");

	}

	@RequestMapping(value = "delete")
	public ModelAndView delete(@RequestParam int id) {
		
		emp.delete(id);
		return new ModelAndView("redirect:list");

	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "list1")
	public ModelAndView listd() {
		Department dep=new Department();
		List<Department> emp1 = emp.getlistd();

		return new ModelAndView("dep", "emp1", emp1);

	}
	
	@RequestMapping(value="editdep")
	public ModelAndView editdep(@RequestParam int id){
		Department emp1=emp.editdep(id);
		return new ModelAndView("editdep","emp1",emp1);
				
	}
	@RequestMapping(value = "deletedep")
	public ModelAndView deletedep(@RequestParam int id) {
		
		emp.deletedep(id);
		return new ModelAndView("redirect:list1");

	}
	
	@RequestMapping(value="updatedep")	
	public ModelAndView updatedep(@ModelAttribute Department Department){
		
		emp.updatedep(Department);
		return new ModelAndView("redirect:list1");
	}
}
