package mission.Question11;

public class Account {
	
	
	private String AccountNumber;
	private String AccountName;
	private long Amount ;
	private int PW ;
	private int managerPW ;

	
	public int getManagerPW() {
		return managerPW;
	}
	public void setManagerPW(int managerPW) {
		this.managerPW = managerPW;
	}
	public int getPW() {
		return PW;
	}
	public void setPW(int pW) {
		PW = pW;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getAccountName() {
		return AccountName;
	}
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	public long getAmount() {
		return Amount;
	}
	public void setAmount(long amount) {
		if(amount>1000000000) {
			System.err.println("최대 예금액은 10억입니다.");
			
		}else
		Amount = amount;
	}
	public Account() {
		AccountNumber = "계좌없음";
		AccountNumber = "이름없음";
		Amount = 0;
		PW= 0;
		managerPW = 1111;
	}
	public Account(String accountNumber, String accountName, long amount, int pW) {
		AccountNumber = accountNumber;
		AccountName = accountName;
		Amount = amount;
		PW = pW;
	}
	
	public void deposit(int money) {
		if(money>1000000) {
			System.err.println("1회 최대 입금액은 1000000원 입니다");
		}else
			Amount+= money;
		}
		
	public void withdraw(int money) {
		if(Amount>money) {
			Amount-=money;
		}
		

	}
	}
	
	
	

