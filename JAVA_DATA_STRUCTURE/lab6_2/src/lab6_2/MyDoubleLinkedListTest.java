package lab6_2;

import java.util.Scanner;

public class MyDoubleLinkedListTest {
	public static void main(String[] args) {
		MyDoubleLinkedList list = new MyDoubleLinkedList();
		Scanner input = new Scanner(System.in);
		int n;
		int menu;
		System.out.println("hw6_2: 주동석");
		do {
			System.out.print("1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:삭제 8:왕복출력 9:종료 ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println(list.size());
				break;
			case 3:
				System.out.print("정수 입력: ");
				n = input.nextInt();
				list.addFirst(n);
				break;
			case 4:
				System.out.print("정수 입력: ");
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
				System.out.print("정수 입력: ");
				n = input.nextInt();
				if (list.remove(n)) {
					System.out.println("삭제 성공");
					break;
				}
				else {
					System.out.println("삭제 실패");
					break;
				}
			case 8:
				list.printList();
				break;
			case 9:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 9);
	}
}
