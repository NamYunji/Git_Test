package point;

//* ���ϸ�: Point.java
//* ����:  x ��ǥ�� ���� 1���� ���� ǥ���ϴ� Point Ŭ������ ����

public class Point {

	// (1) �ʵ�: double�� x ��ǥ
	double x = 0;

	// (2) move() �޼ҵ� : double�� �Ű������� �� ����ŭ x ��ǥ�� �̵�
	void move(double offset) {
		x += offset;
	}

	// (3) move() �޼ҵ� : �Ű������� ���� �ʰ� x��ǥ�� 1��ŭ �̵�
	void move() {
		x++;
	}

	// (4) distance() �޼ҵ� : Point�� �Ű������� �޾�, �Ű������� ���� ���� ���� ���� �Ÿ��� ���Ͽ� ���� 
	public int distance() {
		
		return ;
	}

	// toString() �޼ҵ�: Point�� �Ӽ��� ���ڿ��� ����� ���� - 
	@Override
	public String toString() {
		return "Point [x=" + x + "]";
	}

}
