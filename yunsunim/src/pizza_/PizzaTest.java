package pizza_;

public class PizzaTest {

//	- PizzaTest Ŭ����: main �޼ҵ忡�� ������ ����
//	  (1) ���ڸ� �ϳ� ����
//	  (2) ������ �귣��, ����, ������ ������ ����
//	  (3) ������ ���� ����(�귣��, ����, ������ ���)�� ���
//	- ����: �귣��, ����, ���� ��½� ���ͷ��� ������� ����, 210�� ���� 9�� ���� ���� ��ü�� �ʵ带 ����� ��
	
	public static void main(String[] args) {
		
		System.out.println("----- ���� 1�� ���� ���� -----");
		Pizza pz1 = new Pizza("�۹μ��ٺ�����", 13.0, 13_000);
//		pz1.printPizza();
		System.out.println(pz1.toString());
		System.out.println(pz1);
		
//		System.out.println("\n----- ���� 100�� ���� ���� -----");
//		Pizza pz2 = new Pizza("�����븶�մ�����", 15.0, 30_000);
//		pz2.printPizza();
	}

}