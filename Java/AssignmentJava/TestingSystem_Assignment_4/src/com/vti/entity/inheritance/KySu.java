package com.vti.entity.inheritance;

public class KySu extends CanBo{
	private String nganhDaoTao;
	public KySu(int id, String name, int age, String diaChi, GioiTinh gioiTinh, String nganhDaoTao) {
		super(id, name, age, diaChi, gioiTinh);
		this.nganhDaoTao = nganhDaoTao;
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "-"+ nganhDaoTao;
	}
	
	

}
