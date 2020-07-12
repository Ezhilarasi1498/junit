package com.junit.dao;

import java.util.List;

import com.junit.model.Department;

public interface DepartmentDao {
	

		public void createDepartment() throws Exception;

		public boolean insertDepartment(Department dept);

		public List<Department> getAllDepartments(Department dept);
		
		public boolean updateDepartment(Department dept);
		
		public boolean deleteDepartment(int deptId);

	

}
