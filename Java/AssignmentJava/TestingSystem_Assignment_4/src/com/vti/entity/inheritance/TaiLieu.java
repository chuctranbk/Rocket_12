package com.vti.entity.inheritance;

public class TaiLieu {
	private int maTaiLieu;
	private String tenNhaXuatBan;
	private int soBanPhatHanh;
	
	public TaiLieu(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.tenNhaXuatBan = tenNhaXuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public int getMaTaiLieu() {
		return maTaiLieu;
	}

	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}

	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	
	public String toString() {
		return maTaiLieu + "-"+ tenNhaXuatBan + "-" + soBanPhatHanh;
	}

}
