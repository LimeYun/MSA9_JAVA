package mission.Question11;

import java.util.Scanner;

public class Bank {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Account account = new Account();		
	
			while(true) {
				System.out.println("==========================");
				System.out.println("1. 계좌등록");
				System.out.println("2. 입금");
				System.out.println("3. 출금");
				System.out.println("4. 계좌조회");
				System.out.println("5. 계좌목록");
				System.out.println("6. 종료");
				System.out.println("==========================");
				int num = sc.nextInt();
				switch (num) {
				case 1: 
					System.out.println("입력>> 1");
					System.out.print("계좌번호>> ");
					String AccountNumber =sc.next();
					account.setAccountNumber(AccountNumber);
					System.out.print("예금주>> ");
					String AccountName = sc.next();
					account.setAccountName(AccountName);
					System.out.print("최초예금액>> ");
					long Amount = sc.nextLong();
					if(Amount>1000000000) {
						System.err.println("최대 예금액은 10억 입니다.");
						continue;
					}
					account.setAmount(Amount);
					System.out.print("비밀번호>> ");
					int PW = sc.nextInt();
					account.setPW(PW);
					System.out.println("'" +account.getAccountName()+"'" + " 님의 계좌가 개설되었습니다." );
					break;
				case 2:
					System.out.println("입력>> 2");
					System.out.println("============입금============");
					System.out.print("계좌번호>> ");
					String AccountNumber1 =sc.nextLine();
					sc.nextLine();
					if(!AccountNumber1.equals(account.getAccountNumber())) {
					// if(AccountNumber1 != account.getAccountNumber()) {
						System.err.println("찾을 수 없는 계좌입니다.");
						break;
					}
					else {
						System.out.print("입금액>> ");
						int money = sc.nextInt();
						System.out.println("'" +account.getAccountName() +"'" + " 님에게 입금하는게 맞으십니까?");
						System.out.println("1. 예");
						System.out.println("2. 아니오");
						System.out.print("입력>> ");
						int choice = sc.nextInt();
						if(choice ==1) {
							
							if(account.getAmount()+money>1000000000) {
								System.err.println("최대 예금액은 10억 입니다.");
								continue;
							}
							else if(money<1000000) {
								System.out.println("'" +account.getAccountName() +"'" + " 님의 계좌에 " + money + " 원이 입금되었습니다.");
								account.deposit(money);
							}
							else {
							account.deposit(money);
							}
						}
						else if(choice != 1 && choice != 2) {
							System.err.println("잘못된 선택입니다.");
						}
						break;
					}
				case 3:
					System.out.println("입력>> 3");
					System.out.println("============출금============");
					System.out.print("계좌번호>> ");
					String AccountNumber2 =sc.nextLine();
					sc.nextLine();
					if(AccountNumber2!= account.getAccountNumber()) {
						System.err.println("찾을 수 없는 계좌입니다.");
						continue;
					}
					else {
					System.out.print("비밀번호>> ");
					int PW1 = sc.nextInt();
					if(PW1 != account.getPW()) {
						System.err.println("비밀번호가 다릅니다!");
						break;
					}
					else {
						System.out.print("출금액>> ");
						int money1 = sc.nextInt();
						System.out.println("'" +account.getAccountName() +"'" + " 님의 계좌에 " + money1 + " 원이 출금되었습니다.");
						account.withdraw(money1);
						break;
					 }
					}
				case 4:
					System.out.println("입력>> 4");
					System.out.println("============계좌조회============");
					System.out.print("계좌번호>> ");
					String AccountNumber3 =sc.nextLine();
					sc.nextLine();
					if(AccountNumber3!= account.getAccountNumber()) {
						System.err.println("찾을 수 없는 계좌입니다.");
						continue;
					}
					else {
					System.out.print("비밀번호>> ");
					int PW2 = sc.nextInt();
					if(PW2 != account.getPW()) {
						System.err.println("비밀번호가 다릅니다!");
						break;
					}
					else {
						System.out.println("'" +account.getAccountName() +"'" + " 님의 계좌잔액은 " + account.getAmount() + " 원 입니다.");
						break;
					 }
					}
				case 5:
					System.out.println("입력>> 5");
					System.out.print("관리자 비밀번호>> ");
					int managerPW1 = sc.nextInt();
					sc.nextLine();
					if(managerPW1 != account.getManagerPW()) {
						System.err.println("비밀번호가 다릅니다!");
						break;
					}
					else {
						System.out.println("============계좌목록============");
					System.out.println("예금주\t\t계좌번호\t\t잔고");
					System.out.println(account.getAccountName() + "\t\t" + account.getAccountNumber() + "\t\t" + account.getAmount());
						break;
					}
					
				case 6:
					System.out.println("입력>> 6");
					System.out.println("시스템을 종료합니다.");
					return;
				}
				}
		
			}
		}
