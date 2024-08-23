package _1000_200;

import java.util.Scanner;


public class _1272 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int h = sc.nextInt();	
		int money1 ;
		int money2 ;
		
		if(k%2==1) {
			money1=k;
		}
		else {
			money1=k*10;
		}
		if(h%2==1) {
			money2=h;
		}
		else {
			money2=h*10;
		}
		
		
			
		System.out.println(money1 + money2);
		
		
	}
}
