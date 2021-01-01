package circle;


public class Circle {
	
// 필드 : 
//  반지름(실수형)
	private double radius = 1.0;
///////////////////////////////////////////////////////////
	
//  매개변수 없이 반지름을 1.0으로 초기화하는 constructor 	
	public Circle() {
		super();
		double radius = 1.0;
	}
	
//  반지름을 매개변수로 받아 초기화하는 constructor 
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
//////////////////////////////////////////////////////////
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
///////////////////////////////////////////////////////////
//  면적계산 메소드 - 매개변수 없음
	public double surfaceArea() {
		final double PI = 3.14;
		double sa = PI*getRadius()*getRadius();
		return sa;
	}

	

}
