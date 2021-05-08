package com.vti.entity.interfaces;

public class ProgramStudent {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student("Chuc ", 1);
		students[1] = new Student("Hai ", 1);
		students[2] = new Student("Hung ", 1);
		students[3] = new Student("Ha ", 2);
		students[4] = new Student("Hoang ", 2);
		students[5] = new Student("Chung ", 2);
		students[6] = new Student("Manh ", 2);
		students[7] = new Student("Duc ", 3);
		students[8] = new Student("Tom ", 3);
		students[9] = new Student("Binh ", 3);
		
		for (Student student : students) {
			student.diemDanh();
		}
		
		for (Student student : students) {
			if (student.getGroups() == 1) {
				student.hocBai();
			}
			else if (student.getGroups()==2) {
				student.donVeSinh();
			}
		}

	}

}
