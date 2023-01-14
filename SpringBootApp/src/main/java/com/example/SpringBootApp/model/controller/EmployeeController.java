package com.example.SpringBootApp.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootApp.model.Employee;
import com.example.SpringBootApp.model.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {

		return employeeService.saveEmployee(employee);
	}

	@PostMapping("/saveAll")
	public List<Employee> saveMultipleEmployee(@RequestBody List<Employee> employee) {

		return employeeService.saveMultipleEmployee(employee);
	}

	@GetMapping("/getAll")
	public List<Employee> getEmployeeData() {

		return employeeService.getEmployeeData();

	}

	@GetMapping("/get/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {

		return employeeService.getEmployeeById(id);
	}

	@GetMapping("/getname/{name}")
	public Employee getEmployeeByName(@PathVariable("name") String name) {

		return employeeService.getEmployeeByName(name);
	}

	@PutMapping("/update/{id}")
	public Employee updateEmployeeById(@RequestBody Employee employee, @PathVariable("id") int id) {

		return employeeService.updateEmployeeById(employee, id);
	}

	@PutMapping("/updateField/{id}")
	public Employee updateEmployeeBySingleField(@RequestBody Employee employee, @PathVariable("id") int id) {

		return employeeService.updateEmployeeBySingleField(employee, id);
	}

	@DeleteMapping("/delete/{id}")
	public Employee deleteEmployee(@PathVariable int id) {

		return employeeService.deleteEmployee(id);
	}

	
	@DeleteMapping("deleteAll")
	public List<Employee> deleteAllEmployees() {
		
		return employeeService.deleteAllEmployees();
	}
}
