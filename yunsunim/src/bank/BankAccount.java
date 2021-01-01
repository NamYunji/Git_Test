package bank;

// * - BankAccount 클래스 - 은행계좌를 나타내는 클래스
public class BankAccount {
	// 필드 : 잔액(balance)
	private int balance = 5000;

	// 생성자는 기본생성자를 사용할것
	public BankAccount() {
		super();
	}

	// 잔액조회 : getBalance() / -- 매개변수 없고, 잔액 리턴
	public int getBalance() {
		return balance;
	}

	// 메소드 : 입금(deposit)
	public void deposit(int money) {
		balance += money;
	}

	// 출금(withdraw) **** 매개변수는 출금액, 리턴타입없음
	public void withdraw(int money) {
	if(balance > money)
		balance -= money;
	else
		System.out.println("잔.부ㅋ");
	}

}
