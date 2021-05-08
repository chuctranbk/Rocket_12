package com.vti.entity.hinhkhoi;

public class HinhChuNhat implements ITinhToan{
	int a;
	int b;
	

	public HinhChuNhat(int a, int b) {
		this.a = a;
		this.b = b;
		
		
	}

	@Override
	public void tinhChuVi() {
		if (a == b) {
			System.out.println("Tinh chu vi theo hinh vuong "+ a*4);
			
		}
		else {
			System.out.println("Tinh chu vi theo hinh chu nhat "+ (a+b)*2);
		}
		
	}

	@Override
	public void tinhDienTich() {
		if (a == b) {
			System.out.println("Tinh dien tich theo hinh vuong "+ a*a);
			
		}
		else {
			System.out.println("Tinh dien tich theo hinh chu nhat "+ a*b);
		}
		
	}
	
	
	

}
