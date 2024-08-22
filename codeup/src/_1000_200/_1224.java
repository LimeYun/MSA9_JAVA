package _1000_200;

import java.util.Scanner;

public class _1224 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if(a*d > b*c) {
			System.out.println(">");
		}
		if(a*d == b*c) {
			System.out.println("=");
		}
		if(a*d < b*c) {
			System.out.println("<");
		}
		
	}
}
