package com.kh.api.chap01.model.service;

import java.util.Scanner;

public class StringService {
	// String 클래스
	// - immutable(불변) 객체로 한번 지정된 문자열은 수정 불가능 
	// 	 --> 수정 시 새로운 문자열 객체가 생성되고 해당 주소를 반환함
	
	public void example1() {
		// 1) String 값 수정 시, 주소가 바뀌는지?
		
		String s1 = "ABC";
		// System.out.println(s1.hashCode());
		// String의 hashCode()는 문자열을 이용하여 동일 비교하는 것이기 때문에
		// 주소가 같은지 확인하는데는 부적절 
		// --> System.identityHashCode() 사용!
		// --> 객체의 실제 저장 주소를 이용하여 hashCode를 만드는 메소드
		
		System.out.println("변경 전 s1: " + System.identityHashCode(s1));
		
		s1 = "ABCD";  // s1 수정
		System.out.println("변경 후 s1: " + System.identityHashCode(s1));
		
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println("str1.equals(str2): " + str1.contentEquals(str2));
		System.out.println("str1==str2: " + (str1==str2));

		// String Literal(리터럴)로 String값 지정 시
		// 같은 문자열일 경우 같은 주소를 반환한다.
		// (+String Pool)
		
		String str3 = new String("Hello");
		System.out.println("str3: " + str3);
		
		System.out.println("str1 === str3: " + (str1 == str3));
		// 이게 왜 false냐면 지금 할당 방법이 혼자만 힙 영역에 객체 할당 후 참조하는 형식임
		// 근데 이때의 힙 영역이 constant pool 외부라는 점
		
		Scanner sc = new Scanner(System.in);
		System.out.print("str4 입력: ");
		String str4 = sc.nextLine();
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str4));
		System.out.println("str1 == str4: " + (str1 == str4));
		
		System.out.println("String 동등 비교가 필요하면 equals() 사용할 것!");
		System.out.println("String은 불변이다.");
		
	}
	
	public void example2() {
		// StringBuffer
		// - 문자열 수정이 가능한 mutable(가변) 객체
		
		StringBuffer sb = new StringBuffer();
		// StringBuffer 개체를 기본생성자로 생성 시 기본 버퍼 크기 ""16""을 할당함.
		
		// capacity: 용량 확인
		System.out.println("sb.capacity(): " + sb.capacity());
		
		System.out.println("sb.hashCode(): " + sb.hashCode());
		// hashCode에 마우스를 가만히 대면 object 클래스의 hashCode라고 나온다 이 말은,
		// Stringbuffer 클래스가 hashCode()를 오버라이딩 하지 않았다는 것을 의미
		// Object.hashCode() : 객체 주소를 이용하여 해시코드 생성
		
		// append(): 기존 문자열 뒤에 추가
		sb.append("java api");
		System.out.println("추가 후 sb.capacity(): " + sb.capacity());
		System.out.println("추가 후 sb.hashCode(): " + sb.hashCode());
		
		// 결과를 보아하니, 기존 문자열 뒤에 추가했지만 모든 값이 같다.
		// 가변성을 보여주는 결과이다 (속에서 담는 내용이 변화해서 겉으로 보여지는 카파나 해시코드에 변화가 없다는 것)
		
		sb.append("1234567890"); // 기존 용량인 16을 초과 (현재 java api와 합쳐 이제 18글자)
		System.out.println("추추가 후 sb.capacity(): " + sb.capacity());
		System.out.println("추추가 후 sb.hashCode(): " + sb.hashCode());
		
		// 이번에는 해시코드는 그대로이나 주소는 변한다. (기존값 +1)*2 만큼으로
	
		System.out.println("sb: "+ sb/*.toString()*/); // 저절로 toString 붙는 것이라는 소리
		
		// StringBuffer를 String으로 반환하는 방법
		String str = sb.toString();
		// toString의 정확한 뜻: 필드 영역의 멤버변수를 ""문자열""로 반환하라
		
		
	}
	
	public void example3() {
		// String.split(구분자); (StringTokenizer랑 비슷)
		// --> 문자열을 해당 구분자를 기준으로 쪼개어 String[] 형태로 반환
		
		String str = "사과, 포도, 참외, 오렌지, 수박, 멜론, 복숭아, 자두";
		
		// ,(공백)을 구분자로하여 분해
		String[] arr = str.split(", "); 
 		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void example4() {
		// Wrapper클래스: 기본자료형(Primitive Data Type, 원시타입)을 객체화 해주는 클래스 
	}
	
	
	
}
