package mission;

import java.util.Scanner;

public class Question5 {

	static int count = 0;
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			
			do {
				System.out.println("******** 치킨 메뉴판 ********");
				System.out.println("1. BBQ 황금올리브 반반 치킨");
				System.out.println("2. BHC 뿌링클 치킨");
				System.out.println("3. 처갓집 치킨 & 호식이 두마리 치킨");
				System.out.println("0. 종료");
				System.out.print("******** 번호 : ");
				
				int n = sc.nextInt();
				
				switch (n) {
				case 1 -> {
					System.out.println("'BBQ 황금올리브 반반 치킨'이(/가) 주문되었습니다.");
					ordercount();
				}
				case 2 -> {
					System.out.println("'BHC 뿌링클 치킨'이(/가) 주문되었습니다.");
					ordercount();
				}
				case 3 -> {System.out.println("'처갓집 치킨 & 호식이 두마리 치킨'이(/가) 주문되었습니다.");
					ordercount();
				}
				case 0 -> {System.out.println("총 " + count + " 개의 상품이 주문되었습니다.");
					return;
				}
				default -> System.err.println("(0~3) 사이의 번호를 입력해주세요.");
				}
			} while (true);
		}
		
		static void ordercount() {
			count++;
		}
}
