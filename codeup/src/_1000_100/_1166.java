package _1000_100;

import java.util.Scanner;

public class _1166 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if((n%400==0) || (n%4==0 && n%100!=0)) {
			System.out.println("Leap");
		}
		else {
			System.out.println("Normal");
		}
	}
}
