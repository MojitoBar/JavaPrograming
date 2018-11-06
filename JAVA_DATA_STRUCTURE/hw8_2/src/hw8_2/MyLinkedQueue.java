//***************************
// 파일명: MyLinkedQueue.java
// 작성자: 주동석
// 작성일: 11.05
//***************************

package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue {
	int count;
	Node front;
	Node rear;
	
	private class Node{
		int data;
		Node link;
	}
	
	public MyLinkedQueue() {
		// TODO Auto-generated constructor stub
		count = 0;
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		if(front == null)
			return true;
		else
			return false;
	}
	
	public void enQueue(int n) {
		Node newNode = new Node();
		newNode.data = n;
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			count++;
		}
		else {
			rear.link = newNode;
			rear = newNode;
			count++;
		}
	}
	
	public int deQueue() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		else {
			count--;
			int n = front.data;
			front = front.link;
			return n;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		else {
			int n = front.data;
			return n;
		}
	}
	
	public int size() {
		return count;
	}
}
