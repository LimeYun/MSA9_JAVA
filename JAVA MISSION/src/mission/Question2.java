package mission;

import java.util.Scanner;

public class Question2 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			
			int sum1 = 0;
			int sum2 = 0;
			
			for (int i = 1; i <= N; i++) {
				if(i%2==1 && i!=N-1) {
					System.out.print(i + "+");
					sum1 += i;
				}
				if(i==N-1) {
					System.out.print(i);
					sum1 += i;
				}
			}
			System.out.println("=" + sum1);
			
			for (int i = 1; i <= N; i++) {
				if(i%2==0 && i!=N) {
					System.out.print(i + "+");
					sum2 += i;
				}
				if(i==N) {
					System.out.print(i);
					sum2 += i;
				}
			}
			System.out.println("=" + sum2);
			
			for (int i = 1; i <= N; i++) {
				if(N%i==0) {
					System.out.print(i + " ");
				}
			}
			sc.close();
		}
}
