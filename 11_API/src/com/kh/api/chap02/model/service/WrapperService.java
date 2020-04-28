package com.kh.api.chap02.model.service;

public class WrapperService {
	/* Wrapper Class
	 * - 원시 타입(기본 자료형)을 객체로 포장하는 클래스
	 * - 왜? Wrapper Class는 왜 사용하는가?
	 * 1) 기본 자료형으로는 수행할 수 없는 속성, 기능을 사용하기 위해
	 * ex. 속성: 각 자료형의 최대, 최소값, 바이트 크기 전환 반환
	 * 	   String 형태("1") <-> int 형태 (1) :문자형 1을 숫자형 1로 바꾸는 것
	 * 
	 * 2) 기본 자료형을 어쩔 수 없이 객체로 다루어야되는 경우가 있음
	 * 	  -- 메소드의 매개변수로 객체를 요구할 때
	 * 	  -- 기본 자료형이 아닌 객체로 값을 저장해야 할 때
	 * 	  -- 객체간의 비교가 필요할 때
	 * 	   
	 */
		
	public void example() {
		/* 
		 * byte		Byte
		 * short	Short
		 * int		Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * char		Character
		 * boolean	Boolean
		 * 
		 * */
		
		// Integer Wrapper 클래스가 제공하는 상수 필드
		System.out.println(Integer.BYTES); // int byte 크기 =4
		// 잠깐 객체 생성도 안했는데 필드에 접근할 수 있다? --> 왜냐면 public static final int BYTES 이니까
		// 클래스명.대문자 --> 걍 되면 스태틱파이널이다 알 수 있는 것
		
		System.out.println(Integer.SIZE); // int bit 크기 =4*8=32
		System.out.println(Integer.MAX_VALUE); // int 최대값
		System.out.println(Integer.MIN_VALUE); // int 최소값		
		
		// String 자료형 --> 기본 자료형(int)으로 변환
		String str = "100, 200, 300, 400";
		
		String[] arr = str.split(", ");
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += Integer.parseInt(arr[i]); // 문자열을 인트형으로 바꿔라 라는 뜻
			// parseXXX : String 이지만 기본 자료형의 형태를 가지고 있으면 해당 자료형으로 변환 (파싱, parsing)
			// ex) "100" --> 100
		}
		
		System.out.println("합계: " + sum);
		
		// 기본 자료형(int) --> String 변환
		String s1 = Integer.valueOf(123).toString();
		// 이렇게 위처럼하면 자연히 string인게, toString이 원래 필드값 ""문자열""로 반환이니깐
		String s2 = 123 + "";
		// 혹은 이런 방법도 있음 아주 간단하게 걍 String화 되어버림
		
		
		// Boxing: 기본 자료형 --> 래퍼 클래스 객체로
		
		// int형 427을 Integer 객체로 변환(포장)
		Integer it1 = new Integer(427);
		Integer it2 = new Integer("427");
		// -> 래퍼 클래스 사용의 주된 이유: Collection 때문
		//	  --> Collection은 오로지 객체만 저장 가능하기 때문에 기본 자료형을 객체로 변환할 필요가 있음!
			  
		
		
		// UnBoxing: 래퍼클래스 객체 --> 기본 자료형
		int iNum1 = it1.intValue(); 
		int iNum2 = (int)it2; // 래퍼클래스 객체인 it2를 int형으로 강제 형변환
			
		
		// ★ JDK 1.5에 추가된 기능 
		// : Auto Boxing / Auto UnBoxing
		// 자동으로 기본 자료형 <-> 래퍼클래스 객체로 형변환
		Integer it3 = 1000; // Auto Boxing
		int iNum3 = it3; // Auto UnBoxing
		
		
				
				
				
				
				
				
				
				
				
				
				
				
	}
	
}
