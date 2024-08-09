package Day04;

import java.util.Scanner;

public class Ex03_Min {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 int arr[] = new int [n];
//		 순서
//		 1. 정수 하나 입력받아서 n에 대입
//		 2. n번 만큼  n개의 정수 입력받아서 배열 arr 대입
//		 3. 배열을 반복해서 최댓값 max 배열의 i번째 요소와 비교
//		 4. 두 요소 중에서 더 큰 요소를 max에 대입
//		 5. 반복 끝나고, max를 출력
		
		 for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		 //Integer.MIN_VALUE : -21억xxx : int의 최솟값
		 int min = Integer.MAX_VALUE;
		 for (int i = 0; i < arr.length; i++) {
			 if(min > arr[i]) {
				 min = arr[i];
			 }
			
		}
		 System.out.println("최솟값: "+ min);
		//첫번째 줄에 입력할 개수 n을 입력받고,
				//둘째 줄에 n개의 정수를 공백을 두고 입력받으시오.
				//n개의 정수 중 , 최솟값을 구하시오.
				//(입력예시)
				 //5
				 // 90 60 70 100 55
				 //(출력)
				 //최솟값: 55
		sc.close();
	}
}
