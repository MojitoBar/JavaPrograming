package hw7_1;

import java.util.Scanner;

public class MyArrayStackTest {
	public static void main(String[] args) {
		System.out.println("hw7_1: �ֵ���");
		MyArrayStack stack = new MyArrayStack(5);
		Scanner scanner = new Scanner(System.in);
		int n, c = 0;
		do {
			System.out.print("1:���� 2:���� 3:��ȸ 4:�հ� 5:����: ");
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
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				break;
			}
		}while(c != 5);
	}
}
