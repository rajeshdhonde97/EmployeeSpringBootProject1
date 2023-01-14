package com.example.SpringBootApp.model.service;

import java.util.List;

import com.example.SpringBootApp.model.Employee;

public interface EmployeeService {

	//1. Save Employee in Database
	public Employee saveEmployee(Employee employee);

	//2. Save Multiple Employee
	public List<Employee> saveMultipleEmployee(List<Employee> employee);

	//3. Get All Employee Data
	public List<Employee> getEmployeeData();

	//4. get Employee by id
	public Employee getEmployeeById(int id);

	//5. get Employee By Name
	public Employee getEmployeeByName(String name);

	//6. update Employee
	public Employee updateEmployeeById(Employee employee, int id);

	//7. update Employee single field by using id
	public Employee updateEmployeeBySingleField(Employee employee, int id);

	//8. Delete Employee
	public Employee deleteEmployee(int id);

	//9. Delete All Employees
	public List<Employee> deleteAllEmployees();

}
