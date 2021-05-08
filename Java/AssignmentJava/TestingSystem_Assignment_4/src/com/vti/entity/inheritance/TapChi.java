package com.vti.entity.inheritance;

import java.util.Date;

public class TapChi extends TaiLieu{
	private int soPhatHanh;
	private Date ngayPhatHanhTapChi;

	public TapChi(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, Date ngayPhatHanhTapChi) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.ngayPhatHanhTapChi = ngayPhatHanhTapChi;
	}
	@Override
	public String toString() {
		
		return super.toString() + "-"+ soPhatHanh + "-" + ngayPhatHanhTapChi;
	}

}
