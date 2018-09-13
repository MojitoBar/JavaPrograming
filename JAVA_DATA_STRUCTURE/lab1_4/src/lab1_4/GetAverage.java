package lab1_4;

import java.util.Scanner;

public class GetAverage {
	
	static float getAverage(int arr[]) {
		int sum = 0;
		float average;
		for (int i = 0; i < arr.length; i ++) {
			sum += arr[i];
		}
		average = (float)sum / arr.length;
		return average;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int time;
		
		System.out.println("lab1_4: 주동석");
		System.out.print("정수 개수 입력: ");
		time = input.nextInt();
		
		int arr[] = new int[time];
		
		System.out.print(time + "개의 정수 입력: ");
		
		for(int i = 0; i < time; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.print("평균 = " + getAverage(arr));
	}
}
