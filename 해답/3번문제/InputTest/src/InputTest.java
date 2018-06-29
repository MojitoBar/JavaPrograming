import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("lab1_2: 주동석\n");		
		System.out.println("도시명을 입력해 주세요");
		String city = input.nextLine();
		System.out.println("인구수를 입력해 주세요");
		int population = input.nextInt();
		System.out.println("평균 기온을 입력해 주세요");
		double averageDegree = input.nextDouble();
		
		System.out.println("도시명 : " + city);
		System.out.println("인구수 : " + population);
		System.out.println("평균온도 : " + averageDegree);
	}
}
