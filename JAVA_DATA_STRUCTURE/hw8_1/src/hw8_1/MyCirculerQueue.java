package hw8_1;

import java.util.NoSuchElementException;

public class MyCirculerQueue {
	int arr[];
	int size;
	int count;
	int front;
	int rear;
	
	public MyCirculerQueue(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
		size = n;
		count = 0;
		front = 0;
		rear = 0;
	}
	
	public boolean isEmpty() {
		if(count == 0)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(count == size)
			return true;
		else
			return false;
	}
	
	public void enQueue(int n) {
		if(!isFull()) {
			arr[++rear % 5] = n;
			count += 1;
		}
		else
			System.out.println("큐가 가득차서 값을 저장할 수 없습니다.");
	}
	
	public int deQueue() {
		int n;
		if(!isEmpty()) {			
			n = arr[++front % 5];
			count -= 1;
		}
		else
			throw new NoSuchElementException();
		return n;
	}
	
	public int peek() {
		if(!isEmpty()) {
			return arr[(front + 1) % 5];
		}
		else
			throw new NoSuchElementException();
	}
	
	public int size() {
		return count;
	}
}
