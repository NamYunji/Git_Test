package point;

public class PointTest {
	public static void main(String[] args) {
		System.out.println("lab5_4: 홍길동");

		// (5) Point 객체 p1, p2를 생성
		Point p1 = new Point();
		Point p2 = new Point();

		// (6) p1을 4.5 만큼 이동, p2는 -1.0만큼 이동, p1을 1.0만큼 다시 한 번 이동
		p1.move(4.5);
		p2.move(-1.0);
		p1.move(1.0);

		// (7) p1만 이동(매개변수 없이)
		p1.move();

		// (8) p1과 p2의 거리를 출력 *******
		
	}

}
