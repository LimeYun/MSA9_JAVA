package _1000_200;

import java.util.Scanner;

public class _1216 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (b-c>a) {
			System.out.println("advertise");
		}
		else if (b-c<a) {
			System.out.println("do not advertise");
		}
		else {
			System.out.println("does not matter");
		}
	}
}
