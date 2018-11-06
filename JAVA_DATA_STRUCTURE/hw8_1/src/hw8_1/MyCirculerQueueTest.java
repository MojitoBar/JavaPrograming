package hw8_1;

import java.util.Scanner;

public class MyCirculerQueueTest {
	public static void main(String[]args) {
		MyCirculerQueue myCirculerQueue = new MyCirculerQueue(5);
		Scanner input = new Scanner(System.in);
		int n;
		int menu;
		System.out.println("hw8_1: �ֵ���");
		do {
			System.out.print("1:���� 2:���� 3:��ȸ 4:ũ�� 5:��ü���� 6:����  ----> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				n = input.nextInt();
				myCirculerQueue.enQueue(n);
				break;
			case 2:
				System.out.println(myCirculerQueue.deQueue());
				break;
			case 3:
				System.out.println(myCirculerQueue.peek());
				break;
			case 4:
				System.out.println(myCirculerQueue.size());
				break;
			case 5:
				while(!myCirculerQueue.isEmpty()) {
					myCirculerQueue.deQueue();					
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
