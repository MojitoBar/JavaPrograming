package hw7_3;

import java.util.Scanner;

public class MyCharacterStackTest {
	public static void main(String[] args) {
		System.out.println("lab7_3: 주동석");

		
		Scanner scanner = new Scanner(System.in);
		
		MyCharacterStack myCharacterStack = new MyCharacterStack();
		System.out.print("수식 입력: ");
		String str = scanner.nextLine();
		char str_arr[] = str.toCharArray();
		
		
		for (int i = 0; i < str.length(); i ++) {
			if(str_arr[i] == '<') {
				myCharacterStack.push('<');
			}
			else if(str_arr[i] == '(') {
				myCharacterStack.push('(');
			}
			else if(str_arr[i] == ')') {
				if (myCharacterStack.isEmpty() || myCharacterStack.pop() != '(') {
					System.out.println("잘못된 괄호 수식 입니다.");
					return;
				}
			}
			else if (str_arr[i] == '>') {
				if (myCharacterStack.isEmpty() || myCharacterStack.pop() != '<') {
					System.out.println("잘못된 괄호 수식 입니다.");
					return;
				}
			}
		}
		
		if(myCharacterStack.isEmpty())
			System.out.println("올바른 괄호 수식 입니다.");
		else
			System.out.println("잘못된 괄호 수식 입니다.");
	}
}
