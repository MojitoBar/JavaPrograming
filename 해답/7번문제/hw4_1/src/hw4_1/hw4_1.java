package hw4_1;

import java.util.Scanner;

public class hw4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] ages = new int[5];
		int temp = 0;
		
		System.out.print("���� ���� �Է� : ");
		int min = input.nextInt();
		System.out.print("���� ���� �Է� : ");
		int max = input.nextInt();
		System.out.print("�л� �� �Է� : ");
		int count = input.nextInt();
		
		int i = 0;
		while(i < count) {
			System.out.print("���� �Է� : ");
			int age = input.nextInt();
			
			if (age <= max && age >= min) {
				ages[i] = age;
				i++;
			}
			else {
				System.out.println("������ ������ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		
		System.out.println("����  �л���");
		for (int j = min; j <= max; j++) {
			temp = 0;
			for (int k = 0; k < count; k++) {
				if (j == ages[k]) {
					temp++;
				}
			}
			System.out.println(j + "  " + temp);
		}
	}
}
