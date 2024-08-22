package _1000_000;

import java.util.Scanner;

public class _1046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double result = Math.round((double)(a+b+c)/3*10)/10.0;
		System.out.println((long)(a+b+c));
		System.out.println(result);
		
		
	}
}
