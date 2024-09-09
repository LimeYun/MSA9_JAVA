package _1000_200;

import java.util.Scanner;

public class _1282 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = 1; 
		int i = 1;
		
//		for (int i = 1; i < n; i++) {
//			if(i*i>n) break;
//		}

		while(i*i<n) {
			i++;
		}
		
		int x = (i-1)*(i-1);
			
		while(x+k <= n) {
		k++;
	}
	System.out.println((k-1) + " " + (i-1));
}

}