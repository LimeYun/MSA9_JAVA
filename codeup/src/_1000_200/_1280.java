package _1000_200;

import java.util.Scanner;

public class _1280 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// a<=b
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0;
		
		for (int i = a; i <= b; i++) {
			if(i%2==0) {
				System.out.print("-" + i);
				sum+=i*-1;
			}
			else {
				if(a%2==1 && a==i) {
					System.out.print(i);
				}
				else {
				System.out.print("+" + i);
				}
				sum+=i;
			}
		}
		System.out.println("=" + sum);
	}
	
}
