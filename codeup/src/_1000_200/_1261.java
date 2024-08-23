package _1000_200;

import java.util.Scanner;

public class _1261 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			int n =sc.nextInt();
			if(n%5==0) {
				System.out.println(n);
				return;
			}
		}
		System.out.println("0");
		
		
		sc.close();
		}
	}

