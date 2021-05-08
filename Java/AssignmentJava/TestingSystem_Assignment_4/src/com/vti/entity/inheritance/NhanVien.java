package com.vti.entity.inheritance;

public class NhanVien extends CanBo{
	private String congViec;
	public NhanVien(int id, String name, int age, String diaChi, GioiTinh gioiTinh, String congViec) {
		super(id, name, age, diaChi, gioiTinh);
		this.congViec = congViec;
	}
	@Override
	public String toString() {
		
		return super.toString()+"-"+congViec;
	}

}
