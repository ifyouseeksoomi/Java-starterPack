package com.kh.object.practice.model.service;

import com.kh.object.practice.model.vo.Book;

public class BookService {
	
	// + practice() : void
	public void practice () {
		
		// 1) 기본 생성자를 이용하여 첫번째 Book(book1) 객체 생성
		Book book1 = new Book();
		
		// 2) 매개변수 생성자를 이용하여 두 번째 Book(book2) 객체 생성(사용 데이터 참고)
		Book book2 = new Book("자바의 정석", 20000, 0.3, "남궁 성");
		
		// 3) 객체가 가진 필드 값 출력 확인
		System.out.println(book1.selectBook());
		System.out.println(book2.selectBook());
		System.out.println("==============================");
		
		// 4) 첫번째 객체가 가진 값을 setter를 이용하여 수정
		System.out.println("수정된 결과 확인");
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate (0.1);
		book1.setAuthor("홍길동");
		
		// 5) 수정된 내용 출력 확인
		System.out.println(book1.selectBook());
		System.out.println("==============================");
		
		// 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 할인된 가격= 가격 - (가격*할인율)
		System.out.println( "도서명: " + book1.getTitle() );
		System.out.println( "할인된 가격: " + (int) ( book1.getPrice() - ( book1.getPrice() * book1.getDiscountRate() ) ) + "원");
		
		
		System.out.println( "도서명: " + book2.getTitle() );
		System.out.println( "할인된 가격: " + (int) (book2.getPrice() - ( book2.getPrice() * book2.getDiscountRate() ) ) + "원");
	}
}