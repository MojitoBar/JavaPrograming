package lab4_1;

import java.util.Scanner;

public class lab4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�迭 ���� �Է�: ");
		int length = input.nextInt();
		
		int[] arr = new int[length];
		
		System.out.print("5���� ���� �Է� :");
		for (int i = 0; i < length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print("�迭 = ");
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
