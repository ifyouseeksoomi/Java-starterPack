package com.kh.object.chap04_field.model.vo;

public class Field {
	/* 필드 (Field, 멤버 변수)
	 * - 클래스 영역에 작성하는 변수로 (public class 하고 바로 친다는 소리임)
	 * 	  같은 클래스 내 어디서든 사용(접근) 가능
	 * 
	 */
	
	public int num; // 바로 이런 것이 ""클래스 영역에 선언""된 int형 변수 == 필드
		
	public void example1() {
		// 지역 변수(Local Variable)
		// - 메소드, 생성자, 제어문(for, while, if, else, switch, case)의 공통점
		//   : 지들만의 특정한 구역 ({ })을 가진다는 것. 지역 변수는 이 안에 생성되는 변수.
		//	 : 그래서 이 지역 변수는 해당 지역에서만 사용 가능.
		
		int num2 = 10; // 지역 변수에 10을 초기화
		num = 1;
	}
	
	public void example2() {
		num = 100;		// 얘는 클래스 영역 선언이기 때문에 OK
		// num2 = 300;  num2의 지역을 벗어났기 때문에(example1이 아님) 접근 불가
	
	}
	
	
	// 필드 세분화
	// 1) 멤버 변수 (인스턴스 변수) 
	private char ch; 
	private double db;
	/* 위와 같은 멤버 변수가 생성되는 시점: new 연산자를 통해 Heap 영역에 객체(인스턴스) 생성 시 메모리에 할당됨. (여기서 생성과 할당은 같은 의미를 가짐)
	 * 위와 같은 멤버 변수가 소멸되는 시점: 객체가 소멸 시 소멸
	 * 						 --> 객체는 언제 소멸? 
	 * 							  객체가 어떤 참조형 변수에도 참조되지 않을 때 GC에 의해서 소멸됨
	 * */
	
	// 2) 클래스 변수 (static 변수)
	// - static 예약어가 붙은 필드
	public static int number; // static 변수라는 의미로 number가 기울었다
	/* 위와 같은 멤버 변수가 생성되는 시점: 프로그램 실행 시 static 메모리 영역에 할당됨
	 * 위와 같은 멤버 변수가 생성되는 소멸: 프로그램 종료 시 소멸 
	 * 
	 * */
	
	
	public char getCh() {
		return ch;
	}
	
	public void setCh(char ch) {
		this.ch= ch;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
