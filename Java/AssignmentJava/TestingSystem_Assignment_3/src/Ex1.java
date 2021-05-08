import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		downCasting();
		question23();
		question4();
		
	}
	//Q1
	public static void downCasting() {
		float salaryOfAcc1 = 5240.5f;
		float salaryOfAcc2 = 10970.055f;
		int salary1 = (int)salaryOfAcc1;
		int salary2 = (int)salaryOfAcc2;
		System.out.println(salary1);
		System.out.println(salary2);
		
	}
	//Q2,3
	public static void question23() {
		int min = 0;
		int max = 99999;
		int a = (int) (Math.random() * max) + min;
		while (a < 10000) {
			a = a * 10;
		}
		System.out.println("Số ngẫu nhiên: " + a);
		String b = String.valueOf(a);
		System.out.println("Hai số cuối: " + b.substring(3));
	}
	//Q4
	public static void question4() {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a = ");
		a = scanner.nextInt();
		do {
			System.out.println("Nhập b = ");
			b = scanner.nextInt();
			if (b == 0) {
				System.out.println("Vui lòng nhập b khác 0 !");
			}
		} while (b == 0);

		scanner.close();

		System.out.println("Thương: " + (float) a / (float) b);
	}
	

}
