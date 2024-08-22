package _1000_200;

import java.util.Scanner;

public class _1222 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int result = (89-a)/5 +1;
		
		if(b+result>c) {
			System.out.println("win");
		}
		if(b+result==c) {
			System.out.println("same");
		}
		if(b+result<c) {
			System.out.println("lose");
		}
		
	}
}
