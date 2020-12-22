package practice;

public class Practice5_4 {
	
	public static double calcTriangleArea(double bottom, double height) {
		double area;
		area = bottom * height / 2;
		return area;
	}
	
	public static double calcCircleArea(double radius) {
		double area;
		final double PI = 3.14;
		area = radius * radius * PI;
		return area;
	}

	public static void main(String[] args) {
		System.out.println(calcTriangleArea(10.0, 5.0));
		System.out.println(calcCircleArea(5.0));
	}

}
