package com.kh.poly.chap01.practice.view;

import java.util.Scanner;

import com.kh.poly.chap01.practice.model.service.LibraryService;
import com.kh.poly.chap01.practice.model.vo.Book;
import com.kh.poly.chap01.practice.model.vo.Member;

public class LibraryMenu {
	
	private LibraryService service = new LibraryService();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름: ");
		String name=sc.next(); // nextLine이 아니면 그냥 입력되는 다음 한 단어만 가져오라는 의미 // 좋은점: 개행문자 안써도 된다 
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.print("성별(M/F): ");
		char gender = sc.next().charAt(0); // sc.next()는 버퍼에 남아있는 개행문자를 무시하고 다음 단어를 읽어들임
		
		// 입력받은 값으로(괄호속에 매개변수로 넣어서) 멤버 객체 생성
		Member m = new Member(name, age, gender);
		
		// LibraryService의 insertMember() 메소드에 전달
		service.insertMember(m);
		
		// 무한 반복 메뉴 생성
		/* ==== 메뉴 ====  // 무한 반복 실행
			1. 마이페이지  // LibraryService의 myInfo() 호출하여 출력
			2. 도서 전체 조회  // LibraryMenu의 selectAll() 호출
			3. 도서 검색  // LibraryMenu의 searchBook() 호출
			4. 도서 대여하기  // LibraryMenu의 rentBook() 호출
			9. 프로그램 종료하기 
			메뉴 번호 : // 메뉴 번호 입력 받기 */
		
		int menu =0;
		while(true) { // 문제 조건에 무한 반복 실행이라고해서 그랬음
			System.out.print("========== 메뉴 ==========\n"
					+ "1. 마이페이지 \n"
					+ "2. 도서 전체 조회 \n"
					+ "3. 도서 검색 \n" 
					+ "4. 도서 대여하기 \n"
					+ "9. 프로그램 종료하기\n"
					+ "메뉴번호 : ");
			menu = sc.nextInt(); sc.nextLine();
			
			switch(menu) {
			
			case 1: System.out.print(service.myInfo()); break; // LibraryService의 myInfo() 호출하여 출력하라
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 9: System.out.print("프로그램을 종료합니다. "); return; 
				// <중요> return의 의미: 호출한 메소드로 반환(돌아가라)
				// void 메소드는 반환"값"은 없다!
				// JVM이 컴파일 시 void 메소드 제일 마지막에 return을 자동 추가함
			default: System.out.print("잘못 입력하셨습니다. 다시 입력하세요. ");
				
			}
		}
		
	} 
	
	public void selectAll() {
		// LibraryService의 selectAll()메소드 호출하여 결과 값 Book[] 자료형 bList에 담기 
		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력 -> 대여할 때 도서번호를 알기 위해
		// ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
		
		Book[] bList = service.selectAll();
		for (int i=0; i<bList.length; i++) {
			System.out.println(i + "번 도서: " + bList[i]);
			// 참조 변수를 출력(print)할 때는 자동으로 .toString()이 JVM에 의해서 추가되므로 bList[i].toString() 하지 않아도 괜찮다.
		}
		
	}
	
	public void searchBook() {
		// 검색할 제목 키워드 : “  // 입력 받음 (keyword)
		System.out.print("검색할 제목 키워드: ");
		String keyword = sc.nextLine();
				
		// 입력된 키워드를 이용하여 LibraryService의 searchBook()을 호출하고
		// 반환값을 book[] 자료형 searchList에 저장 후
		Book[] searchList = service.searchBook(keyword);
		
		// for문을 이용하여 검색 결과인 도서 목록 출력
		for(int i=0; i<searchList.length; i++) {
			if(searchList[i]==null) {
				break; // null이라고 출력되는게 꼴뵈기 싫으니까 아예 출력을 안해버리는 것
			}
			
			System.out.println(searchList[i]);
		}
		
		
	}
	
	public void rentBook() {
		// 도서대여를 위해 도서번호를 알아야 하기 때문에 selectAll() 메소드 호출
		selectAll();

		// “대여할 도서 번호 선택 : ” 	>> 입력 받음 (index)
		System.out.println("대여할 도서 번호 선택: ");
		int index = sc.nextInt(); sc.nextLine();
		
		// LibraryService의 rentBook() 에 전달
		// 그 결과 값을 result로 받고 그 result가
		int result = service.rentBook(index);
		
		// 0일 경우  “성공적으로 대여되었습니다.” 출력
		// 1일 경우  “나이 제한으로 대여 불가능입니다.” 출력
		// 2일 경우  “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니
		//		     마이페이지에서 확인하세요” 출력
		if (result ==0 ) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if (result ==1) { 
			System.out.println("나이 제한으로 대여 불가능입니다. ");
		} else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
	}


}
