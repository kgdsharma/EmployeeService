package com.employee.entity;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface EmployeeRepository extends CrudRepository<Employee, String>{

}
