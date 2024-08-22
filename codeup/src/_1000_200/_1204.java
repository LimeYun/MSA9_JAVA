package _1000_200;

import java.util.Scanner;

public class _1204 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = n%10;
		if(n==11 || n==12 || n==13) {
			System.out.println(n + "th");
		}
		else if(r==1) {
			System.out.println(n + "st");
		}
		else if(r==2) {
			System.out.println(n + "nd");
		}
		else if(r==3) {
			System.out.println(n + "rd");
		}
		else {
			System.out.println(n + "th");
		}

	}
}
