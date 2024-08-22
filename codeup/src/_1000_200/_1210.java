package _1000_200;

import java.util.Scanner;

public class _1210 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice[] = {400,340,170,100,70};
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result =choice[a-1] + choice[b-1];
		
		if (result>500) {
			System.out.println("angry");
		}
		else {
			System.out.println("no angry");
		}
		
		
		
	}
}
