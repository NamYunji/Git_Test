package bankaccount_;

//- BankAccountTest Ŭ���� - main �޼ҵ忡�� ������ ����

public class BankAccountTest {
	public static void main(String[] args) {
		System.out.println("--- �ܾ� : 0 ---");

//(1) ������� ��ü�� �ϳ� ����
		BankAccount account = new BankAccount();

//(2) ���¿� 2000���� �Ա� -- deposit() ȣ��
		System.out.println("--- 2,000�� �Ա� ---");
		account.deposit(2_000);

//(3) ���¿� 3000���� �Ա� -- deposit() ȣ��
		System.out.println("--- 3,000�� �Ա� ---");
		account.deposit(3_000);

//(4) ������ �ܾ� �ʵ带 ���
//(5) ���¸� �ܾ���ȸ(getBalance() ȣ��)�Ͽ� �ܾ��� �˾Ƴ��� ��� ****
		System.out.println("�ܾ� : " + account.getBalance());

//(6) ���¿��� 1000���� ��� ****
		System.out.println("--- 1,000�� ��� ---");
		account.withdraw(1_000);
		System.out.println("�ܾ� : " + account.getBalance());

//(7) �ܾ׺��� ���� ����ϸ�?
		System.out.println("--- 10,000�� ��� ---");
		account.withdraw(10_000);
		System.out.println("�ܾ� : " + account.getBalance());

	}

}