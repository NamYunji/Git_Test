package bank;

public class BankAccountTest {

//	- BankAccountTest 클래스 - main 메소드에서 다음을 수행
	public static void main(String[] args) {

//	   (1) 은행계좌 객체를 하나 생성
		BankAccount account = new BankAccount();
//	   (2) 계좌에 2000원을 입금 -- deposit() 호출
		account.deposit(2_000);
//	   (3) 계좌에 3000원을 입금 -- deposit() 호출
		account.deposit(3_000);
//	   (4) 계좌의 잔액 필드를 출력
//	   (5) 계좌를 잔액조회(getBalance() 호출)하여 잔액을 알아내어 출력 ****
		System.out.println("잔액 = " + account.getBalance());

//	   (6) 계좌에서 1000원을 출금 ****
		account.withdraw(10_000);

//	   (7) 계좌를 잔액조회하여 잔액을 알아내어 출력 ****
		System.out.println("잔액 = " + account.getBalance());

		public void printstdtIDNum() {
			
		}
	}

}
