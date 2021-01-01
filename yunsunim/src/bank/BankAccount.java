package bank;

// * - BankAccount Ŭ���� - ������¸� ��Ÿ���� Ŭ����
public class BankAccount {
	// �ʵ� : �ܾ�(balance)
	private int balance = 5000;

	// �����ڴ� �⺻�����ڸ� ����Ұ�
	public BankAccount() {
		super();
	}

	// �ܾ���ȸ : getBalance() / -- �Ű����� ����, �ܾ� ����
	public int getBalance() {
		return balance;
	}

	// �޼ҵ� : �Ա�(deposit)
	public void deposit(int money) {
		balance += money;
	}

	// ���(withdraw) **** �Ű������� ��ݾ�, ����Ÿ�Ծ���
	public void withdraw(int money) {
	if(balance > money)
		balance -= money;
	else
		System.out.println("��.�Τ�");
	}

}
