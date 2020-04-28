package com.kh.operator.service;

import java.util.Scanner;

public class G_Triple {
	// 삼항 연산자
	// (조건식) ? 식1 : 식2;
	// - 조건식이 true인 경우 식1 수행, 조건식이 false인 경우 식2 수행
	// - 조건식의 결과는 반드시 true 또는 false
	// --> 비교/논리 연산의 결과가 대부분
	
	public void example1( ) {
		// 정수를 입력받아 양수인지 아닌지 검사하기
		// 참고: 정수 == 양의정수, 음의정수, 0
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		// 위의 조건에 따라 삼항연산자 작성해보기
		// 				        조건식            ?     식1	    :	        식2
		String result = (input > 0)  ? ("양수입니다.") : ("양수가 아닙니다.");
		
		System.out.println(input + "은/는 " + result); 
	}

	public void example2( ) {
		// 정수를 입력받아 양수인지 0인지 음수인지 검사하기
		// 이제는 삼항 연산자가 "중첩 사용"되어야 한다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		// 위의 조건에 따라 삼항연산자 작성해보기 (식2에도 새로운 조건식을 넣을 것임)
		// 				        조건식            ?     식1	    :	                       식2
		String result = (input > 0)  ? ("양수입니다.") : ((input < 0) ? "음수이다." : "0이다.");
													
		System.out.println(input + "은/는 " + result); 
		
		
		
		
		
		
		
		
		
		
		
	}
}
