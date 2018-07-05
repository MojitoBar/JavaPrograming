package lab4_1;

import java.util.Scanner;

public class lab4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("배열 길이 입력: ");
		int length = input.nextInt();
		
		int[] arr = new int[length];
		
		System.out.print("5개의 정수 입력 :");
		for (int i = 0; i < length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print("배열 = ");
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
