package points;

public class PointsTest {

	public static void main(String[] args) {

		// (6) Point 객체 p1, p2를 생성
		Points p1 = new Points();
		Points p2 = new Points();

		// (7) p1을 4.5 만큼 이동
		// p2는 -1.0만큼 이동, p1을 1.0만큼 다시 한 번 이동
		p1.move(4.5);
		p2.move(-1.0);
		p1.move(1.0);

		// (8) p1과 p2의 거리를 출력 *******
		System.out.println(p1.distance(p2));

		// (9) p1과 p2의 현재 좌표
		System.out.println("p1의 현재 좌표 : " + p1.getX());
		System.out.println("p2의 현재 좌표 : " + p2.getX());



	}
}
