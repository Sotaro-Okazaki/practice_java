package practice14;

public class Account {
	private String accountNumber;
	private int balance;
	
	public String getAccountNumber() { return this.accountNumber; }
	public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
	public int getBalance() { return this.balance; }
	public void setBalance(int balance) { this.balance = balance; }

	public String toString() {
		return "￥￥" + this.balance + "口座番号：" + this.accountNumber;  
	}
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if(o instanceof Account) {
			Account a = (Account)o;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if (an1.contentEquals(an2)) {
				return true;
			}
		}
	return false;
	}

}
