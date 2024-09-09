package _1000_200;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class _1228 {
	public static void main(String[] args) throws Exception {
		  System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
		
		Scanner sc = new Scanner(System.in);
		
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		
		double avgwei = (height-100)*0.9;
		double bmi = (weight-avgwei)*100/avgwei;
		
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
