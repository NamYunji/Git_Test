package bank;

public class BankAccountTest {

//	- BankAccountTest Ŭ���� - main �޼ҵ忡�� ������ ����
	public static void main(String[] args) {

//	   (1) ������� ��ü�� �ϳ� ����
		BankAccount account = new BankAccount();
//	   (2) ���¿� 2000���� �Ա� -- deposit() ȣ��
		account.deposit(2_000);
//	   (3) ���¿� 3000���� �Ա� -- deposit() ȣ��
		account.deposit(3_000);
//	   (4) ������ �ܾ� �ʵ带 ���
//	   (5) ���¸� �ܾ���ȸ(getBalance() ȣ��)�Ͽ� �ܾ��� �˾Ƴ��� ��� ****
		System.out.println("�ܾ� = " + account.getBalance());

//	   (6) ���¿��� 1000���� ��� ****
		account.withdraw(10_000);

//	   (7) ���¸� �ܾ���ȸ�Ͽ� �ܾ��� �˾Ƴ��� ��� ****
		System.out.println("�ܾ� = " + account.getBalance());

		public void printstdtIDNum() {
			
		}
	}

}