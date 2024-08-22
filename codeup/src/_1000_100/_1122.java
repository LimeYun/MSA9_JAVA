package _1000_100;

import java.util.Scanner;

public class _1122 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = a/60;
		int c = a%60;
		System.out.println(b + " " + c);
	}
}
