package lab1_5;

import java.math.BigDecimal;

public class Test {
	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal("3.0");
		BigDecimal b2 = new BigDecimal("2.345");
		System.out.println(b1.add(b2));
	}
}