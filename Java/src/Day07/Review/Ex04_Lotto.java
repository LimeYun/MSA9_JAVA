package Day07.Review;

public class Ex04_Lotto {
	public static void main(String[] args) {
		// Math.random() : 0.xxxxx~ 0.9xxxx 사이의 난수를 반환하는 메소드
		double random = Math.random();
		System.out.println(random);
		// 1~6 사이의 정수 :  주사위
		// (int)(Math.random() * 10) : 0~9
		// (int)(Math.random() * 10)+1 : 1~10		
		
		// (int)(Math.random() * 6) : 0~5		
		// (int)(Math.random() * 6)+1 : 1~6		
		
		// ????? 					 : 1~6
		System.out.println((int)(Math.random() * 10) + 1);
		
		int dice = (int)(Math.random()* 6) +1;
		System.out.println("주사위 : " + dice);
		
		//(공식) : (int)(Math.random() * [개수]) + [시작숫자]
		
		// 1~20 사이의 랜덤수
		int twenty = (int)(Math.random() * 20) +1;
		System.out.println("20 랜덤 : " + twenty);
		// -20~20 사이의 랜덤수
		int minus = (int)(Math.random() * 41) -20;
		System.out.println("+-20 랜덤 : " + minus);
		
		// 1~45 사이의 랜덤수
		int arr[]= new int [6];
		for (int i = 0; i < arr.length; i++) {
			int lotto = (int)(Math.random() * 45) +1;
			arr[i]= lotto;
			for(int j =i-1; j>=0 ; j--) {
				if(arr[j]==lotto) {
					i--;
					break;
				}
			}
			
			for (int j : arr) {
				System.out.print(i+ " ");
			}
				
		}

	}
}
