package lab1_6;

import java.util.Arrays;

public class MyArrayList<T> {
	private T[] arr;
	private int num;
	private int maxSize = 10;

	public MyArrayList() {
		arr = (T[]) new Object[maxSize];
		num = 0;
	}

	public int size() {
		return num;
	}

	public void get(int n) {
		if(num - 1 < n)
		{
			System.out.println("인덱스의 범위가 벗어났습니다.");
		}
		else
			System.out.println(arr[n]);
	}

	// index에 값을 넣는 add
	public boolean add(int index, T n) {
		if(index <= num) {
			if(num == maxSize) {
				maxSize *= 2;
				T[] temp = (T[]) new Object[maxSize];

				for (int i = 0; i < arr.length; i++) {
					temp[i] = arr[i];
				}

				arr = (T[]) new Object[maxSize];

				for (int i = 0; i < temp.length; i++) {
					arr[i] = temp[i];
				}

				for(int i = num; i < index; i--) {
					arr[i] = arr[i -1];
				}
				arr[index] = n;
				num++;
				return true;
			}
			else {
				for(int i = num; i > index; i--) {
					arr[i] = arr[i -1];
				}
				arr[index] = n;
				num++;
				return true;
			}
		}
		else {
			System.out.println("잘못된 인덱스 값 입니다.");
			return false;
		}
	}

	// 맨 뒤에 값을 넣는 add
	public boolean add(T n) {
		if(num == maxSize) {
			maxSize *= 2;
			T[] temp = (T[]) new Object[maxSize];

			for (int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}

			arr = (T[]) new Object[maxSize];

			for (int i = 0; i < temp.length; i++) {
				arr[i] = temp[i];
			}

			arr[num] = n;
			num++;
			return true;
		}
		else {
			arr[num] = n;
			num++;
			return true;
		}
	}

	public T remove(int n) {
		if (n < num) {
			T removeData = arr[n];
			for(int i = n; i < num; i++) {
				arr[n] = arr[n + 1];
			}
			num--;
			return removeData;
		}
		else {
			System.out.println("잘못된 인덱스 값 입니다.");
			return null;			
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();

		sb.append("list= ");
		for (int i = 0; i < num; i++) {
			sb.append(arr[i]);
			sb.append(" ");
		}
		return sb.toString();
	}
}