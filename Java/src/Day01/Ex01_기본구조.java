package Day01;
	//클래스
	//public class 클래스명
 	// 클래스명 = 파일명 일치해야함
	// class 영역 바깥에는 코드 작성 불가능 (메소드 안에)

public class Ex01_기본구조 {
	//변수
	//자료형 변수명 = 값;
	//ex) int 변수명 = 숫자 또는 문자 등등 ;
	//변수 선언 및 초기화
	int age = 25;int weight = 62;
	int height = 168;
	
	//값을 초기화하지 않고 선언 (값을 지정하지 않고 선언만 가능)
	//변수 선언
	//int energy; // int 자료형은 값을 초기화하지 않았을때 기본값 0으로 초기화된다.
	
	//메소드
	//접근지정자 (static) 변환타입 메소드명 (매개변수) {실행문;}
	public int sum (int x, int y) {
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		int result = x + y;
		//return 
		//1. 메소드 종료
		//2. (값)을 메소드를 호출한 자리로 반환
		return result;
	}
	
	//main메소드 : 프로그램의 시작점 (하나의 프로그램에 하나의 main만 가능)
	// ctrl + space
	public static void main(String[] args) {
	//객체 생성
	//클래스타입 객체명 = new 클래스명();
	Ex01_기본구조 내맘대로객체명= new Ex01_기본구조();
		//객체를 생성해야만, 내부의 변수와 메소드를 접근(사용)할 수 있다.
		//(.) 접근 연산자로 객체의 변수와 메소드를 접근 및 호출할 수 있다.
		//객체.변수
		//객체.메소드()
	System.out.println("홍성윤");
		System.out.println("나이: "+ 내맘대로객체명.age);
		System.out.println("무게: "+ 내맘대로객체명.weight);
		System.out.println("신장: "+ 내맘대로객체명.height);
		System.out.println("mbti: istp");
		
		//메소드 호출
		// 메소드명( 인수1, 인수2 );
		// 인수(인자; argument) : 메소드로 전달해줄 값
		int answer = 내맘대로객체명.sum(10,20);
		System.out.println("answer :" + answer);
	}
}
