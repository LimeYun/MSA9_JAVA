package _1000_100;

import java.util.Scanner;

public class _1171 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade =sc.nextInt();
		int Class =sc.nextInt();
		int number =sc.nextInt();
		
		System.out.print(grade);
		if(Class<10) {
			System.out.print("0" + Class);
		}
		else {
			System.out.print(Class);
		}
		if(10<=number && number<100) {
			System.out.print("0" + number);
		}
		else if(number<10) {
			System.out.print("00" + number);
		}
		else {
			System.out.print(number);
		}
	}
}
