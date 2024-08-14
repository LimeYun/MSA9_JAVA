package Day07.Review;

import java.util.Scanner;

public class Ex05_Matrix {
	
	public static void main(String[] args) {
		//양의 정수 M 과 N 을 입력받아 저장하고,
		//M행 N열의 2차원 배열을 생성한다.
		//각 요소의 값을 입력받고, 그대로 출력하시오.
		//(입력 예시)
		//M : 2
		//N : 3
		// 1 2 3
		// 4 5 6
		// (출력 예시)
		// 1 2 3 
		// 4 5 6
		Scanner sc = new Scanner(System.in);
		System.out.print("M : ");
		int M = sc.nextInt();
		System.out.print("N : ");
		int N = sc.nextInt();
		
		int arr[][]= new int [M][N];
		
		//입력
		//2차원배열은 이중반복문으로 접근한다.
		//바깥쪽 반복문   	- 반복변수 i : 행 접근
		//안 쪽 반복문   	- 반복변수 j : 열 접근
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j]=sc.nextInt();
			}
		}	
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr[i][j] + " ");
				}
			System.out.println("----------------------");
			
			//foreach 으로 2차원 배열 출력
			for (int[] row : arr) {
				for (int col : row) {
						System.out.println(col + " ");
				}
				System.out.println();
			}
		}
	}
	}

