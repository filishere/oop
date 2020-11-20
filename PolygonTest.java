package oop;

public class PolygonTest {
	public static void main(String[] args) {
		
		RegularPolygon triangle = new RegularPolygon();
		RegularPolygon hexagon = new RegularPolygon(6, 4);
		RegularPolygon decagon = new RegularPolygon (10,4, 5.6, 7.8);
		
		System.out.println("The perimeter of the triangle is:" + triangle.getPerimeter() + " ,the area: " + triangle.getArea());
		System.out.println("The perimeter of the hexagon is:" + hexagon.getPerimeter() + " ,the area: " + hexagon.getArea());
		System.out.println("The perimeter of the decagon is:" + decagon.getPerimeter() + " ,the area: " + decagon.getArea());
		
		
	}
}
