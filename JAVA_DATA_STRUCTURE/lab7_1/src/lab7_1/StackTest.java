package lab7_1;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		System.out.println("lab7_1: �ֵ���");
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();

		int num;
		int n;
		int sum = 0;
		do {
			System.out.println("1:���� 2:���� 3:��ȸ 4:�հ� 5:����");
			num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.print("������ ���� �Է�: ");
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
				sum = 0;
				while(!stack.isEmpty()) {
					sum += stack.pop();
				}
				System.out.println(sum);
				break;
			case 5:
				System.out.println("�����մϴ�.");
				break;
			default:
				break;
			}
		}while(num != 5);
	}
}
