package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.MyNews;

public class AbstractionQuestion4 {
	public static void main(String[] args) {
		question4();
	}

	private static void question4() {
		MyNews myNews = new MyNews();
		Scanner scanner = new Scanner(System.in);

		int choose;
		do {
			loadmenu();
			choose = scanner.nextInt();

			switch (choose) {

			case 1:
				myNews.insertNews();
				break;

			case 2:
				myNews.viewListNews();
				break;

			case 3:
				myNews.averageRate();
				myNews.viewListNews();
				break;

			case 4:
				break;

			default:
				System.out.println("Nhập sai ! Vui lòng nhập lại !");
				break;
			}
		} while (choose != 4);
	}

	private static void loadmenu() {
		System.out.println("=========MENU=========");
		System.out.println("==1. Insert news    ==");
		System.out.println("==2. View list news ==");
		System.out.println("==3. Average rate   ==");
		System.out.println("==4. Exit           ==");
		System.out.println("======================");
		System.out.println("==Bạn chọn:           ");
	}

}
