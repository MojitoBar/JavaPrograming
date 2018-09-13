package lab1_3;

import java.util.Random;

public class RandomNumber {
	public static void main(String args[]) {
		Random random = new Random();
		int arr[] = new int[10];
		int count[] = new int[4];
		
		for (int i = 0; i < 10; i++) {
			arr [i] = random.nextInt(4) + 1;
			
			for (int j = 0; j < 4; j++) {
				if (j + 1 == arr[i]) {
					count[j] += 1;
				}
			}
		}
		
		System.out.println("lab1_3: ÁÖµ¿¼®");
		
		System.out.print("·£´ı ³Ñ¹ö = ");
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < 4; i++) {
			System.out.println(i + 1 + "ÀÇ °¹¼ö = " + count[i]);
		}
	}
}
