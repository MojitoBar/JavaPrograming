 //***************************
 // 파일명: Main.java
 // 작성자: 주동석
 // 작성일: 10-29
 // 설명: hw7_4
 //***************************

package hw7_4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		System.out.println("hw7_4: 주동석");
		System.out.print("후위표기수식 입력: ");
		Stack<Double> stack = new Stack<>();
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		Scanner scanner2 = new Scanner(str);

		while(true) {

			if(scanner2.hasNextDouble()) {
				double n = scanner2.nextDouble();
				stack.push(n);
			}
			else if(!scanner2.hasNext()) {
				break;
			}
			else {
				if(stack.size() >= 2) {
					String temp = scanner2.next();
					if(temp.equals("+")) {
						stack.push(stack.pop() + stack.pop());
					}
					else if(temp.equals("-")) {
						stack.push(stack.pop() - stack.pop());
					}
					else if(temp.equals("*")) {
						stack.push(stack.pop() * stack.pop());
					}
					else if(temp.equals("/")) {
						stack.push(stack.pop() / stack.pop());
					}
				}
				else {
					System.out.println("잘못된 수식입니다.");
					return;
				}
					
			}
		}

		if(!stack.isEmpty() && stack.size() == 1)
			System.out.println("결과 = " + stack.pop());
		else
			System.out.println("잘못된 수식입니다.");
	}
}
