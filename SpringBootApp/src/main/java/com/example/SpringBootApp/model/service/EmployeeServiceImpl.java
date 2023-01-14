package com.example.SpringBootApp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootApp.model.Employee;
import com.example.SpringBootApp.model.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> saveMultipleEmployee(List<Employee> employee) {
		// TODO Auto-generated method stub
		return employeeRepository.saveAll(employee);
	}

	@Override
	public List<Employee> getEmployeeData() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).orElseThrow();
	}

	@Override
	public Employee getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepository.getByName(name);
	}

	@Override
	public Employee updateEmployeeById(Employee employee, int id) {
		// TODO Auto-generated method stub
		Employee emp = employeeRepository.findById(id).orElseThrow();
		emp.setName(employee.getName());
		emp.setCity(employee.getCity());
		emp.setMobile(employee.getMobile());
		employeeRepository.save(emp);
		return null;
	}

	@Override
	public Employee updateEmployeeBySingleField(Employee employee, int id) {
		// TODO Auto-generated method stub
		Employee emp = employeeRepository.findById(id).orElseThrow();
		emp.setMobile(employee.getMobile());
		employeeRepository.save(emp);
		return null;
	}

	@Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeRepository.findById(id);
		employeeRepository.deleteById(id);
		return null;
	}

	@Override
	public List<Employee> deleteAllEmployees() {
		// TODO Auto-generated method stub
	   employeeRepository.deleteAll();
	   return null;
	}

}
