package com.kh.operator.service;

import java.util.Scanner;

public class E_Logic {
	// 논리 연산자
	// - 논리 값 두개를 비교하는 연산자
	
	// && (AND): 둘 다 true일 때만 true 반환 (하나라도 false면 false)
	// --> '그리고', ~면서, ~이면서, ~부터, ~까지, ~사이 이런 뜻
	// ex) 1부터 100 사이 
	//     여자이면서 안경을 쓴 사람: 여자&&안경
	
	// || (OR): 둘 다 false일 때만 false 반환 (하나라도 true면 true)
	// --> '또는', ~거나, ~이거나 이런 뜻
	// ex) 스마트폰이 삼성 또는 LG인 사람: 삼성||LG
	
	public void example1() {
	// 갑자기 단축키!: 한 줄 삭제 -> 삭제할 행에 커서 위치 후 ctrl+d
		
	// 입력받은 정수가 1~100사이의(1 이상 100 이하) 숫자인지 확인하기

	Scanner sc= new Scanner(System.in);
	
	System.out.println("정수 하나 입력: ");
	int input = sc.nextInt();
	sc.nextLine();
	
	// 1 <= input <= 100 이냐 하는건데, 문제는 프로그램에 저런식으로 쓸 수가 없다. 
	// 왜냐면 비교연산자는 딱 한번밖에 못쓰거든. 그래서 한 식을 둘로 나누는 작업이 필요!
	
	boolean result = (1 <= input) && (input <= 100);
	// 이 때, &&이 아니라 ||를 쓰면 모든 숫자 범위가 된다.
	
	System.out.println("1부터 100 사이의 수인가? " + result);
   }

	
	public void example2 () {
		// 입력한 알파벳이 대문자(A~Z)인지 검사
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 하나 입력: ");
		char ch = sc.nextLine().charAt(0);
		
		// 'A' <= ch <= 'Z' 처럼 쓰면 우리는 이해를 할 수 있으나 컴퓨터는?
		// 놀랍지만 컴퓨터도 이와 같다! 왜냐,
		// char자료형에 실제 저장되는 값은 정수이기 때문에 지금 저 수식이 컴퓨터 입장에서는
		// 정수의 범위로 인식이 됨.
		// A~Z는 65부터 1씩 증가하면서 순서대로 나열되어 있다는 성질을 이용
		
		boolean result = (ch >= 'A') && (ch <= 'Z');
		
		System.out.println("영어 대문자 확인: " + result);
	}
	
	
	public void example3 () {
		// 입력받은 알파벳이  Y인지 검사(대소문자구분 x)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 하나 입력:  ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		System.out.println("Y or y인가?: " + result);

	}
	public void example4 () {
		// 증감 + 산술 + 비교 + 논리
			
		int a = 2;
		int b = 3;
			
		boolean c = a > b; // a=2, b=3, c=false
		boolean d = ++a <= b++; //  a=3, b:3 출력 후 4(샘은 그냥 b=4라고 표기), d=true 
			
		System.out.println("a : " +a); // 3 
		System.out.println("b : " +b); // 4
		System.out.println("c : " +c); // f
		System.out.println("d : " +d); // t
			
		System.out.println();
			
		System.out.println("!c : " + !c); // !false == true
		System.out.println("c != d : " + (c != d)); // true
			
		System.out.println();
			
		System.out.println("(a % b) == 1 : " + ((a % b) == 1));  // 3%4 == 3 false
		System.out.println("(a == 3) && (b == 4) : " + ((a == 3) && (b == 4))); // true
		System.out.println("!d || (a-b) > 0 : " + (!d || (a-b) > 0)); 
		// !d == false, a-b == -1 > 0 이라 false 
		// 고로 false || false == false
			
		System.out.println();
			
		System.out.println("!(c == d) && ((a * b == 10) || ( b % 2 == 0)) : " + (!(c == d) && ((a * b == 10) || ( b % 2 == 0)))); // t
		// !(c == d) == true
		// (a*b) == 10 == false
		// (b%2) == 0 == true
		// true && (false || true) 면 결국 true && true
		// 그리하여 true
		
		











	}
}





