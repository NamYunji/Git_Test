package points;

public class Points {

	// (1) �ʵ�: double�� x ��ǥ
	private double x;

	// (2) move() �޼ҵ� : double�� �Ű������� �� ����ŭ x ��ǥ�� �̵�
	public void move(double offset) {
		x += offset;

	}

	// (3) move() �޼ҵ� : �Ű������� ���� �ʰ� x��ǥ�� 1��ŭ �̵�
	public void move() {
		x += 1;
	}

	// (4) distance() �޼ҵ�
	// Point�� �Ű������� �޾�, �Ű������� ���� ���� ���� ���� �Ÿ��� ���Ͽ� ����
	// parameter�� ��ü�� �޾ƿ�
	public double distance(Points p) {
		return (x - p.getX());

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	// (5) toString() �޼ҵ�: Point�� �Ӽ��� ���ڿ��� ����� ���� - @Override, public�� 6, 7�忡�� ���
	@Override
	public String toString() {
		return "Points [x=" + x + "]";
	}

}
