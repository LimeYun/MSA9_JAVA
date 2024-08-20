 package _1000_000;


import java.util.Scanner;

public class _1087 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if(n>=sum) {
				sum+=i;
			}
		}System.out.println(sum);
 }
}
	
	
