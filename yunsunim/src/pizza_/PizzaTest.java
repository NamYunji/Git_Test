package pizza_;

public class PizzaTest {

//	- PizzaTest 클래스: main 메소드에서 다음을 수행
//	  (1) 피자를 하나 생성
//	  (2) 피자의 브랜드, 지름, 가격을 적절히 지정
//	  (3) 피자의 광고 문구(브랜드, 지름, 가격을 언급)를 출력
//	- 주의: 브랜드, 지름, 가격 출력시 리터럴을 사용하지 말고, 210쪽 라인 9와 같이 피자 객체의 필드를 사용할 것
	
	public static void main(String[] args) {
		
		System.out.println("----- 별점 1점 피자 가게 -----");
		Pizza pz1 = new Pizza("송민성바보피자", 13.0, 13_000);
//		pz1.printPizza();
		System.out.println(pz1.toString());
		System.out.println(pz1);
		
//		System.out.println("\n----- 별점 100점 피자 가게 -----");
//		Pizza pz2 = new Pizza("윤수대마왕님피자", 15.0, 30_000);
//		pz2.printPizza();
	}

}
