package point;

public class PointTest {
	public static void main(String[] args) {
		System.out.println("lab5_4: ȫ�浿");

		// (5) Point ��ü p1, p2�� ����
		Point p1 = new Point();
		Point p2 = new Point();

		// (6) p1�� 4.5 ��ŭ �̵�, p2�� -1.0��ŭ �̵�, p1�� 1.0��ŭ �ٽ� �� �� �̵�
		p1.move(4.5);
		p2.move(-1.0);
		p1.move(1.0);

		// (7) p1�� �̵�(�Ű����� ����)
		p1.move();

		// (8) p1�� p2�� �Ÿ��� ��� *******
		
	}

}
