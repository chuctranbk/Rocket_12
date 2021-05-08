package com.vti.entity.constructor;

public class Department {
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Department(){
		
	}
	Department(String name){
		this.name = name;
		id = 0;
	}

}
