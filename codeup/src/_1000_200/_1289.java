package _1000_200;

import java.util.Scanner;

public class _1289 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if(n%i==0 && n!=i) {
				count++;
			}
		}
		System.out.println(count);
	}
}
