package _1000_200;

import java.util.Scanner;

public class _1291 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		for (int i = n3; i >= 1; i--) {
			if(n1%i==0 && n2%i==0 && n3%i==0) {
				System.out.println(i);
				break;
			}
		}
		
	}	
}
