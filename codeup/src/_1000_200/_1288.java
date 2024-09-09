package _1000_200;

import java.util.Scanner;

public class _1288 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int result1 = 1;
		for (int i = 1; i <= n; i++) {
			result1*=i;
		}
		int result2 = 1;
		for (int i = 1; i <= r; i++) {
			result2*=i;
		}
		int result3 = 1;
		for (int i = 1; i <= n-r; i++) {
			result3*=i;
		}
		System.out.println(result1/result2/result3);
	}
}
