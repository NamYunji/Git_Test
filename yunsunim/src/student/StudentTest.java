package student;

public class StudentTest {

	public static void main(String[] args) {

//	 (1) �л� ��ü�� ����
		Student stdt = new Student();
//	 (2) �л� �й��� ������ ����
		System.out.print("�й� = " );
		stdt.setStdtIDNum(20160085);
//	 (3) �л� ��ü�� �й��� ��ȸ�Ͽ� ���		
		System.out.println(stdt.getStdtIDNum());

	}

}