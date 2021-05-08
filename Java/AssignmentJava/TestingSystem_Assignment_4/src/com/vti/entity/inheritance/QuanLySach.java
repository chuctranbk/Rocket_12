package com.vti.entity.inheritance;

import java.sql.Date;
import java.util.ArrayList;

public class QuanLySach {
	private ArrayList<TaiLieu> dstl;

	public QuanLySach() {
		dstl = new ArrayList<TaiLieu>();
	}

	public void themMoiTaiLieu(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh,  short type, String thuocTinhThem1, String thuocTinhThem2 ) {
		if (type == 1) {
			Sach sach = new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, thuocTinhThem1, Integer.valueOf(thuocTinhThem2));
			dstl.add(sach);
		} else if (type == 2) {
			TapChi tapChi = new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh,Integer.valueOf(thuocTinhThem1)  , Date.valueOf(thuocTinhThem2));
			dstl.add(tapChi);
		} else if (type == 3) {
			Bao bao = new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, Date.valueOf(thuocTinhThem1));
			dstl.add(bao);
		} else {

		}

	}

	public void hienThiThongTin() {
		for (TaiLieu taiLieu : dstl) {
			System.out.println(taiLieu.toString());
		}

	}

	
	

	public void xoaTaiLieuTheoMa(int  maTaiLieu) {
		for (int i = 0; i<dstl.size(); i++) {

			if (maTaiLieu == dstl.get(i).getMaTaiLieu()) {
			dstl.remove(i);
			i--;
			}
		}
	}

}
