package string_;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {

//(1) ����ڷκ��� ���̰� 5 �̻��� �� ���� ���ڿ� s1, s2�� �Է¹���
		Scanner scanner = new Scanner(System.in);
		System.out.println("���̰� 5�̻��� ���ڿ� 2�� �Է� : ");
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		
//(2) s1�� ���� ���
		System.out.println(s1.length());
		
//(3) s1�� ù��° ���� ���
		System.out.println(s1.charAt(0));
		
//(4) s1�� �ι�°~�׹�° �κй��ڿ�(��, ���� 3��) ���
		System.out.println(s1.substring(1, 4));
		
//(5) s1�� �빮�ڷ� ������ ��� ��� - ����: s1�� ����Ǹ� �ȵ�
		System.out.println(s1.toUpperCase());
		
//(6) s1�� s2�� �������� ���� ���
		if(s1.equals(s2))
		System.out.println("s1�� s2�� �����մϴ�");
		else
			System.out.println("s1�� s2�� �������� �ʽ��ϴ�");
//(7) s1�� s2�� ��ҹ��� ���� ���ָ� �������� ���� ���
//		if(s1.toLowerCase().equals(s2.toLowerCase()))
//		System.out.println("s1�� s2�� �����մϴ�");
//		else
//			System.out.println("s1�� s2�� �������� �ʽ��ϴ�");
		if(s1.compareToIgnoreCase(s2) == 0)
			System.out.println("s1�� s2�� �����մϴ�");
		else
			System.out.println("s1�� s2�� �������� �ʽ��ϴ�");
	}

}