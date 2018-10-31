package hw7_3;

import java.util.EmptyStackException;

public class MyCharacterStack {
	private class Node{
		char data;
		Node link;
	}
	Node top = null;
	
	public void push(char data) {
		Node newNode = new Node();
		newNode.data = data;
		if (top == null)
			top = newNode;
		else {
			newNode.link = top;
			top = newNode;
		}
	}
	
	public char pop(){
		if(top == null)
			throw new EmptyStackException();
		char n = top.data;
		if (top.link != null) {
			top = top.link;			
		}
		else {
			top = null;
		}
		return n;
	}
	
	public char peek() {
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
