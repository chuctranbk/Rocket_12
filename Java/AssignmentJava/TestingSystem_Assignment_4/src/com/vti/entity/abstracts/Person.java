package com.vti.entity.abstracts;

import java.util.Date;

public class Person {
	private String name;
	private GioiTinh gioiTinh;
	private Date ngaySinh;
	private String diaChi;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(GioiTinh gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public Person() {
		
	}
	public Person(String name, GioiTinh gioiTinh, Date ngaySinh, String diaChi) {
	
		this.name = name;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	
	public void showInfo() {
		System.out.println(getName()+"-"+getGioiTinh()+"-"+getNgaySinh()+"-"+getDiaChi());
	}
	
	
	

}
