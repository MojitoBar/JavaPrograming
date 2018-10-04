package lab6_1;

import java.util.Scanner;

public class MyLinkedListTest {
	public static void main (String args[]) {
		MyLinkedList myLinkedList = new MyLinkedList();
		Scanner input = new Scanner(System.in);
		int n;
		int menu;
		System.out.println("hw6_1: 주동석");
		do {
			System.out.print("1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:종료 ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println(myLinkedList.toString());
				break;
			case 2:
				System.out.println(myLinkedList.getLength());
				break;
			case 3:
				System.out.print("정수 입력: ");
				n = input.nextInt();
				myLinkedList.addFirst(n);
				break;
			case 4:
				System.out.print("정수 입력: ");
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
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 7);
	}	
}
