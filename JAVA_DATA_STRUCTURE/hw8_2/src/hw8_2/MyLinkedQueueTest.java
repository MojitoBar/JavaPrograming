package hw8_2;

import java.util.Scanner;


public class MyLinkedQueueTest {
	public static void main(String[]args) {
		MyLinkedQueue myLinkedQueue = new MyLinkedQueue();
		Scanner input = new Scanner(System.in);
		int n;
		int menu;
		System.out.println("hw8_2: 주동석");
		do {
			System.out.print("1:삽입 2:삭제 3:조회 4:크기 5:전체삭제 6:종료  ----> ");
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
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 6);
	}
}
