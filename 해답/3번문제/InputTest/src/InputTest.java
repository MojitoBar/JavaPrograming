import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("lab1_2: �ֵ���\n");		
		System.out.println("���ø��� �Է��� �ּ���");
		String city = input.nextLine();
		System.out.println("�α����� �Է��� �ּ���");
		int population = input.nextInt();
		System.out.println("��� ����� �Է��� �ּ���");
		double averageDegree = input.nextDouble();
		
		System.out.println("���ø� : " + city);
		System.out.println("�α��� : " + population);
		System.out.println("��տµ� : " + averageDegree);
	}
}
