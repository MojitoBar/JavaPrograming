package lab6_1;

import java.util.Scanner;

public class MyLinkedListTest {
	public static void main (String args[]) {
		MyLinkedList myLinkedList = new MyLinkedList();
		Scanner input = new Scanner(System.in);
		int n;
		int menu;
		do {
			System.out.print("1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:���� ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println(myLinkedList.toString());
				break;
			case 2:
				System.out.println(myLinkedList.getLength());
				break;
			case 3:
				System.out.print("���� �Է�: ");
				n = input.nextInt();
				myLinkedList.addFirst(n);
				break;
			case 4:
				System.out.print("���� �Է�: ");
				n = input.nextInt();
				myLinkedList.addLast(n);
				break;
			case 5:
				System.out.println(myLinkedList.removeFirst());
				break;
			case 6:
				System.out.println(myLinkedList.removeLast());
				break;
			case 7:
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 7);
	}	
}
