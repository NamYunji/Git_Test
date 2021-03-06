package string_;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {

//(1) 사용자로부터 길이가 5 이상인 두 개의 문자열 s1, s2를 입력받음
		Scanner scanner = new Scanner(System.in);
		System.out.println("길이가 5이상인 문자열 2개 입력 : ");
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		
//(2) s1의 길이 출력
		System.out.println(s1.length());
		
//(3) s1의 첫번째 문자 출력
		System.out.println(s1.charAt(0));
		
//(4) s1의 두번째~네번째 부분문자열(즉, 문자 3개) 출력
		System.out.println(s1.substring(1, 4));
		
//(5) s1을 대문자로 변경한 결과 출력 - 주의: s1은 변경되면 안됨
		System.out.println(s1.toUpperCase());
		
//(6) s1과 s2가 동일한지 여부 출력
		if(s1.equals(s2))
		System.out.println("s1과 s2는 동일합니다");
		else
			System.out.println("s1과 s2는 동일하지 않습니다");
//(7) s1과 s2가 대소문자 구분 없애면 동일한지 여부 출력
//		if(s1.toLowerCase().equals(s2.toLowerCase()))
//		System.out.println("s1과 s2는 동일합니다");
//		else
//			System.out.println("s1과 s2는 동일하지 않습니다");
		if(s1.compareToIgnoreCase(s2) == 0)
			System.out.println("s1과 s2는 동일합니다");
		else
			System.out.println("s1과 s2는 동일하지 않습니다");
	}

}
