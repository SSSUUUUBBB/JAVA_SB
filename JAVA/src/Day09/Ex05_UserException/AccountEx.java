package Day09.Ex05_UserException;

public class AccountEx {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		// 10000 입금
		account.deposit(10000);
		
		// 20000 출금
		try {
			account.withdraw(20000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
		
	}
}
