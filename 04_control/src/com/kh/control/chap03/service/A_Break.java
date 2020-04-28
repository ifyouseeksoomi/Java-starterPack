package com.kh.control.chap03.service;

import java.util.Scanner;

public class A_Break {

	public void example1() {
		
		// 1~10까지 출력 (for문 사용하나 조건식 사용하면 안됨)
		
		for (int i=1;  ; i++) {
			// for문에 조건식이 없어 반복문이 종료되는 시점을 알 수 없음.
			// --> 무한루프 빠질 수 있으니 주의
			
			if (i>10) {
				
				break;
				
			} System.out.println(i);
		} 
		
	}

	public void example2() {
		// 문자열을 입력받아 출력하기. 단 exit 입력 시 종료
		
		Scanner sc = new Scanner(System.in);
		
		String str = null; 					// 입력되는 문자열을 참조할 변수 선언
		
		while (true) { 						// while문 강제로 무한반복 시키기 (제어하지 않는 이상 안꺼짐.)
											// () 속의 조건식이 true일 경우 수행된다는 while문의 특징을 이용한 것으로, true라는 예약어를 그냥 사용한 것임.
						
			System.out.println("입력: ");
			str = sc.nextLine();
			System.out.println("str: " + str);
			
			if(str.equals("exit")) {
				
				break;
			
			}
		}
		
	}



}


