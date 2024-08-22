package _1000_100;

import java.util.Scanner;

public class _1150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if((a>=50 && a<=70) || (a%6==0)) {
			System.out.println("win");
		}
		else {
			System.out.println("lose");
		}
	}
}
