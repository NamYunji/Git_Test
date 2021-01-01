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
		String[] arr = { "딸기", "복숭아", "키위", "사과", "바나나" };
		System.out.println(arr[4]);
	}
/*	
	(1) 사용자로부터 배열 길이(size)를 입력받음
	(2) 길이가 size인 배열을 생성
	(3) 사용자로부터 size 개의 정수값을 입력받아 배열에 저장
	(4) 배열의 원소를 순서대로 모두 출력
	(5) 배열의 원소를 순서대로 모두 출력

	- 실행 예:
	lab4_1: 홍길동

	배열 길이 입력: 5

	5개의 정수 입력: 12 13 14 15 -16

	배열 = 12 13 14 15 -16
	배열 = 12 13 14 15 -16
	/*
	 * 
	 */
	public void test3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열길이 입력해");
		int[] size = new int[scanner.nextInt()];
		for (int i = 0; i < size.length; i++) {
			System.out.println("정수값 입력해");
			size[i] = scanner.nextInt();
		}
		for (int i = 0; i < size.length; i++) {
			System.out.println(size[i]);
		}
	}
	
	
	public void test4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열길이 입력해");
		int[] size = new int[scanner.nextInt()];
		for (int i = 0; i < size.length; i++) {
			System.out.println("정수값 입력해");
			size[i] = scanner.nextInt();
		}
		//for each : 출력할때 유용
		for (int i : size) {
			System.out.println(i);
		}
	}

	
	
	
	
	
	
	

}
