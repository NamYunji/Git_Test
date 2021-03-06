package television_;

//- TelevisionTest 클래스: main 메소드에서 다음을 수행

public class TelevisionTest {
	public static void main(String[] args) {
//(1) 크기가 3인 텔레비전 배열에 텔레비전을 생성하여 저장
		int[] arr = new int [3];
		Television[] tv = new Television[3];
		
//(2) 텔레비전 채널을 7, 9, 11로 지정
		//arr[0] = 1;
		tv[0] = new Television(7);
		tv[0] = new Television(); 
		System.out.println(tv[0].getChannel());
		System.out.println("tv0의 주소는" + tv[0].hashCode());
		tv[0] = new Television(20);
//		tv[0].setChannel(20);
		System.out.println("tv0의 주소는" + tv[0].hashCode());
		
		tv[1] = new Television(9);
		tv[2] = new Television(11);
//(3) 반복문을 이용하여 배열에 저장된 모든 텔레비전의 채널을 출력
		System.out.println("---채널---");
		for (int i = 0; i < tv.length; i++) {
			System.out.println("채널 " + tv[i].getChannel());
		}
	}
}
