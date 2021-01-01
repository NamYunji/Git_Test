package circle;

public class CircleTest {

	public static void main(String[] args) {
		
		System.out.println("--- ������---");
//	 (1) �� ����(c1)
		Circle c1 = new Circle();
//	 (2) �������� 2.5�� �� ����(c2)
		Circle c2 = new Circle(2.5);
		
//	 (3) c1, c2�� �������� ��ȸ�Ͽ� ���
		System.out.println();
		System.out.println("--- c1, c2�� �������� ��ȸ�Ͽ� ��� ---");
		System.out.println("c1�� ������ = " + c1.getRadius());
		System.out.println("c2�� ������ = " + c2.getRadius());
		
//	 (4) c1, c2�� ������ ��� - ���� ������� ���� ������� �޼ҵ� ȣ��
		System.out.println();
		System.out.println("--- c1, c2�� ������ ��� ---");
		System.out.println("c1�� ���� = " + c1.surfaceArea());
		System.out.println("c2�� ���� = " + c2.surfaceArea());
		
//	 (5) c1�� �������� c2�� ������ ������ ����
		System.out.println();
		System.out.println("--- c1�� �������� c2�� ������ ������ ���� ---");
		c2.setRadius(c1.getRadius());
		
//	 (6) c1, c2�� �������� ��ȸ�Ͽ� ���
		System.out.println();
		System.out.println("--- c1, c2�� �������� ��ȸ�Ͽ� ��� ---");
		System.out.println("c1�� ������ = " + c1.getRadius());
		System.out.println("c2�� ������ = " + c2.getRadius());
		
		
//	 (7) c1, c2�� ������ ��� - ���� ������� ���� ������� �޼ҵ� ȣ��
		System.out.println();
		System.out.println("--- c1, c2�� ������ ��� ---");
		System.out.println("c1�� ���� = " + c1.surfaceArea());
		System.out.println("c2�� ���� = " + c2.surfaceArea());

//	 (8) c2�� �������� 1.5�� ����
		System.out.println();
		System.out.println("--- c2�� �������� 1.5�� ���� ---");
		c2.setRadius(1.5);
		
//	 (9) c1, c2�� ������ ��� - ���� ������� ���� ������� �޼ҵ� ȣ��
		System.out.println();
		System.out.println("--- c1, c2�� ������ ��� ---");
		System.out.println("c1�� ���� = " + c1.surfaceArea());
		System.out.println("c2�� ���� = " + c2.surfaceArea());
		
	}

}