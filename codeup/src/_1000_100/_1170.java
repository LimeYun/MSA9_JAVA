package _1000_100;

import java.util.Scanner;

public class _1170 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade =sc.nextInt();
		int Class =sc.nextInt();
		int number =sc.nextInt();
		
		if(number<10) {
			System.out.println(grade + "" + Class + "0" + number);
		}
		else {
			System.out.println(grade + "" + Class + "" + number);
		}
	}
}
