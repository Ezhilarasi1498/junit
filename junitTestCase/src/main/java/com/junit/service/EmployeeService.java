package com.junit.service;

import java.util.List;

import com.junit.model.Employee;

public interface EmployeeService {
	public void createEmployee() throws Exception;

	public boolean insertEmployee(Employee emp);

	public boolean updateEmployee(Employee emp);

	public boolean deleteEmployee(int deptId);

	public List<Employee> getAllEmployees(int deptId);

}
