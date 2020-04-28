package com.kh.control.chap01.service;

import java.util.Scanner;

public class B_Switch {
	// switch문
	// if문의 부분 집합(일부분)으로, 
	// if문은 조건식으로 범위를 지정할 수 있지만, switch문은 딱 떨어지는 값이 조건식으로 작성되어야 한다.
	
	/* [표현식]
	 * 
	 * switch(비교할 대상 또는 식 ex. num) {
	 * 
	 * case(들여쓰기하지 않는다) 값1 : 실행코드1; break;
	 * case 값2 : 실행코드2; break;
	 * 		.....
	 * default : else에 해당하는 실행코드;
	 * 
	 * }
	 * 
	 * 참고 break: switch문을 멈추시오.
	 * 
	 */
	
	public void example1 () {
		// 1~5 사이의 정수를 입력받아 1이면 A팀, 2면 B팀 ... 팀을 부여하고 출력하시오.
		// 단, 입력받은 수가 1~5사이의 수가 아니면 "잘못 입력하셨습니다." 출력.
		
		System.out.print("정수를 입력해주세요. ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.nextLine();
		
		switch(input%6) {
		case 1: System.out.println("A팀"); break;
		case 2: System.out.println("B팀"); break;
		case 3: System.out.println("C팀"); break;
		case 4: System.out.println("D팀"); break;
		case 5: System.out.println("E팀"); break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
		
			
	}
	
	public void example2() {
		// 두 수를 입력받고, 연산자(+-*/%) 중 하나를 입력받아 두 수를 연산한 결과를 출력.
		// 단, 잘못된 연산자 입력 시 "연산자를 잘못입력하셨습니다."라고 출력.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두 번째 정수: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자(=-*/%) 입력: ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0; // 연산후의 결과값 int형 변수 result를 선언 및 0으로 초기화
						// int형의 기본값은 0
		
		switch (op) {
	
		case '+': result = num1+num2; break;
		case '-': result = num1-num2; break;
		case '*': result = num1*num2; break;
		case '/': result = num1/num2; break;
		case '%': result = num1%num2; break;
		default : System.out.print("연산자를 잘못 입력하셨습니다.\n"); return;
			
		}
		
		// default일 때, 아래 문장이 출력되지 않게 하려면 
		// return을 디폴트 끝에 붙여주자 (example2 메소드 시작점으로 돌아가는 효과/기능의 종료와 같은 효과)
		//
		// return: 호출한 곳으로 돌아가라 
		// 		 --> return 코드를 읽는 시점에서 해당 메소드가 종료되었다. (메소드 종료 기능으로 사용 가능) 
		
		System.out.printf("%d %c %d = %d", num1, op, num2, result);
		
		
	}


		
	
	public void example3() {
		// 과일 이름(사과, 복숭아, 바나나)을 입력받아,
		// 사과: 3천원 / 복숭아: 8천원 / 바나나: 2천원 을 출력
		// 단, 잘못 입력한 경우 "해당하는 과일이 없습니다." 출력
		
		Scanner sc = new Scanner(System.in); 						// 1. 먼저 Scanner 불러오기							-> 스캐너 임포트
		
		System.out.print("과일 이름을 입력하세요(사과, 복숭아, 바나나): "); 		// 2. 과일 이름 입력받기 위한 Scanner
		String fruit = sc.nextLine(); 								// 3. 과일의 이름을 저장할 변수							}> 변수 설정
		int price = 0; 												// 4. 과일의 가격을 저장할 변수
		
		switch (fruit) {											// 5. 스위치 기준을 과일에 따라 가겠다						-> 스위치 시작
		
		case "사과" : price = 3000; break;							// 6. 케이스 열고 과일 이름에 따라 이미 설정한 가격 변수가 과일에 따라 어떻게 될건지 설정
		case "바나나" : price = 2000; break;							//	     이 때, break 안걸어주면 아래 가격 나와버림 (후에 이 기능을 의도적으로 이용할 수도 있다)
		case "복숭아" : price = 8000; break;
		default : System.out.println("해당하는 과일이 없습니다."); return;	// 7. 디폴트 값 설정 및 리턴 							-> 스위치 마무리
		
		}
		
		System.out.println(fruit + "의 가격은" + price + "원 입니다. ");	// 8. 그래서 최종 출력이 어떻게 되는지 쓰기					-> 최종출력
	
	}
	
	
	public void example4() {
		// 1~12월 중 하나를 입력받아 해당월의 일수를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12월 중 하나를 입력: ");
		int month = sc.nextInt();
		sc.nextLine();
		
		// 31 : 1, 3, 5, 7, 8, 10, 12 
		// 30 : 4, 6, 9, 11
		// 28 or 29 : 2
		
		switch (month) {
		
		case 1: case 3: case 5: case 7:
		case 8: case 10: case 12:						// 모두 31일의 값을 가질 케이스들을 break 쓰지 않고 하나 하나 나열
			System.out.println("31일"); break;			// 모든 31일을 가지는 달의 케이스들을 모두 입력한 후에 break; 작성 : "권한이행" 이라고도 부르는 코딩.
		
		case 4: case 6: case 9: case 11: 
			System.out.println("30일"); break;			// 같은 방식으로 30일을 가지는 달들도 정리한다. 
			
		case 2:
			System.out.println("28일 or 29일"); break;
			
		default:
			System.out.println("잘못 입력하셨습니다."); break;
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}

		


