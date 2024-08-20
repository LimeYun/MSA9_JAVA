 package _1000_000;


import java.util.Scanner;

public class _1091 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int result = a*m + d;
		int result2 = result*m +d;
		System.out.println(a*Math.pow(result2, n-2));
		
//		a, a*m+d, (a*m+d)*m+d
	}
}
	
	
