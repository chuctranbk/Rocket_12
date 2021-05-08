package com.vti.entity.inheritance;

public class CanBo {
	private int id;
	private String name;
	private int age;
	private String diaChi;
	
	private GioiTinh gioiTinh;
	public CanBo(int id, String name, int age, String diaChi, GioiTinh gioiTinh) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(GioiTinh gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String toString() {
		return id + "-"+ name + "-" + age + "-"+ diaChi + "-"+ gioiTinh;
	}

}
