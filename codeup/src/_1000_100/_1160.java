package _1000_100;

import java.util.Scanner;

public class _1160 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day[] = {1,2,3,4,5,6,7};
		int n = sc.nextInt();
		if(day[n-1]==2 || day[n-1]==4 || day[n-1]==6) {
		System.out.println("enjoy");
	 }
		else {
			System.out.println("oh my god");
		}
	}
}
