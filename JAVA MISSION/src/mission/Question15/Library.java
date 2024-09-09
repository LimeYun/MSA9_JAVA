// - Library 클래스
package mission.Question15;

import java.util.ArrayList;
import java.util.List;


public class Library {
	
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("123123", "이게 자바냐", "감자바", "자바감자바\t", 33000));
		bookList.add(new Book("112112", "정보처리기사", "김휴먼", "국가기술자격", 45000));
		bookList.add(new Book("001001", "실무 DB\t", "박디비", "디비디비딥\t", 60000));
		
		System.out.println("================== ALOHA 스터디 도서관 ====================");
		for (Book book : bookList) {
			System.out.println(book);
		}
	
	}
}
