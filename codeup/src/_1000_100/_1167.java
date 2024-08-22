package _1000_100;

import java.util.Scanner;

public class _1167 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int mid;
		if(a>b) {
			mid = b;
		}
		else {
			mid = a;
		}
		if(mid>c) {
			mid =mid;
		}
		else {
			mid = c;
		}
		if(a>c) {
			mid = c;
		}
		else {
			mid= a;
		}
		System.out.println(mid);
	}
}
