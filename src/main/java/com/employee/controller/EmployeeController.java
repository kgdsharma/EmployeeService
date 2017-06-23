package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.entity.EmployeeRepository;

@CrossOrigin
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
		public List<Employee> employees(){
			
			return (List<Employee>) employeeRepository.findAll();
			
		}
	
	@GetMapping("/employee/{employeeId}")
	public Employee findemployee(@PathVariable("employeeId") String id){
		
		return  employeeRepository.findOne(id);
		
	}
	
	@PostMapping(value="/auemployee", consumes=MediaType.APPLICATION_JSON_VALUE)
	
	public String updateEmployee(@RequestBody Employee employee){
		employeeRepository.save(employee);
		return null;
		
	}
	
@PutMapping(value="/addemployee/{employeeId}", consumes=MediaType.APPLICATION_JSON_VALUE)
	
	public String addEmployee(@RequestBody Employee employee){
		employeeRepository.save(employee);
		return null;
		
	}

@DeleteMapping(value="/deleteemployee/{employeeId}")

public String deleteEmployee(@PathVariable("employeeId") String id){
	employeeRepository.delete(id);
	return null;
	
}

}
