package _1000_100;

import java.util.Scanner;

public class _1168 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int birth = sc.nextInt();
		int sex = sc.nextInt();
		int age = birth/10000;
		if(sex<3) { 
			System.out.println(112-age+1);
		}
		else {
			System.out.println(12-age+1);
		}
		
	}
}
