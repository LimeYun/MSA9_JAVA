package _1000_200;

import java.util.Scanner;

public class _1214 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		boolean yun = (year%400==0) || (year%4==0 && year%100!=0);
		
		if(yun && month == 2){
			System.out.println(29);
		}
		else if (month == 2) {
			System.out.println(28);
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(30);
		}
		else {
			System.out.println(31);
		}
	}
}
