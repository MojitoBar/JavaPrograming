package lab6_2;

public class MyDoubleLinkedList {
	private class Node{
		int data;
		Node llink;
		Node rlink;
	}
	
	private Node head = null;
	
	public int size() {
		int count = 0;
		Node temp = head;
		while(temp != null) {			
			count++;
			temp = temp.rlink;
		}
		return count;
	}

	public void addFirst(int n) {
		Node newNode = new Node();
		newNode.data = n;
		if (head == null) {
			head = newNode;
		}
		else {
			newNode.rlink = head;
			head.llink = newNode;
			head = newNode;
		}
	}
	
	public void addLast(int n) {
		Node newNode = new Node();
		newNode.data = n;
		Node temp = head;
		if (temp == null) {
			head = newNode;
		}
		else {
			while(temp.rlink != null) {
				temp = temp.rlink;
			}
			temp.rlink = newNode;
			newNode.llink = temp;
		}
	}
	
	public int removeFirst() {
		int n;
		if (head == null) {
			return -1;
		}
		else {
			n = head.data;
			head.rlink.llink = null;
			head = head.rlink;
			return n;
		}
	}
	
	public int removeLast() {
		int n = 0;
		Node temp = head;
		if (temp == null) {
			return -1;
		}
		else {
			while(temp.rlink != null) {
				n = temp.rlink.data;
				temp = temp.rlink;
			}
			temp.llink.rlink = null;
		}
		return n;
	}
	
	public boolean remove(int n) {
		Node temp = head;
		if (temp == null)
			return false;
		else {
			while(temp != null) {
				if (temp.data == n) {
					// 삭제할 노드가 첫번째 노드일 경우
					if(temp.llink == null) {
						removeFirst();
						return true;
					}
					// 삭제할 노드가 마지막 노드일 경우
					else if(temp.rlink == null) {
						removeLast();
						return true;
					}
					// 삭제할 노드가 노드들 사이에 있는 경우
					else {
						temp.rlink.llink = temp.llink;
						temp.llink.rlink = temp.rlink;
						return true;
					}
				}
				temp = temp.rlink;
			}
		}
		return false;
	}
	
	public void printList() {
		String str = "(";
		Node temp;
		temp = head;
		if (temp != null) {
			while(temp.rlink != null) {
				str += temp.data + " ";
				temp = temp.rlink;
			}
			str += temp.data;
			str += ") (";
			while(temp.llink != null) {
				str += temp.data + " ";
				temp = temp.llink;
			}
			str += temp.data;
			str += ")";
			System.out.println(str);
		}
		else
			System.out.println("()()");
	}
	@Override
	public String toString() {
		String str = "list= ";
		Node temp;
		temp = head;
		while(temp != null) {
			str += temp.data + " ";
			temp = temp.rlink;
		}
		return str;
	}
}
