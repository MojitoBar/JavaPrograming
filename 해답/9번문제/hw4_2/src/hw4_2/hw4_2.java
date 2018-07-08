package hw4_2;

import java.util.Random;

public class hw4_2 {
	public static void main(String[] args) {
		Random random = new Random();
		char arr[][] = new char [5][5];
		int answer[][] = new int [2][20];
		
		int x = 0;
		int y = 0;
		
		int p = random.nextInt(4);
		int q = random.nextInt(4);
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = '.';
			} 
		}
		
		
		arr[p][q] = 'G';
		
		int z = 0;
		int k = 0;
		int trigger = 0;
		// 0 : up  1 : down  2 : left  3 : right
		for (k = 0; k < 20; k++) {			
			int a = random.nextInt(4);

			switch (a) {
			case 0:
				if ((y - 1) >= 0) {
					if (x == p && y - 1 == q)
						trigger = 1;
					arr[x][--y] = '#';
					answer[0][z] = x;
					answer[1][z++] = y;
				}
				else
					k--;
				break;
			case 1:
				if ((y + 1) <= 4) {
					if (x == p && y + 1 == q)
						trigger = 1;
					arr[x][++y] = '#';
					answer[0][z] = x;
					answer[1][z++] = y;
				}
				else
					k--;
				break;
			case 2:
				if ((x - 1) >= 0) {
					if (x - 1 == p && y == q)
						trigger = 1;
					arr[--x][y] = '#';
					answer[0][z] = x;
					answer[1][z++] = y;
				}
				else
					k--;
				break;
			case 3:
				if ((x + 1) <= 4) {
					if (x + 1 == p && y == q)
						trigger = 1;
					arr[++x][y] = '#';
					answer[0][z] = x;
					answer[1][z++] = y;
				}
				else
					k--;
				break;
			default:
				break;
			}
			
			if (trigger == 1)
				break;
		}
		
		arr[0][0] = 'S';
		arr[p][q] = 'G';

		System.out.println("출발 = (0,0)");
		System.out.println("목표 = (" + p + "," + q + ")");

		System.out.print("이동경로 = ");
		
		k = k < 20 ? k + 1 : k;
		
		for (int i = 0; i < k; i++) {
			System.out.print("(" + answer[0][i] + "," + answer[1][i] + ")");
		}
		
		System.out.println("");
		System.out.println("--------------------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("--------------------");
		
		if (trigger == 1)
			System.out.println("성공");
		else
			System.out.println("실패");
	}
}
