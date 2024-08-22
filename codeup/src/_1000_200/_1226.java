package _1000_200;

import java.util.Scanner;

public class _1226 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lotto[] = new int[7];
		int jihye[] = new int[6];
		int count = 0;
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = sc.nextInt();
		}
		for (int i = 0; i < jihye.length; i++) {
			jihye[i] = sc.nextInt();
		}
		for (int i = 0; i < lotto.length-1; i++) {
			for (int j = 0; j < jihye.length; j++) {
				if(lotto[i]==jihye[i]) {
					count+=1;
				}
			}
		}
		System.out.println(count);
		
	}
}
