package television;

 
//- TelevisionTest Ŭ����: main �޼ҵ忡�� ������ ����
//  (1) ũ�Ⱑ 3�� �ڷ����� �迭�� �ڷ������� �����Ͽ� ����
//  (2) �ڷ����� ä���� 7, 9, 11�� ����
//  (3) �ݺ����� �̿��Ͽ� �迭�� ����� ��� �ڷ������� ä���� ���

public class TelevisionTest {
	
	public static void main(String[] args) {
		
		Television[] tv = new Television[3];
		tv[0] = new Television(7);
		tv[1] = new Television(9);
		tv[2] = new Television(11);
		
		for (int i = 0; i < tv.length; i++) {
			System.out.println("channel = " + tv[i].getChannel());
			
		}
		
	

	
		
	}

}