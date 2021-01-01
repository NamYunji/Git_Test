package bankaccount_;

//- BankAccount Ŭ���� - ������¸� ��Ÿ���� Ŭ����

public class BankAccount {

//�ʵ� : �ܾ�(balance)
	private int balance = 0;

// �����ڴ� �⺻�����ڸ� ����Ұ�
	public BankAccount() {
		super();
	}

//        �ܾ���ȸ(getBalance)
//Q: getBalance()�� �Ű������� ���� Ÿ����?  -- �Ű����� ����, �ܾ� ����
	public int getBalance() {
		return balance;

	}

// �޼ҵ� : �Ա�(deposit)
//Q: deposit,withdraw()�� �Ű������� ���� Ÿ����? -- �Ű������� ��ݾ�, ���� Ÿ�Ծ���
	public void deposit(int money) {
		balance += money;

	}

//        ���(withdraw) = ��ݾ��� �ܾ׺��� ũ�� ��ݺҰ� ���
	public void withdraw(int money) {
		if (balance >= money)
			balance -= money;
		else
			System.out.println("�ܾ׺���");

	}

}