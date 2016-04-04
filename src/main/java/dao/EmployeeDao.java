package dao;

import java.util.List;

import model.Department;
import model.Employee;

public interface EmployeeDao {
	
	public Integer add(int id,String name,String gender,int age,String email,int salary,String designation,String department);
    
   	public List<Employee> getlist();
	public List<Employee> getbyid();
	public List<Employee> getbyname();
	public List<Employee> getbysalary();
	public List<Employee> getbydepartment();
	public List<Employee> getbydesignation();
	public Employee edit(int id);
	public Integer update(Employee Employee);
	public int delete(int id);
	public List<Department> getlistd();
	public Department editdep(int id);
	public void updatedep(Department Department);
	public int deletedep(int id);
}
