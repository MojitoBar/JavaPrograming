package hw3_1;

import java.util.Random;
import java.util.Scanner;

public class hw3_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int right = 0;
		int wrong = 0;
		int through = 0;
		
		System.out.println("���� ������ ���� �Է��ϼ��� (����Ϸ��� 0�� �Է�.)");
		
		for (int i = 0; i < 5; i++) {
			int x = random.nextInt(9) + 1;
			int y = random.nextInt(9) + 1;
			
			System.out.println(x + "+" + y + "=" + "?");
			int answer = input.nextInt();
			
			if (answer == 0) {
				System.out.println("���.");
				through++;
			}
			
			if (x + y == answer) {
				System.out.println("�����Դϴ�.");
				right++;			
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				wrong++;
			}
		}
		
		int sum = right * 20 + wrong * -10;
		sum = sum < 0 ? 0 : sum;
		System.out.println("�����" + right + "�����" + wrong + "����" + sum);
	}
}
