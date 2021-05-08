package com.vti.entity.inheritance;

public class CongNhan extends CanBo{
	private short bac;
	public CongNhan(int id, String name, int age, String diaChi, GioiTinh gioiTinh, short bac) {
		super(id, name, age, diaChi, gioiTinh);
		this.bac = bac;
		
	}
	@Override
	public String toString() {
		
		return super.toString()+"-"+ bac;
	}

	

}
