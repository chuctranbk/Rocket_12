package com.vti.entity.inheritance;

import java.util.ArrayList;

public class QuanLyCanBo {
	private ArrayList<CanBo> dscb;

	public QuanLyCanBo() {
		dscb = new ArrayList<CanBo>();
	}

	public void themMoiCanBo(int id, String name, int age, GioiTinh gioiTinh, String diaChi, short type,
			String thuocTinhThem) {
		if (type == 1) {
			CongNhan congNhan = new CongNhan(id, name, age, diaChi, gioiTinh, Short.valueOf(thuocTinhThem));
			dscb.add(congNhan);
		} else if (type == 2) {
			KySu kySu = new KySu(id, name, age, diaChi, gioiTinh, thuocTinhThem);
			dscb.add(kySu);
		} else if (type == 3) {
			NhanVien nhanVien = new NhanVien(id, name, age, diaChi, gioiTinh, thuocTinhThem);
			dscb.add(nhanVien);
		} else {

		}

	}

	public void hienThiThongTin() {
		for (CanBo canBo : dscb) {
			System.out.println(canBo.toString());
		}

	}

	public void timKiemTheoTen(String name) {
		for (CanBo canBo : dscb) {

			if (name.equals(canBo.getName())) {
				System.out.println(canBo.toString());
			}

		}
	}

	public void xoaCanBoTheoTen(String name) {
		for (int i = 0; i<dscb.size(); i++) {

			if (name.equals(dscb.get(i).getName())) {
			dscb.remove(i);
			i--;
			}
		}
	}

}
