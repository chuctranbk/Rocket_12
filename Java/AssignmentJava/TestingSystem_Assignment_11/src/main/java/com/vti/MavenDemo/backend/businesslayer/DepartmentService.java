package com.vti.MavenDemo.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.MavenDemo.backend.datalayer.DepartmentRepository;
import com.vti.MavenDemo.backend.datalayer.IDepartmentRepository;
import com.vti.MavenDemo.entity.Department;

public class DepartmentService implements IDepartmentService{
	private IDepartmentRepository depRepository;
	
	public DepartmentService() {
		try {
			this.depRepository = new DepartmentRepository();
		} catch (FileNotFoundException e) {
			System.out.println("khong tim thay file database");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("khong doc duoc file database");
			e.printStackTrace();
		}
	}

	@Override
	public List<Department> showDepartmentList() {
		
		try {
			return depRepository.getDepartmentList();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateDepartmentNameById(int id, String name) {
		try {
			depRepository.updateDepartmentNameById(id,name);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
