package bankaccount_;

//- BankAccountTest 클래스 - main 메소드에서 다음을 수행

public class BankAccountTest {
	public static void main(String[] args) {
		System.out.println("--- 잔액 : 0 ---");

//(1) 은행계좌 객체를 하나 생성
		BankAccount account = new BankAccount();

//(2) 계좌에 2000원을 입금 -- deposit() 호출
		System.out.println("--- 2,000원 입금 ---");
		account.deposit(2_000);

//(3) 계좌에 3000원을 입금 -- deposit() 호출
		System.out.println("--- 3,000원 입금 ---");
		account.deposit(3_000);

//(4) 계좌의 잔액 필드를 출력
//(5) 계좌를 잔액조회(getBalance() 호출)하여 잔액을 알아내어 출력 ****
		System.out.println("잔액 : " + account.getBalance());

//(6) 계좌에서 1000원을 출금 ****
		System.out.println("--- 1,000원 출금 ---");
		account.withdraw(1_000);
		System.out.println("잔액 : " + account.getBalance());

//(7) 잔액보다 많이 출금하면?
		System.out.println("--- 10,000원 출금 ---");
		account.withdraw(10_000);
		System.out.println("잔액 : " + account.getBalance());

	}

}
