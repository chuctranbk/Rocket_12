package com.vti.entity.interfaces;

import java.util.Arrays;

public class Student implements IStudent{
	private int id;
	private String name;
	private int groups;
	
	
	public Student(String name, int group) {
		this.name = name;
		this.groups = group;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGroups() {
		return groups;
	}
	public void setGroups(int groups) {
		this.groups = groups;
	}
	@Override
	public void diemDanh() {
		System.out.println(name + " diem danh");
		
	}
	@Override
	public void hocBai() {
		System.out.println(name + " hoc bai");
		
	}
	@Override
	public void donVeSinh() {
		System.out.println(name + " don ve sinh");
		
	}
	

}
