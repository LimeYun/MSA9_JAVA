package _1000_100;

import java.util.Scanner;

public class _1173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int clock =sc.nextInt();
		int min =sc.nextInt();
//		
//		if(min<30 && clock==0) {
//			System.out.println((clock+23) + " " + (min+30));
//		}
//		else if(min<30) {
//			System.out.println((clock-1) + " " + (min+30));
//		}
//		else {
//			System.out.println(clock + " " + (min-30));
//		}
		while(min<30 && clock==0) {
			System.out.println((clock+23) + " " + (min+30));
			return;
		}
		
		while(min<30) {
			System.out.println((clock-1) + " " + (min+30));
			return;
		}
		while(true) {
			System.out.println(clock + " " + (min-30));
			return;
		}
		
	}
}
