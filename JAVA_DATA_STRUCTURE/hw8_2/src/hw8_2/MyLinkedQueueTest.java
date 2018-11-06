package hw8_2;

import java.util.Scanner;


public class MyLinkedQueueTest {
	public static void main(String[]args) {
		MyLinkedQueue myLinkedQueue = new MyLinkedQueue();
		Scanner input = new Scanner(System.in);
		int n;
		int menu;
		System.out.println("hw8_2: �ֵ���");
		do {
			System.out.print("1:���� 2:���� 3:��ȸ 4:ũ�� 5:��ü���� 6:����  ----> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				n = input.nextInt();
				myLinkedQueue.enQueue(n);
				break;
			case 2:
				System.out.println(myLinkedQueue.deQueue());
				break;
			case 3:
				System.out.println(myLinkedQueue.peek());
				break;
			case 4:
				System.out.println(myLinkedQueue.size());
				break;
			case 5:
				while(!myLinkedQueue.isEmpty()) {
					myLinkedQueue.deQueue();					
				}
				break;
			case 6:
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 6);
	}
}
