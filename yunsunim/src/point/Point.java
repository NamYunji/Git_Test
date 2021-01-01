package point;

//* 파일명: Point.java
//* 내용:  x 좌표를 갖는 1차원 점을 표현하는 Point 클래스를 정의

public class Point {

	// (1) 필드: double형 x 좌표
	double x = 0;

	// (2) move() 메소드 : double형 매개변수를 그 값만큼 x 좌표를 이동
	void move(double offset) {
		x += offset;
	}

	// (3) move() 메소드 : 매개변수를 받지 않고 x좌표를 1만큼 이동
	void move() {
		x++;
	}

	// (4) distance() 메소드 : Point형 매개변수를 받아, 매개변수로 받은 점과 현재 점의 거리를 구하여 리턴 
	public int distance() {
		
		return ;
	}

	// toString() 메소드: Point의 속성을 문자열로 만들어 리턴 - 
	@Override
	public String toString() {
		return "Point [x=" + x + "]";
	}

}
