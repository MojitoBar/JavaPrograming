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
		
		System.out.println("곱셈 문제의 답을 입력하세요 (통과하려면 0을 입력.)");
		
		for (int i = 0; i < 5; i++) {
			int x = random.nextInt(9) + 1;
			int y = random.nextInt(9) + 1;
			
			System.out.println(x + "+" + y + "=" + "?");
			int answer = input.nextInt();
			
			if (answer == 0) {
				System.out.println("통과.");
				through++;
			}
			
			if (x + y == answer) {
				System.out.println("정답입니다.");
				right++;			
			}
			else {
				System.out.println("틀렸습니다.");
				wrong++;
			}
		}
		
		int sum = right * 20 + wrong * -10;
		sum = sum < 0 ? 0 : sum;
		System.out.println("정답수" + right + "오답수" + wrong + "총점" + sum);
	}
}
