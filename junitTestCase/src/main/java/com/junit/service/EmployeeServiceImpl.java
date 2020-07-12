package com.junit.service;

import java.util.List;

import com.junit.dao.EmployeeDao;
import com.junit.dao.EmployeeDaoImpl;
import com.junit.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao dao = new EmployeeDaoImpl();

	@Override
	public void createEmployee() throws Exception {
		dao.createEmployee();

	}

	@Override
	public boolean insertEmployee(Employee emp) {
		return dao.insertEmployee(emp);
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		return dao.updateEmployee(emp);
	}

	@Override
	public boolean deleteEmployee(int deptId) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(deptId);
	}

	@Override
	public List<Employee> getAllEmployees(int deptId) {

		return dao.getAllEmployees(deptId);
	}

}
