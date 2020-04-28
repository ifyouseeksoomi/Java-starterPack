package com.kh.operator.service;

public class B_InDecrement {
	
	// 증감 연산자
	// - 피연산자를 1 증가 또는 감소 시키는 연산자
	// -> 연산자: 연산을 당하는 수 또는 변수
	
	// ++ (1증가), -- (1감소)
	
	// 전위 연산자: 먼저 증감 연산 실행 후 다른 연산 진행, 후위 연산자 : 다른 연산 진행 후 증감 연산 진행
	
	public void example1() {
		// 전위 증감 연산자 테스트
		int num =10;
		System.out.println("전위 증 감연산자 적용 전: " + num); // num=10 
		System.out.println("++num 1회 수행 후: " + (++num)); // num=11
		System.out.println("++num 2회 수행 후: " + (++num)); // num=12
		System.out.println("++num 3회 수행 후: " + (++num)); // num=13
		System.out.println("++num 4회 수행 후: " + (++num)); // num=14
		System.out.println("++num 5회 수행 후: " + (++num)); // num=15
		System.out.println("전위 증감 연산자 적용 후: "+ num); // 맨 마지막 값인 num=15
		
		// 경계선 출력
		System.out.println("\n-----------------------------\n");
		
		// 후위 증감연산자 테스트 (★)
		int num2 = 10;
		System.out.println("후위 증감 연산자 적용 전: " + num2); // num2=10
		System.out.println("num2-- 1회 수행 후: " + (num2--)); // 출력: 10, num2=9
		// 이 때는 출력값과 num2의 값 둘 다 신경써야함. 출력 자체는 10으로 나올 것이다 대입 연산을 먼저한 후에 --가 있으니. 
		// 그러나 모두 출력까지 수행 후 ""변수에 저장된 값""은 num2=9가 된다.
		System.out.println("num2-- 2회 수행 후: " + (num2--)); // 출력: 9, num2=8
		System.out.println("num2-- 3회 수행 후: " + (num2--)); // 출력: 8, num2=7
		System.out.println("num2-- 4회 수행 후: " + (num2--)); // 출력: 7, num2=6
		System.out.println("num2-- 5회 수행 후: " + (num2--)); // 출력: 6, num2=5
		System.out.println("후위 증감 연산자 적용 후: " + num2); // 출력: 5, num2=5
	}
	
	public void example2( ) {
		int num1 = 20;
		int result = num1++ *3;
		
		System.out.println("num1: " + num1); // num1: 21
		System.out.println("result: " + result); // result: 60
		
		System.out.println("\n-----------------------------\n");
	}
		
	public void example3( ) {
		int a=10;
		int b=20;
		int c=30;
		
		int result1= a++ ; 
		// result1=10, 그 이후에 a가 1증가해서 a=11, b=20, c=30
		
		int result2= (++a) + (b++) ;
		//			   12  +   20
		// a=12(이번에는 전위니까), b=21(후위연산이니까 위의 result2 낸 다음 증가했다), result2=32, c=30
		
		int result3= (a++) + (--b) + (--c) ;
		// 			   12  +   20  +   29
		// a=13 , b=20, c=29, result3=61
		
		System.out.println("a: " + a); // 13
		System.out.println("b: " + b); // 20
		System.out.println("c: " + c); // 29
		System.out.println("result1: " + result1); // 10
		System.out.println("result2: " + result2); // 32
		System.out.println("result3: " + result3); // 61
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


