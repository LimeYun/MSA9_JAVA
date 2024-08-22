package _1000_100;

import java.util.Scanner;

public class _1162 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int date = sc.nextInt();
		int day = sc.nextInt();
		if((year-date+day)%10==0) {
			System.out.println("대박");
		}
		else {
			System.out.println("그럭저럭");
		}
		
		
	}
}
