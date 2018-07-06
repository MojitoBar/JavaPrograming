package hw4_1;

import java.util.Scanner;

public class hw4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] ages = new int[5];
		int temp = 0;
		
		System.out.print("나이 하한 입력 : ");
		int min = input.nextInt();
		System.out.print("나이 상한 입력 : ");
		int max = input.nextInt();
		System.out.print("학생 수 입력 : ");
		int count = input.nextInt();
		
		int i = 0;
		while(i < count) {
			System.out.print("나이 입력 : ");
			int age = input.nextInt();
			
			if (age <= max && age >= min) {
				ages[i] = age;
				i++;
			}
			else {
				System.out.println("범위를 벗어났습니다. 다시 입력하세요.");
			}
		}
		
		System.out.println("나이  학생수");
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
