package com.vti.MavenDemo.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.MavenDemo.entity.Department;

public interface IDepartmentRepository {

	List<Department> getDepartmentList() throws SQLException;

	void updateDepartmentNameById(int id, String name) throws SQLException;
	
}
