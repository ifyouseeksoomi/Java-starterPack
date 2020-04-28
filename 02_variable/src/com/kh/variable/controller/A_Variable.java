package com.kh.variable.controller;

public class A_Variable {

	// 변수를 사용하지 않은 경우
	public void noVariable() {
		System.out.println("변수 사용 X");
		System.out.println(2*3.141592653589793*10);
		System.out.println(3.141592653589793*10*10);
		System.out.println(3.141592653589793*10*10*20);
		System.out.println(4*3.141592653589793*10*10);
	}

	// 변수를 사용한 경우
	public void usingVariable() {
		double pi = 3.141592653589793; // 원주율
		int r = 10; // 반지름
		int h = 20; // 높이
		
		System.out.println("변수 사용 O");
		System.out.println(2*pi*r); // 문자가 아니라 변수이기 때문에 "" 빼고 쓰기 // 원의 둘레
		System.out.println(pi*r*r); // 원의 넓이
		System.out.println(pi*r*r*h); // 원기둥의 부피
		System.out.println(4*pi*r*r); // 구의 겉넓이
		
		/* 변수 사용의 장점
		 * 
		 * 1. 값에 의미를 부여할 수 있다.
		 * 2. 가독성이 좋아진다.
		 * 3. 재사용성(지속성)이 좋다.
		 * 4. 유지보수성이 좋다.
		 * *
		 */

	}
	
		// 변수 선언
		public void declareVariable() {
			// 1. 논리형
			// 참(true), 거짓(false)를 저장할 수 있는 자료형
			boolean isTrue; // 1 byte // isTrue는 boolean 변수형의 이름    
			
			// 2. 숫자형
			// 2-1. 정수형 (양의정수, 음의정수, 0)
			
			byte bNum; // 1byte
			short sNum; // 2byte
			int iNum; // 4byte --> 정수형 중에 기본형
			long lNum; // 8byte
			
			
			// 2-2. 실수형
			// 실수형 데이터의 저장 방식: 부동소수점(가수부, 진수부 나오는거) 방식을 사용
			
			float fNum; // 4byte(= int의 크기)
			// 0.9999999 (float) : 소수점 아래로 8개까지 (출력시에는 마지막 단위 반올림되어 7개 표시)
			
			// 0.999999999999999 (double) : 소수점 아래로 16개까지 (출력시에는 마지막 단위 반올림되어 15개 표시)
			double dNum; // 8byte
			
			// double은 float보다 정확도(소수점 표현 길이)가 두 배크다! 그리고 
			// double이 실수형의 기본형이다
			
			
			// 3. 문자형
			// 문자형 변수는 문자 딱 하나만을 저장할 수 있다.
			char ch; // (자바는) 2byte cf. C언어에서는 1바이트
			
			
			// 4. ★문자열 (특별)
			// 문자열은 기본자료형이 아님 --> 참조형(reference var이라고 함)
			// 문자열은 메모리 크기가 되는 한 무제한이다
 			String str;
 			// 글자 하나 당 2byte를 잡아 먹음
 			// int와 같은 크기로 4byte
 			
 			// ------------------------------------------------------
 			// 선언한 변수에 값 대입
 			
 			isTrue = true; 
 			isTrue = false;
 			// boolean 자료형 변수에 대입될 수 있는 값(리터럴)은 true와 false 뿐임
 			
 			
 			// 정수형
 			bNum = 1;
 			// bNum = 128;
 			// 128은 byte 자료형의 값의 범위를 넘어선 값이므로 type mismatch error 발생
 			
 			sNum = 10000;
 			iNum = 2000000000;
 			
 			// byte, short 자료형은 옛날 프로그램과의 호환성을 위해 남겨진 자료형으로
 			// 별도의 리터럴 표기법이 존재하지 않아 int의 리터럴 표기법을 사용한다. (즉 그래서 안씀)
 			
 			lNum = 123L;
 			// 정수형 long의 리터럴 표기법은 정수 뒤에 l 또는 L을 표기함
 			
 			// 실수형 
 			fNum = 1.234f; // 여기서 fNum=1.234; 할라고 하면 실수형의 기본형이 double이라서 에러남
 			
 			dNum = 3.141592;
 			// double은 실수형의 기본형이기 때문에 별도의 리터럴 표기법을 갖지 않고 실수 자체만을 작성함
 			
 			// 문자형
 			ch = 'A';
 			// char 자료형의 리터럴 표기법은 ''(홀따옴표)
 			
 			str = "A";
 			// string의 리터럴 표기법은 ""(쌍따옴표)
 			// 한 글자만 작성하더라도 쌍따옴표로 표기해야 한다.
 			
 			// 지금까지 해본 조합
 			// 문자열 + 문자열
 			// 숫자 + 문자열
 			// 문자열 + 숫자
 			// 숫자 + 변수
 			// 문자열 + 변수
 			
 			// 변수에 저장된 값 출력하기
 			System.out.println("isTrue 변수에 저장된 값: " + isTrue); // true
 					// isTrue 변수에 저장된 값 : true
 			System.out.println("bNum 변수에 저장된 값 : " + bNum);
 			System.out.println("sNum 변수에 저장된 값 : " + sNum);
 			System.out.println("iNum 변수에 저장된 값 : " + iNum);
 			System.out.println("lNum 변수에 저장된 값 : " + lNum);
 			System.out.println("fNum 변수에 저장된 값 : " + fNum);
 			System.out.println("dNum 변수에 저장된 값 : " + dNum);
 			
 			System.out.println("ch 변수에 저장된 값 : " + ch);
 			System.out.println("str 변수에 저장된 값 : " + str);
 			
 			
 			// 변수명은 한글도 가능하다?! YES!
 			int 인트; 
 			인트 = -100;
 			System.out.println("인트 변수에 저장된 값 : " + 인트);
 			
		} 
		
		
 			// 변수 선언과 동시에 초기화
 			public void initVariable() { 
 				// init: 초기화하다
 				
 				// 1. 논리형
 				boolean isTrue = false;
 				
 				// 2. 정수형
 				byte bNum = 1; // 1byte
 				short sNum = 2; // 2byte
 				int iNum = 4; // 4byte, 정수(자료)형 중의 기본형
 				long lNum = 8L; // 8byte
 				
 				// 3. 실수형
 				float fNum = 4.0f; // 4byte
 				double dNum = 8.0; // 8byte, 실수(자료)형의 기본형
 				
 				// 4. 문자형
 				char ch = '많'; 
 				
 				// 5. 문자열(기본형 아니구 참조형이라서 써도 보라색으로 변하지 않음)
 				String str = "A강의장";
 				
 				System.out.println("isTrue의 초기화된 값: "+isTrue);
 				System.out.println("bNum의 초기화된 값: "+bNum);
 				System.out.println("sNum의 초기화된 값: "+sNum);
 				System.out.println("iNum의 초기화된 값: "+iNum);
 				System.out.println("lNum의 초기화된 값: "+lNum);
 				System.out.println("fNum의 초기화된 값: "+fNum);
 				System.out.println("dNum의 초기화된 값: "+dNum);
 				System.out.println("ch의 초기화된 값: "+ch);
 				System.out.println("str의 초기화된 값: "+str);
 			
 			}

 
}
 			

		
	




