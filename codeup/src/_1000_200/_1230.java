package _1000_200;

import java.util.Scanner;

public class _1230 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		while(true) {
		if(a<=170 || b<= 170 || c<= 170) {
			System.out.println("CRASH");
		}
		else {
			System.out.println("PASS");
		}
	 }
   }
}
