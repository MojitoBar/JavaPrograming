package lab1_2;

import java.util.Scanner;

public class IntSearch {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[10];
		int search;
		int k = -1;
		
		System.out.println("lab1_2: 주동석");
		
		System.out.print("정수값 10개 입력: ");
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.print("검색할 정수값 입력: ");
		search = input.nextInt();
		
		for (int i = 0; i < 10; i++) {
			if(arr[i] == search) {
				k = i;
				break;
			}
		}
		
		System.out.print("인덱스 = " + k);
	}
}