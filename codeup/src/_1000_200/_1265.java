package _1000_200;

import java.util.Scanner;

public class _1265 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <=9; i++) {
			System.out.println(n + "*" + i + "=" + n*i);
		}
		
		sc.close();
		}
	}

