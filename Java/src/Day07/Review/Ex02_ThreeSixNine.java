package Day07.Review;

public class Ex02_ThreeSixNine {

	public static void main(String[] args) {
		//정수 1~100까지 수를 반복하여 출력하면서,
		// 해당 수가 3 또는 6 또는 9가 될 때는
		// 자리수마다 369가 되는 개수 만큼 정수 대신 "*" 출력하는 프로그램을 작성하시오.
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
