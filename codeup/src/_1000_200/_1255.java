package _1000_200;

import java.util.Scanner;

public class _1255 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		for (double i = a; i <= b; i+=0.01) {
			System.out.print(Math.round(i*100)/100.0 + " ");
		}
		
		
		sc.close();
		}
	}

