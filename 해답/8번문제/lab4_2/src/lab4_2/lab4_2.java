package lab4_2;

import java.util.Scanner;


public class lab4_2 {
	static int num;
	public static void main(String[] args) {
		lab4_2 LAB = new lab4_2();
		Scanner input = new Scanner(System.in);
		
		num = input.nextInt();
		int[] arr = new int[num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println(LAB.sum(arr));
	}
	
	int sum(int[] arr) {
		int a = 0;
		for (int i = 0; i < num; i++)
			a += arr[i];
		return a;
	}	
}
