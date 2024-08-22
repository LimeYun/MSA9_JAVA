package _1000_100;

import java.util.Scanner;

public class _1180 {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ten = n/10;
		int one = n%10;
		int result = (one*10+ten)*2;
		int result2 = 10*n*2-100;
		
		if(n>=10) {
			System.out.println(result);
			if(result>50) {
				System.out.println("OH MY GOD");
			}
			else {
				System.out.println("GOOD");
			}
		}
		else {
			System.out.println(result2);
			if(result2>50) {
			System.out.println("OH MY GOD");
			}
			else {
				System.out.println("GOOD");
			}
		}
	}
	
}
