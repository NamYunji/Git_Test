package circle;


public class Circle {
	
// �ʵ� : 
//  ������(�Ǽ���)
	private double radius = 1.0;
///////////////////////////////////////////////////////////
	
//  �Ű����� ���� �������� 1.0���� �ʱ�ȭ�ϴ� constructor 	
	public Circle() {
		super();
		double radius = 1.0;
	}
	
//  �������� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor 
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
//  ������� �޼ҵ� - �Ű����� ����
	public double surfaceArea() {
		final double PI = 3.14;
		double sa = PI*getRadius()*getRadius();
		return sa;
	}

	

}
