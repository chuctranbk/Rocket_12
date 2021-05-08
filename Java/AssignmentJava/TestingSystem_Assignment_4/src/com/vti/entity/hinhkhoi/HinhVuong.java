package com.vti.entity.hinhkhoi;

public class HinhVuong extends HinhChuNhat{

	public HinhVuong(int a, int b) {
		super(a, b);
		
		if(a == b) {
			System.out.println("tinh chu vi theo hinh vuong ");
		}
	}

}
