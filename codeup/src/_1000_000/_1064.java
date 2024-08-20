package _1000_000;

import java.util.Scanner;

public class _1064 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = (a < b)? a : b;
		int result2 = (result<c)? result : c;
		System.out.println(result2);
	}
}
