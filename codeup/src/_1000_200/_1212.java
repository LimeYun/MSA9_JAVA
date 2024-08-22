package _1000_200;

import java.util.Scanner;

public class _1212 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a>b && a>c) {
			if(a<b+c) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		if (b>a && b>c) {
			if(b<a+c) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		if (c>a && c>b) {
			if(c<a+b) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		if (a==b && b==c) {
			System.out.println("yes");
		}
	}
}
