package hw2_1;

import java.util.Scanner;

public class Exchange {
	public static void main(String[] args) {
		final int won = 1060;
		
		Scanner input = new Scanner(System.in);
		System.out.print("500원 갯수 입력: ");
		int a = input.nextInt();
		System.out.print("100원 갯수 입력: ");
		int b = input.nextInt();
		System.out.print("50원의 갯수 입력: ");
		int c = input.nextInt();
		System.out.print("10원의 갯수 입력: ");
		int d = input.nextInt();
		
		int e = a * 500 + b * 100 + c * 50 + d * 10;
		System.out.println("저금 총액 = " + e);
		System.out.println("달러 액수 = " + (e / won));
		System.out.println("남은 한화 = " + (e % won));
	}
}
