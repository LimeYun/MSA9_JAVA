package _1000_200;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class _1229 {
	public static void main(String[] args) throws Exception {
		  System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
		
		Scanner sc = new Scanner(System.in);
		
		double h = sc.nextDouble();
		double w = sc.nextDouble();
		
		double avgw;
		
		if (h>=160) {
			avgw = (h-100)*0.9;
		}
		else if (h>=150) {
			avgw = (h-150)/2 + 50;
		}
		else {
			avgw = h-100;
		}
		
		double bmi = (w-avgw)*100/avgw;
		
		if (bmi>20) {
			System.out.println("비만");
		}
		else if (bmi>10) {
			System.out.println("과체중");
		}
		else {
			System.out.println("정상");
		}
		
	}
}
