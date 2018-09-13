package lab1_7;

import java.util.Scanner;

public class RecursionTest {
	public static void main(String[] args) {
		System.out.println("lab1_7: �ֵ���");

		Scanner input = new Scanner(System.in);
		System.out.print("���� ���� �Է�: ");
		int n = input.nextInt();

		System.out.println("1���� " + n + "������ ��(�ݺ�) = " + iterativeSum(n));
		System.out.println("1���� " + n + "������ ��(���) = " + sum(n));
		
		System.out.println("1���� " + n + "������ ��(�ݺ�) = " + iterativeFactorial(n));
		System.out.println("1���� " + n + "������ ��(���) = " + factorial(n));
		
		System.out.print(n + "���� 1���� ��� = ");
		f(n);
		System.out.println();
		
		System.out.print("1���� " + n + "���� ��� = ");
		g(n);
		System.out.println();
	}


	// (1) �ݺ� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ�
	private static int iterativeSum(int n) {
		int result = 0;
		for(int i = 1; i <= n; i++)
		{
			result += i;
		}
		return result;
	}	

	// ��� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ� 
	private static int sum(int n) {
		if(n <= 0)
			return 0;
		else
			return n + sum(n-1);
	} 

	// �ݺ� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ�
	private static int iterativeFactorial(int n) { 
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	// (2) ��� �˰����� �̿��Ͽ� 1���� n������ ���� ���ϴ� �޼ҵ� 
	private static int factorial(int n) {
		if(n <= 1)
			return 1;
		else
			return n * factorial(n - 1);
	}

	// ��� �˰����� �̿��Ͽ� n ���� 1���� ����ϴ� �޼ҵ�
	private static void f(int n) {
		if(n > 0) {
			System.out.print(n + " "); 
			f(n-1);
		}
	}

	// (3) ��� �˰����� �̿��Ͽ� 1 ���� n���� ����ϴ� �޼ҵ�
	private static void g(int n) {
		if(n >= 1) {
			g(n - 1);
			System.out.print(n + " ");
		}
	}
}