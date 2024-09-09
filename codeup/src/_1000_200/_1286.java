package _1000_200;

import java.util.Scanner;

public class _1286 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			max = n;
			min = n;
			if(n>max) {
				max = n;
			}
			if(n<min) {
				min = n;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
