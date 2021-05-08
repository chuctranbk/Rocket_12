package com.vti.entity.inheritance;

public class Program {

	public static void main(String[] args) {
		//Q2
		QuanLyCanBo qlcb = new QuanLyCanBo();
		qlcb.themMoiCanBo(1, "Chuc", 25, GioiTinh.MALE, "Ha Noi", (short)1, "8");
		qlcb.themMoiCanBo(2, "Hoang", 23, GioiTinh.MALE, "Ha Noi", (short)2, "IT");
		
		qlcb.themMoiCanBo(4, "Hoang", 23, GioiTinh.MALE, "Ha Noi", (short)2, "IT");
		qlcb.themMoiCanBo(3, "Chung", 24, GioiTinh.MALE, "Ha Noi", (short)3, "Ban hang");
		
		//qlcb.timKiemTheoTen("");
		qlcb.xoaCanBoTheoTen("Hoang");
		qlcb.hienThiThongTin();
		
		//Q3
		HighSchoolStudent hss = new HighSchoolStudent(1, "Nam", "Chuyen van", "Dai Hoc Cong Nghe");
		System.out.println(hss);
	}
	

}
