package com.vti.entity.constructor;

public abstract class People {
	private String name;
	private int age;
	private String hometown;
//	public People(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

}
