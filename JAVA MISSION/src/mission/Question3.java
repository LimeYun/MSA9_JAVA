package mission;
//정수 1부터 100까지 의 수를 출력하면서, 해당 수 가 3 또는 6 또는 9에 해당하는 경우
//해당 정수 대신에 3, 6, 9가 포함되는 개수만큼 “*” 를 출력하는 프로그램을 작성하시오.
public class Question3 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			int num1 = i%10;
			int num10 = i/10;
			if((num10/3!=0 && num10%3==0) && (num1!=0 && num1%3==0)) {
				System.out.println("**");
			}
			else if((num10/3!=0 && num10%3==0) || (num1!=0 && num1%3==0)) {
				System.out.println("*");
			}
			else 
				System.out.println(i);
		}
		
	}
}

//		for (int i = 1; i <= 100; i++) {
//			int ten = i/10;
//			int one = i%10;
//			
//			boolean ten369 = ten ==3 || ten == 6 || ten == 9;
//			boolean one369 = one ==3 || one == 6 || one == 9;
//			
//			if(ten369 && one369)
//				System.out.println("**");
//			else if(ten369 || one369)
//				System.out.println("*");
//			else
//				System.out.println(i);
//		}