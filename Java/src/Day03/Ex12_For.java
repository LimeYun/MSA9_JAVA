package Day03;

public class Ex12_For {
	
	public static void main(String[] args) {
		//for (1초기식; 2조건식; 4증감식){3실행문 }
		//실행 순서 1>반복 2>3>4
		//1. 1 ~ 10까지 반복해서 출력

		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
			System.out.println();
			
			for (int i = 50; i <=100; i++) {
				System.out.print(i + " ");
				if((i+1)% 10 ==0)
					System.out.println();
			}
			System.out.println();
			
			for (int i = 2; i <=20 ; i+=2) {
				System.out.print(i + " ");
				
			}
			System.out.println();
			for (int i = 1; i <=20 ; i+=2) {
				System.out.print(i + " ");
				
			}
		}
}
