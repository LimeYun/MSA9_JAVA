package _1000_200;

import java.util.Scanner;

public class _1266 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			sum+=a;
		}
		System.out.println(sum);
		
		sc.close();
		}
	}

