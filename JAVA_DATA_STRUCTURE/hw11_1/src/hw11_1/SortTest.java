package hw11_1;

import java.util.Scanner;

public class SortTest {
	public static void main(String args[]) {
		System.out.println("hw11_1 : 주동석");

		// 정점 수 n 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 개수 입력: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.print("정렬 전 배열: ");
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		MyIntegerSort myIntegerSort = new MyIntegerSort();
		myIntegerSort.mergeSort(array, 0, array.length-1);
		
		System.out.print("정렬 후 배열: ");
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
