package bankaccount_;

//- BankAccount 클래스 - 은행계좌를 나타내는 클래스

public class BankAccount {

//필드 : 잔액(balance)
	private int balance = 0;

// 생성자는 기본생성자를 사용할것
	public BankAccount() {
		super();
	}

//        잔액조회(getBalance)
//Q: getBalance()의 매개변수와 리턴 타입은?  -- 매개변수 없고, 잔액 리턴
	public int getBalance() {
		return balance;

	}

// 메소드 : 입금(deposit)
//Q: deposit,withdraw()의 매개변수와 리턴 타입은? -- 매개변수는 출금액, 리턴 타입없음
	public void deposit(int money) {
		balance += money;

	}

//        출금(withdraw) = 출금액이 잔액보다 크면 출금불가 출력
	public void withdraw(int money) {
		if (balance >= money)
			balance -= money;
		else
			System.out.println("잔액부족");

	}

}
