package lab6_1;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {

//(1) �л� ��ü�� �ϳ� ����(s1�̶�� ����)
		System.out.println("------- s1 -------");
		Student s1 = new Student();
//(2) ����ڷκ��� �Է¹��� ������ s1�� �й�, �̸�, ������ ���� - �ݵ�� �й�, �̸�, ���� ������ �Է¹��� ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("�й�, �̸�, ���� �� �Է�");
		s1.setStdtIDnum(scanner.nextInt());
		scanner.nextLine();
		s1.setName(scanner.nextLine());
		s1.setScore(scanner.nextDouble());

//(3) �л� ��ü�� �ϳ� �� ����(s2��� ����)
		System.out.println("------- s2 -------");
		Student s2 = new Student();

//(4) ����ڷκ��� �Է¹��� ������ s2�� �й�, �̸�, ������ ���� - �ݵ�� �й�, �̸�, ���� ������ �Է¹��� ��
		System.out.println("�й�, �̸�, ���� �� �Է�");
		s2.setStdtIDnum(scanner.nextInt());
		scanner.nextLine();
		s2.setName(scanner.nextLine());
		s2.setScore(scanner.nextDouble());

//(5) s1�� s2�� �й� �� �ռ� �й�(���г�) ���
		if (s1.getStdtIDnum() < s2.getStdtIDnum())
			System.out.println(s1.getName() + "�� ���г��Դϴ�");
		else
			System.out.println(s2.getName() + "�� ���г��Դϴ�");
//(6) s1�� s2�� �̸� �� ����������(������..) �ռ� �̸� ���
		// compareTo compareToIgnoreCase
		if (((s1.getName()).compareToIgnoreCase(s2.getName())) <= 0)
			System.out.println(s1.getName() + "�� �̸��� �ռ�");
		else
			System.out.println(s2.getName() + "�� �̸��� �ռ�");
//(7) s1�� s2�� ���� �� ���� ���� ���
		if (s1.getScore() > s2.getScore())
			System.out.println(s1.getName() + "�� �� ���� ����");
		else
			System.out.println(s2.getName() + "�� �� ���� ����");

//(8) ���ؼ����� 1.5�� s2�� �հݿ��θ� ��ȸ�Ͽ� �հ�/���հ� ���
		if (s1.pNp(s1.getScore()) == true)
			System.out.println(s1.getName() + "�հ��Դϴ�");
		else
			System.out.println(s1.getName() + "���հ��Դϴ�");
//(9) ���ؼ����� 1.5�� s2�� �հݿ��θ� ��ȸ�Ͽ� �հ�/���հ� ���
		if (s2.pNp(s2.getScore()) == true)
			System.out.println(s2.getName() + "�հ��Դϴ�");
		else
			System.out.println(s2.getName() + "���հ��Դϴ�");

	}

}