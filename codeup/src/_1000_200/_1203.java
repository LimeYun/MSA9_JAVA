package _1000_200;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class _1203 {
	
	public static void main(String[] args) throws Exception {
		System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n>20) {
			System.out.println("비만");
		}
		else if(n>10) {
			System.out.println("과체중");
		}
		else {
			System.out.println("정상");
		}
	}
}
