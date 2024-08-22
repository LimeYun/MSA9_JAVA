package _1000_000;

import java.util.Scanner;

public class _1044 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double result = Math.round((double)a/b * 100)/100.0;
		System.out.println((long)a+b);
		System.out.println((long)a-b);
		System.out.println((long)a*b);
		System.out.println((long)a/b);
		System.out.println((long)a%b);
		System.out.println(result);
	}
}
