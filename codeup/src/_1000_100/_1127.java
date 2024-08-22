package _1000_100;

import java.util.Scanner;

public class _1127 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double one = sc.nextDouble();
		int a = sc.nextInt();
		double two = sc.nextDouble();
		int b = sc.nextInt();
		double thr = sc.nextDouble();
		int c = sc.nextInt();
		double result1 = one*a;
		double result2 = two*b;
		double result3 = thr*c;
		double last = result1 + result2 + result3; 
		System.out.printf("%.1f", last);
	}
}
