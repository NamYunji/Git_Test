package rectangle;


public class RectangleTest {
	public static void main(String[] args) {
		
//(1) 사각형 생성(r1)
		System.out.println("r1 = 1.0");
		Rectangle r1 = new Rectangle();
//(2) 변의길이 3인 원 생성(r2)
		System.out.println("r2 = 3.0");
		Rectangle r2 = new Rectangle(3.0);
//(3) r1, r2의 변의길이를 조회하여 출력
		System.out.println("r1의 변의 길이 = " + r1.getLine());
		System.out.println("r2의 변의 길이 = " + r2.getLine());

		
//(4) r1, r2의 면적을 출력 - 직접 계산하지 말고 면적계산 메소드 호출
		System.out.println("r1의 면적 = " + r1.surface());
		System.out.println("r2의 면적 = " + r2.surface());
		
		System.out.println("--- r1의 변의 길이를 r2로 수정 ---");
//(5) r1의 변의길이를 r2의 변의길이 값으로 지정
		r1.setLine(r2.getLine());
//(6) r1, r2의 변의길이를 조회하여 출력
		System.out.println("r1의 변의 길이 = " + r1.getLine());
		System.out.println("r2의 변의 길이 = " + r2.getLine());
		
		
//(7) r1, r2의 면적을 출력 - 직접 계산하지 말고 면적계산 메소드 호출
		System.out.println("r1의 면적 = " + r1.surface());
		System.out.println("r2의 면적 = " + r2.surface());

		System.out.println("--- r2 변의 길이를 5로 수정 ---");
//(8) r2의 변의길이를 5로 지정
		r2.setLine(5);
//(9) r1, r2의 면적을 출력 - 직접 계산하지 말고 면적계산 메소드 호출
		System.out.println("r1의 면적 = " + r1.surface());
		System.out.println("r2의 면적 = " + r2.surface());
	}

}
