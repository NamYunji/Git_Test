package rectangle;


public class RectangleTest {
	public static void main(String[] args) {
		
//(1) �簢�� ����(r1)
		System.out.println("r1 = 1.0");
		Rectangle r1 = new Rectangle();
//(2) ���Ǳ��� 3�� �� ����(r2)
		System.out.println("r2 = 3.0");
		Rectangle r2 = new Rectangle(3.0);
//(3) r1, r2�� ���Ǳ��̸� ��ȸ�Ͽ� ���
		System.out.println("r1�� ���� ���� = " + r1.getLine());
		System.out.println("r2�� ���� ���� = " + r2.getLine());

		
//(4) r1, r2�� ������ ��� - ���� ������� ���� ������� �޼ҵ� ȣ��
		System.out.println("r1�� ���� = " + r1.surface());
		System.out.println("r2�� ���� = " + r2.surface());
		
		System.out.println("--- r1�� ���� ���̸� r2�� ���� ---");
//(5) r1�� ���Ǳ��̸� r2�� ���Ǳ��� ������ ����
		r1.setLine(r2.getLine());
//(6) r1, r2�� ���Ǳ��̸� ��ȸ�Ͽ� ���
		System.out.println("r1�� ���� ���� = " + r1.getLine());
		System.out.println("r2�� ���� ���� = " + r2.getLine());
		
		
//(7) r1, r2�� ������ ��� - ���� ������� ���� ������� �޼ҵ� ȣ��
		System.out.println("r1�� ���� = " + r1.surface());
		System.out.println("r2�� ���� = " + r2.surface());

		System.out.println("--- r2 ���� ���̸� 5�� ���� ---");
//(8) r2�� ���Ǳ��̸� 5�� ����
		r2.setLine(5);
//(9) r1, r2�� ������ ��� - ���� ������� ���� ������� �޼ҵ� ȣ��
		System.out.println("r1�� ���� = " + r1.surface());
		System.out.println("r2�� ���� = " + r2.surface());
	}

}
