package hw11_1;

import java.util.Scanner;

public class SortTest {
	public static void main(String args[]) {
		System.out.println("hw11_1 : �ֵ���");

		// ���� �� n �Է�
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �Է�: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.print("���� �� �迭: ");
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		MyIntegerSort myIntegerSort = new MyIntegerSort();
		myIntegerSort.mergeSort(array);
		
		System.out.print("���� �� �迭: ");
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
