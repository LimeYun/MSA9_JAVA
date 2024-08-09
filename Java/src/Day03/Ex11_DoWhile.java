package Day03;

import java.util.Scanner;

public class Ex11_DoWhile {
	
	public static void main(String[] args) {
		//메뉴판
		//-변수 선언 : 메뉴 번호, 메뉴 이름 
		int menuNo ; // 메뉴번호 변수 선언
		int menuCount = 0; // 주문개수 변수 선언
		String menuName= ""; //메뉴이름 변수 선언
		Scanner sc = new Scanner(System.in);// 입력 객체 생성
		
		
		//do~while문
		//: 무조건 1회 실행 후 , 그 후 조건을 검사하여 반복하는 문장
		do {
			
			System.out.println(":::::메뉴판:::::");
			System.out.println("1.참치마요 삼각김밥");
			System.out.println("2.굶음");
			System.out.println("3.진라면 매운맛");
			System.out.println("4.와퍼");
			System.out.println("5.마라탕");
			System.out.println("0.종료");
			System.out.print("메뉴 번호 : ");
			//메뉴 번호입력
			menuNo = sc.nextInt();
			//break : 제어문을 탈출하는 키워드
			// 가장 가까운 제어문만 탈출
			if (menuNo == 0) break;
			else if (menuNo >=6 && menuNo <0)
				System.out.println("잘못된 선택입니다.");
			else
				menuCount++;
			switch (menuNo) {
			case 1:menuName = "참치마요 삼각김밥"; break;
			case 2:menuName = "굶음"; break;
			case 3:menuName = "진라면 매운맛"; break;
			case 4:menuName = "와퍼"; break;
			case 5:menuName = "마라탕"; break;
		
			default:
				break;
				
			} 
			System.out.println(menuName + "(을/를) 주문하였습니다.");
			//0번 입력시 메뉴판 종료 설정.
			
			//유효성 검사
			//- 메뉴번호가 0~5번만 유효
			
		}while(menuNo != 0);
		//주문한 메뉴 개수를 출력하세요.
		//ex) 2개의 메뉴를 주문하였습니다.
		
		System.out.println("메뉴판을 종료합니다.");
		System.out.println(menuCount + "개의 메뉴를 주문하였습니다.");
	
		
		sc.close();
	}
}
