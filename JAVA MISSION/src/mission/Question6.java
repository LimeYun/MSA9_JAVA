package mission;

import java.util.Random;
import java.util.Scanner;

//정수 N을 입력받아 N개의 게임의 로또 번호를 출력하시오.
//즉, 6개의 배열요소를 갖는 1차원 배열을 선언하여 1~45 사이의 랜덤한 값을 중복되지 않도록 저장하고 출력하는 과정을
//N번 반복하시오.
//
//Copyright c ALOHA CLASS. All Rights Reserved.
//
//• (힌트)
//
//- Math.random(); 메소드
//: 0.0이상 1.0미만의 임의의 값을 반환
//- Random random = new Random();
//random.nextInt(N);
//: 0이상 N이하의 임의의 정수타입의 값을 반환
//- ex)
//
//System.out.println( Math.random() ); // 0.5446712360575938
//System.out.println( random.nextInt(10) ); // 7
//몇 게임? 5 
//[1 게임] : 2 9 14 23 41 44
//[2 게임] : 1 8 17 33 37 41
//[3 게임] : 6 12 15 22 23 37
//[4 게임] : 1 8 15 18 28 37
//[5 게임] : 3 11 12 23 31 37
public class Question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= new int [6];
		Random random = new Random();
		random.nextInt();
		System.out.println();
		
	}
}
