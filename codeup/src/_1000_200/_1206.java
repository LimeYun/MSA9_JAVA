package _1000_200;

import java.util.Scanner;

public class _1206 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (b%a==0) {
			System.out.println(a + "*" + b/a + "=" + b);
		}
		else if (a%b==0) {
			System.out.println(b + "*" + a/b + "=" + a);
		}
		else {
			System.out.println("none");
		}
	}
}
