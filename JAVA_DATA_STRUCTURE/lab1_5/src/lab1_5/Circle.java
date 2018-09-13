package lab1_5;

import java.util.Random;

public class Circle {
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public float getWidth() {
		return this.radius * this.radius * 3.14f;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Random random = new Random();
		
		Circle circle1 = new Circle(2);
		Circle circle2 = new Circle(random.nextInt(4) + 1);
		
		System.out.println("lab1_5: ¡÷µøºÆ");
		
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		
		System.out.println(circle1.equals(circle2));
		
		System.out.println(circle1.hashCode());
		System.out.println(circle2.hashCode());
		
		System.out.println(circle1.getWidth());
		System.out.println(circle2.getWidth());
	}
}