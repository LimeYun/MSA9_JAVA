package _1000;

import java.util.Scanner;

public class _1253 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//a가 더 크면 b와 교환
//		if (a>b) {
//			int temp = a;
//			a = b;
//			b= temp;
//		}
		
		if (a<b || a>b) {
			for (int i = a; i <=b ; i++) {
				System.out.print(i + " ");
			}
			for (int i = b; i <=a ; i++) {
				System.out.print(i + " ");
				
			}
		}
			
				
		
		}
	}

