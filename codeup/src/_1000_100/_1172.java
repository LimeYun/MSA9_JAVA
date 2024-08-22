package _1000_100;

import java.util.Scanner;

public class _1172 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		if (a>b) {
			int temp = b;
			b = a;
			a = temp;
		}
		else if (b>a) {
			b = b;
		}
		if (b>c) {
			int temp = c;
			c = b;
			b = temp;
		}
		else if (c>b) {
			c = c;
		}
		if (a>c) {
			int temp = c;
			c = a;
			a = temp;
		}
		
		System.out.print(a + " " + b + " " + c);
	}
}
