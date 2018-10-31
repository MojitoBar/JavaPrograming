package hw7_1;

public class MyArrayStack {
	private int top = -1;
	private int[] arr;
	MyArrayStack(int n){
		arr = new int[n];
	}
	MyArrayStack() {
		arr = new int[5];
	}
	
	public void push(int n) {
		if (!isFull())
			arr[++top] = n;
		else
			System.out.println("Ω∫≈ÿ¿Ã ∞°µÊ√°Ω¿¥œ¥Ÿ.");
	}
	public int pop() {
		return arr[top--];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public int stackSum() {
		int sum = 0;
		while(top != -1) {
			sum += arr[top--];
		}
		return sum;
	}
	
	public boolean isFull() {
		if (top == arr.length-1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}
}