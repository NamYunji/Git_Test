package points;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		ArrayTest at1 = new ArrayTest();
//		at1.test1();
//		at1.test2();
//		at1.test3();
		at1.test4();

	}



	public void test1() {
		int[] arr2 = new int[100];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i + 1;
		}

		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
	}

	public void test2() {
		String[] arr = { "����", "������", "Ű��", "���", "�ٳ���" };
		System.out.println(arr[4]);
	}
/*	
	(1) ����ڷκ��� �迭 ����(size)�� �Է¹���
	(2) ���̰� size�� �迭�� ����
	(3) ����ڷκ��� size ���� �������� �Է¹޾� �迭�� ����
	(4) �迭�� ���Ҹ� ������� ��� ���
	(5) �迭�� ���Ҹ� ������� ��� ���

	- ���� ��:
	lab4_1: ȫ�浿

	�迭 ���� �Է�: 5

	5���� ���� �Է�: 12 13 14 15 -16

	�迭 = 12 13 14 15 -16
	�迭 = 12 13 14 15 -16
	/*
	 * 
	 */
	public void test3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�迭���� �Է���");
		int[] size = new int[scanner.nextInt()];
		for (int i = 0; i < size.length; i++) {
			System.out.println("������ �Է���");
			size[i] = scanner.nextInt();
		}
		for (int i = 0; i < size.length; i++) {
			System.out.println(size[i]);
		}
	}
	
	
	public void test4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�迭���� �Է���");
		int[] size = new int[scanner.nextInt()];
		for (int i = 0; i < size.length; i++) {
			System.out.println("������ �Է���");
			size[i] = scanner.nextInt();
		}
		//for each : ����Ҷ� ����
		for (int i : size) {
			System.out.println(i);
		}
	}

	
	
	
	
	
	
	

}