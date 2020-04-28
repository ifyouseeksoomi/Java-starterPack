package com.kh.inherit.chap02.model.service;

import com.kh.inherit.chap02.model.vo.Book;
import com.kh.inherit.chap02.model.vo.JavaBook;

public class OverrideService {
	public void example1 () {
		Book book1 = new Book();
		
		book1.setTitle("자바의 정석");
		book1.setAuthor("남궁 성");
		book1.setPrice(30000);
		
		System.out.println("book1.toString(): " + book1.toString());
		
		System.out.println("book1: " + book1); 
		// toString()을 오버라이딩해서 사용할 경우 
		// 참조변수를 출력하는 경우에 
		// JVM에 의해서 컴파일 단계에서 자동으로 .toString()이 추가됨
		
		// 기본자료형은 == (같다)라는 비교연산자를 사용하여
		// 값이 같은지를 비교함
		int num1 = 10;
		int num2 = 20;
		
		if(num1==num2) {
			System.out.println("num1과 num2는 같다.");
		}
		
		// String 값 비교
		// String.equals() 는 두 문자열에서 각 문자들이 서로 같은지를 판별하도록 오버라이딩이 되어 있음.
		String str1 = "Hello";
		String str2 = "Hello";
		
		if (str1.equals(str2)) {
			System.out.println("str1과 str2는 같다. ");
		}
		
		
		// equals 오버라이딩 테스트
		Book book2 = new Book("자바의 정석", "남궁 성", 30000);
		
		if(book1.equals(book2)) { // book1과 book2가 동등 객체인지 비교
			System.out.println("같은 책이다.");
		} else { 
			System.out.println("다른 책이다.");
		}
		
		
		Book book3 = new Book("수학의 정석", "홍성대", 20000);
		
		if(book1.equals(book3)) {
			System.out.println("같음");
		} else {
			System.out.println("다름"); 
		}
		
		
		System.out.println("====================");
		JavaBook jb = new JavaBook();
		System.out.println(jb.informationTransfer());
		
		/* 바인딩(binding)
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		}
	
	
	
	
		
	}



