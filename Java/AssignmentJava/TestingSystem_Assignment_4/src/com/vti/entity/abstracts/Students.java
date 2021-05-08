package com.vti.entity.abstracts;

import java.util.Date;

public class Students extends Person{
	private String maSinhVien;
	private float diemTrungBinh;
	private String email;
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Students(String name, GioiTinh gioiTinh, Date ngaySinh, String diaChi, String maSinhVien, float diemTrungBinh, String email) {
		super(name, gioiTinh, ngaySinh, diaChi);
		this.maSinhVien = maSinhVien;
		this.diemTrungBinh = diemTrungBinh;
		this.email = email;
	}
	
	

}
