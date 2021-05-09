package com.vti.MavenDemo.backend.presentationlayer;

import java.util.List;

import com.vti.MavenDemo.backend.businesslayer.DepartmentService;
import com.vti.MavenDemo.backend.businesslayer.IDepartmentService;
import com.vti.MavenDemo.entity.Department;

public class DepartmentController {
	private IDepartmentService depService;
	
	public DepartmentController() {
		this.depService = new DepartmentService();
	}
	public List<Department> showDepartmentList(){
		
		return depService.showDepartmentList();
	}
	public void updateDepartmentNameById(int id, String name) {
		depService.updateDepartmentNameById(id,name);
		
	}
}
