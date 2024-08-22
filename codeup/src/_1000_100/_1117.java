package _1000_100;

import java.util.Scanner;

public class _1117 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double result = Math.round(a*b*100)/100.0;
		System.out.println(result);
	}
}
