package _1000_100;

import java.util.Scanner;

public class _1169 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int birth = (2012-age+1)%100;
		if(2012-age+1<2000) {
		System.out.println(birth + " 1");
		}
		else {
			System.out.println(birth + " 3");
		}
		
		
	}
}
