package points;

public class Points {

	// (1) 필드: double형 x 좌표
	private double x;

	// (2) move() 메소드 : double형 매개변수를 그 값만큼 x 좌표를 이동
	public void move(double offset) {
		x += offset;

	}

	// (3) move() 메소드 : 매개변수를 받지 않고 x좌표를 1만큼 이동
	public void move() {
		x += 1;
	}

	// (4) distance() 메소드
	// Point형 매개변수를 받아, 매개변수로 받은 점과 현재 점의 거리를 구하여 리턴
	// parameter로 객체를 받아옴
	public double distance(Points p) {
		return (x - p.getX());

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	// (5) toString() 메소드: Point의 속성을 문자열로 만들어 리턴 - @Override, public은 6, 7장에서 배움
	@Override
	public String toString() {
		return "Points [x=" + x + "]";
	}

}
