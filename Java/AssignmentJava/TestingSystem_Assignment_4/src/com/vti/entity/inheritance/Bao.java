package com.vti.entity.inheritance;

import java.util.Date;

public class Bao extends TaiLieu{
	private Date ngayPhatHanh;
	

	public Bao(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, Date ngayPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
		
	}
	@Override
	public String toString() {
		
		return super.toString() + "-"+ ngayPhatHanh;
	}

}
