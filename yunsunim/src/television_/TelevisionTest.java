package television_;

//- TelevisionTest Ŭ����: main �޼ҵ忡�� ������ ����

public class TelevisionTest {
	public static void main(String[] args) {
//(1) ũ�Ⱑ 3�� �ڷ����� �迭�� �ڷ������� �����Ͽ� ����
		int[] arr = new int [3];
		Television[] tv = new Television[3];
		
//(2) �ڷ����� ä���� 7, 9, 11�� ����
		//arr[0] = 1;
		tv[0] = new Television(7);
		tv[0] = new Television(); 
		System.out.println(tv[0].getChannel());
		System.out.println("tv0�� �ּҴ�" + tv[0].hashCode());
		tv[0] = new Television(20);
//		tv[0].setChannel(20);
		System.out.println("tv0�� �ּҴ�" + tv[0].hashCode());
		
		tv[1] = new Television(9);
		tv[2] = new Television(11);
//(3) �ݺ����� �̿��Ͽ� �迭�� ����� ��� �ڷ������� ä���� ���
		System.out.println("---ä��---");
		for (int i = 0; i < tv.length; i++) {
			System.out.println("ä�� " + tv[i].getChannel());
		}
	}
}