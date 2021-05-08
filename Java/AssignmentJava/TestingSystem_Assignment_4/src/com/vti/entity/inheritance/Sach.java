package com.vti.entity.inheritance;

public class Sach extends TaiLieu{
	private String tenTacGia;
	private int soTrang;

	public Sach(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
		
	}
	@Override
	public String toString() {
		
		return super.toString() + "-"+ tenTacGia + "-" + soTrang;
	}

}
