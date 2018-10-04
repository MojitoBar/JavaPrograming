package lab6_2;

import java.util.Scanner;

public class MyDoubleLinkedListTest {
	public static void main(String[] args) {
		MyDoubleLinkedList list = new MyDoubleLinkedList();
		Scanner input = new Scanner(System.in);
		int n;
		int menu;
		System.out.println("hw6_2: �ֵ���");
		do {
			System.out.print("1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:���� 8:�պ���� 9:���� ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println(list.size());
				break;
			case 3:
				System.out.print("���� �Է�: ");
				n = input.nextInt();
				list.addFirst(n);
				break;
			case 4:
				System.out.print("���� �Է�: ");
				n = input.nextInt();
				list.addLast(n);
				break;
			case 5:
				System.out.println(list.removeFirst());
				break;
			case 6:
				System.out.println(list.removeLast());
				break;
			case 7:
				System.out.print("���� �Է�: ");
				n = input.nextInt();
				if (list.remove(n)) {
					System.out.println("���� ����");
					break;
				}
				else {
					System.out.println("���� ����");
					break;
				}
			case 8:
				list.printList();
				break;
			case 9:
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 9);
	}
}
