package hw7_2;
import java.util.EmptyStackException;

public class MyLinkedStack {
	private class Node{
		int data;
		Node link;
	}
	private Node top = null;
	public void push(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (top == null)
			top = newNode;
		else {
			newNode.link = top;
			top = newNode;
		}
	}
	
	public int pop(){
		if(top == null)
			throw new EmptyStackException();
		int n = top.data;
		if (top.link != null) {
			top = top.link;			
		}
		else {
			top = null;
		}
		return n;
	}
	
	public int peek() {
		if(top == null)
			throw new EmptyStackException();
		return top.data;
	}
	
	public boolean isEmpty() {
		if(top == null)
			return true;
		else
			return false;
	}
}
