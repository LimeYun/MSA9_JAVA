package _1000_200;

import java.util.Scanner;

public class _1230 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a<=170) {
			System.out.println("CRASH " + a);
			return;
		}
		if (b<=170) {
			System.out.println("CRASH " + b);
			return;
		}
		if (c<=170) {
			System.out.println("CRASH " + c);
			return;
		}
		System.out.println("PASS");
   }
}
