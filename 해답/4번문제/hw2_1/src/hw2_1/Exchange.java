package hw2_1;

import java.util.Scanner;

public class Exchange {
	public static void main(String[] args) {
		final int won = 1060;
		
		Scanner input = new Scanner(System.in);
		System.out.print("500�� ���� �Է�: ");
		int a = input.nextInt();
		System.out.print("100�� ���� �Է�: ");
		int b = input.nextInt();
		System.out.print("50���� ���� �Է�: ");
		int c = input.nextInt();
		System.out.print("10���� ���� �Է�: ");
		int d = input.nextInt();
		
		int e = a * 500 + b * 100 + c * 50 + d * 10;
		System.out.println("���� �Ѿ� = " + e);
		System.out.println("�޷� �׼� = " + (e / won));
		System.out.println("���� ��ȭ = " + (e % won));
	}
}
