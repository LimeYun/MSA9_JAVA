package _1000_200;

import java.util.Scanner;

public class _1290 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		for (int i = 0; i < 3; i++) {
			int w = sc.nextInt();
			int l = sc.nextInt();
				if(w*l>result) {
					result = w*l;
			}
		}
		System.out.println(result);
	}
}
