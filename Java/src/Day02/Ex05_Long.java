package Day02;

public class Ex05_Long {
	public static void main(String[] args) {
		//int (4bytes: 32bits) : 2^32개 : 약 42 억 개
		//int 수 표현 범위 : -21억 ~~ 21억
		
		//long (8bytes : 64bits) : 2^64 ro
		long ln1 = 1000;
		long ln2 = 2100000000;
		long ln3 = 2200000000L;  
		//정수는 int로 인식하기 때문에 int의 범위를 벗어남. (long 타입 리터럴)
		System.out.println("ln1:"+ln1);
		System.out.println("ln2:"+ln2);
		System.out.println("ln3:"+ln3);
	}
}
