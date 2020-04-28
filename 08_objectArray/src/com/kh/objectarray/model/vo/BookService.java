package com.kh.objectarray.model.vo;

import java.util.Scanner;

public class BookService {
		// Book 객체 5개를 매개변수 있는 생성자를 이용하여 생성 후
		// 책 제목을 입력받아
		// 해당 책이 있는지 검색하여
		// 있으면 Book 객체의 필드정보 출력
		// 없으면 "해당하는 책이 없습니다" 출력
	
	// 1. 비교적 쉬운 코드 짜기 (여태 아는 내용으로)
	// 필드에 Scanner 객체를 선언하여 클래스 내부에서 모두 사용 가능하게 함
	private Scanner sc = new Scanner(System.in);

	public void searchBookV1() {
		
		// 책 5권 객체 생성
		Book book1 = new Book("자바의 정석", 30000, 0.2, "남궁 성");
		Book book2 = new Book("C언어의 정석", 50000, 0.1, "김철수");
		Book book3 = new Book("와 자바 재밌다", 100000, 0.05, "백동현");
		Book book4 = new Book("어린왕자", 100000, 0.05, "생택쥐베리");
		Book book5 = new Book("해리포터", 12000, 0.3, "조앤K롤링");
	
		// 검색할 책 제목 입력받기
		System.out.print("검색할 책 제목을 입력하세요: ");
		String title = sc.nextLine();
		
		if(book1.getTitle().equals(title)) {
			// book1의 제목과 입력받은 제목이 같을 경우
			System.out.println(book1.selectBook());
			// 그 책의 정보를 싹 출력하시오.
			
		} else if(book2.getTitle().equals(title)) {
			System.out.println(book2.selectBook());
			
		} else if(book3.getTitle().equals(title)) {
			System.out.println(book3.selectBook());
			
		} else if(book4.getTitle().equals(title)) {
			System.out.println(book4.selectBook());
			
		} else if(book5.getTitle().equals(title)) {
			System.out.println(book5.selectBook());
			
		} else {
			System.out.println("해당하는 책이 없습니다.");}
		}
		
	// 2. 객체 배열을 이용하여 책 검색하기
	public void searchBookV2 () {
		
		// 방식1
		Book[] books = new Book[5];
		
		books[0] = new Book("자바의 정석", 30000, 0.2, "남궁 성");
		books[1] = new Book("C언어의 정석", 50000, 0.1, "김철수");
		books[2] = new Book("와 자바 재밌다", 100000, 0.05, "백동현");
		books[3] = new Book("어린왕자", 100000, 0.05, "생택쥐베리"); 
		
		// 방식2: 마치 int[] arr= {1, 2, 3, 4, 5}; 하는것처럼
//		Book[] books = {
//				new Book("자바의 정석", 30000, 0.2, "남궁 성"),
//				new Book("C언어의 정석", 50000, 0.1, "김철수"),
//				new Book("와 자바 재밌다", 100000, 0.05, "백동현"),
//				new Book("어린왕자", 100000, 0.05, "생택쥐베리")
//		};
//		
		// 책 제목 입력 받기
		System.out.print("검색할 책 제목을 입력하세요: ");
		String title = sc.nextLine();
		
		boolean flag = true;
		
		for (int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(title)) {
				// it means "books의 i번째 인덱스 요소의 타이틀을 얻어왔는데, 그것이 니가 입력한 타이틀 값과 같다면,"
				System.out.println(books[i].selectBook());
				// it means "그럼 지금 니가 찾은 그 인덱스 요소의 정보를 출력해라"
				flag = false; // 검색이 된 경우, 이제 이 포문을 벗어나기 위해서 flag를 false로 바꿈
				break;
				
			} 
		} // for end
				
			if (flag) { // 검색이 아직 안되가지구 아래의 내용을 입력하게 됨
				System.out.println("해당하는 책이 없습니다.");
		}
	
	}
}
