package points;

public class PointsTest {

	public static void main(String[] args) {

		// (6) Point ��ü p1, p2�� ����
		Points p1 = new Points();
		Points p2 = new Points();

		// (7) p1�� 4.5 ��ŭ �̵�
		// p2�� -1.0��ŭ �̵�, p1�� 1.0��ŭ �ٽ� �� �� �̵�
		p1.move(4.5);
		p2.move(-1.0);
		p1.move(1.0);

		// (8) p1�� p2�� �Ÿ��� ��� *******
		System.out.println(p1.distance(p2));

		// (9) p1�� p2�� ���� ��ǥ
		System.out.println("p1�� ���� ��ǥ : " + p1.getX());
		System.out.println("p2�� ���� ��ǥ : " + p2.getX());



	}
}
