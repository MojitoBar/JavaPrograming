package hw7_3;

import java.util.Scanner;

public class MyCharacterStackTest {
	public static void main(String[] args) {
		System.out.println("lab7_3: �ֵ���");

		
		Scanner scanner = new Scanner(System.in);
		
		MyCharacterStack myCharacterStack = new MyCharacterStack();
		System.out.print("���� �Է�: ");
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
					System.out.println("�߸��� ��ȣ ���� �Դϴ�.");
					return;
				}
			}
			else if (str_arr[i] == '>') {
				if (myCharacterStack.isEmpty() || myCharacterStack.pop() != '<') {
					System.out.println("�߸��� ��ȣ ���� �Դϴ�.");
					return;
				}
			}
		}
		
		if(myCharacterStack.isEmpty())
			System.out.println("�ùٸ� ��ȣ ���� �Դϴ�.");
		else
			System.out.println("�߸��� ��ȣ ���� �Դϴ�.");
	}
}
