package _1000_200;

import java.util.Scanner;

public class _1268 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(a%2==1) {
				count+=1;
			}
			}
		
		System.out.println(count);
		
		sc.close();
		}
}