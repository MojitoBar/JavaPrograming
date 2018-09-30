package lab6_1;

// 작성자 : 주동석
// 작성일자: 2018-09-27

public class MyLinkedList {
	private int num = 0;
	private Node head;
	
	MyLinkedList(){
		head = null;
	}
	
	private class Node{
		int data;
		Node link;
		
		Node(int data){
			this.data = data;
			this.link = null;
		}
	}
	
	public int getLength() {
		return num;
	}
	public void addFirst(int n) {
		num++;
		Node newNode = new Node(n);
		newNode.link = head;
		head = newNode;
	}
	public void addLast(int n) {
		num++;
		Node temp = head;
		Node newNode = new Node(n);
		if (temp != null) {
			while(temp.link != null) {
				temp = temp.link;
			}			
			temp.link = newNode;
		}
		else
			head = newNode;
	}
	public int removeFirst() {
		num--;
		int t = head.data;
		head = head.link;
		return t;
	}
	public int removeLast() {
		num--;
		Node temp = head;
		int t = 0;
		if (temp.link == null) {			
			t = temp.data;
			head = null;
			return t;
		}
		else {
			while(temp.link.link != null)
				temp = temp.link;
			t = temp.link.data;
			temp.link = null;
			return t;
		}
	}
	@Override
	public String toString() {
		String str = "";
		Node temp = head;
		while(temp != null) {
			str += temp.data + " ";
			temp = temp.link;
		}
		return "list = " + str;
	}
}
