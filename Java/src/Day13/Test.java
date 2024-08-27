package Day13;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			int num = sc.nextInt();
			switch (num) {
			case 1 :
				System.out.print("예금액 > ");
				int deposit = sc.nextInt();
				balance+=deposit;
				break;
			case 2 :
				System.out.print("출금액 > ");
				int withdraw = sc.nextInt();
				balance-=withdraw;
				break;
			case 3 :
				System.out.println("잔고 > " + balance);
				break;
			case 4 :
				break;
			default:
				System.err.println("잘못된 번호 선택입니다.");
				break;
			}
			if(num==4) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
