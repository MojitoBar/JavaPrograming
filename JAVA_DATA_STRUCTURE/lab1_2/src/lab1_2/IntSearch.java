package lab1_2;

import java.util.Scanner;

public class IntSearch {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[10];
		int search;
		int k = -1;
		
		System.out.println("lab1_2: �ֵ���");
		
		System.out.print("������ 10�� �Է�: ");
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.print("�˻��� ������ �Է�: ");
		search = input.nextInt();
		
		for (int i = 0; i < 10; i++) {
			if(arr[i] == search) {
				k = i;
				break;
			}
		}
		
		System.out.print("�ε��� = " + k);
	}
}