package hw7_1;

import java.util.Scanner;

public class MyArrayStackTest {
	public static void main(String[] args) {
		System.out.println("hw7_1: 주동석");
		MyArrayStack stack = new MyArrayStack(5);
		Scanner scanner = new Scanner(System.in);
		int n, c = 0;
		do {
			System.out.print("1:삽입 2:삭제 3:조회 4:합계 5:종료: ");
			c = scanner.nextInt();
			switch (c) {
			case 1:
				n = scanner.nextInt();
				stack.push(n);
				break;
			case 2:
				System.out.println(stack.pop());
				break;
			case 3:
				System.out.println(stack.peek());
				break;
			case 4:
				System.out.println(stack.stackSum());
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				break;
			}
		}while(c != 5);
	}
}
