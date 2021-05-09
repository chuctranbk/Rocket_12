package com.vti.MavenDemo.backend.businesslayer;

import java.util.List;

import com.vti.MavenDemo.entity.Department;

public interface IDepartmentService {

	List<Department> showDepartmentList();

	void updateDepartmentNameById(int id, String name);

}
