package com.kh.control.chap01.service;

import java.util.Scanner;

public class A_If {
	/* 프로그램의 진행은 위에서 아래, 좌에서 우로 순차적으로 진행된다.
	 * 
	 * 이 순차적인 흐름을 바꿀 때 사용하는 것이 제어문.
	 * 
	 * - 선택적으로 원하는 코드를 수행 --> 조건문
	 * - 반복적으로 원하는 코드를 반복수행 --> 반복문
	 * - 반복문에서 특정 조건에 따라 반복 행위를 제어하는 것 --> 분기문
	 * 
	 * <조건문>
	 * 조건식이 참이냐 거짓이냐를 판단해서 
	 * 그에 만족하는 코드를 실행하는 구문
	 * 
	 * 조건문은 대표적으로 if, switch문 존재
	 * */
	
	public void example1 () {
		// 단독 if문
		// if문의 조건식이 true이면 중괄호({}, 블록)내의 코드를 수행
		// if문의 조건식이 false이면 해당 코드를 무시하고 건너 뛴다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		if(input > 0) {
			System.out.println("양수이다.");
		}
		
		if(input <= 0) {
			System.out.println("양수가 아니다."); 
		}
			
	}
		// 이런식으로 코드를 쓰면 너무 중첩되는 것이 많아서 좀 비효율적이라서 우리는 else문을 생각하게 된다
		
		
		
	public void example2 () {
		// if-else문
		/* - 조건식이 참인 경우 if문의 코드를, 거짓인 경우에는 else문의 코드를 수행.
		 * 
		 * [표현식]
		 * if(조건식){
		 *  	참인 경우 실행코드 ...
		 *  } else {
		 *  	거짓인 경우 실행코드 ...
		 *  }
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String result; // 결과 저장 변수 선언
		if(input % 2 == 0) { // 입력된 값이 짝수인 경우
			result = "짝수";
		} else {
			result = "홀수";
		}
		
		System.out.println(input+"은/는 "+result+"이다.");
		
	}
	
	public void example3 () {
		// 나이를 입력받아 일반, 청소년, 초등학생, 미취학아동 구분 후 요금 받기
		// 일반: 1250원 (20세 이상)
		// 청소년: 720원 (14세 이상 19세 이하)
		// 초등학생: 450원 (8세 이상 13세 이하)
		// 미취학아동: 0원 (0세 이상 7세 이하)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요. ");
		int age = sc.nextInt();
		sc.nextLine();
		
		int fare = 0; // 요금을 저장할 변수 선언 및 0으로 초기화 
		
		if(age >= 20) { 
			fare = 1250; // 20세 이상인 경우 일반
		} else if(age>=14 && age <=19) {
			fare = 720; // 14세 이상 19세 이하 청소년
		} else if(age>=8 && age <=13) {
			fare = 450; // 8세 이상 13세 이하 초등학생
		} else if(age>=0 && age<=7) {
			// fare = 0; (초기화 값이 0이니까 안써도 돼) // 0세 이상 7세 이하 미취학 아동
		} else { 
			// else if 말고 else는 오류 코드 같은 것 모음집
			// 0 미만 (즉, 오류 시에 어떻게 반응해야할지임)
			fare = -1;
		}
			
		System.out.println(fare + "원");	
		
	}
		
	
	public void example4 () {
		// 나이를 입력받아 일반, 청소년, 초등학생, 미취학아동 구분 후 요금 받기
		// 일반: 1250원 (20세 이상)
		// 청소년: 720원 (14세 이상 19세 이하)
		// 초등학생: 450원 (8세 이상 13세 이하)
		// 미취학아동: 0원 (0세 이상 7세 이하)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요. ");
		int age = sc.nextInt();
		sc.nextLine();
		
		String division; // 구분 내용을 저장할 변수 선언
		int fare = 0; // 요금을 저장할 변수 선언 및 0으로 초기화 
		
		if(age>=20) {
			
			if(age>=65) {
				division = "우대권";
				
			} else {
			
			division = "일반";
			fare = 1250; // 20세 이상인 경우 일반
		
			}
			
		} else if(age>=14) {
			division = "청소년";
			fare = 720; // 14세 이상 19세 이하 청소년
			
		} else if(age>=8) {
			division = "초등학생";
			fare = 450; // 8세 이상 13세 이하 초등학생
			
		} else if(age>=0) {
			// fare = 0; (초기화 값이 0이니까 안써도 돼) // 0세 이상 7세 이하 미취학 아동
			division = "미취학 아동";
			
		} else { 
			// else if 말고 else는 오류 코드 같은 것 모음집
			// 0 미만 (즉, 오류 시에 어떻게 반응해야할지임)
			division = "ERROR";
			fare = -1;
		}
		
		System.out.println("구분: " + division);
		System.out.print("요금: ");	
		
		if(fare == -1) { // 즉 ERROR인 경우
			System.out.println("ERR_04");
		} else { 
			System.out.println(fare +"원");
		}

	}
	
	public void example5() {
		// 점수를 하나 입력받아 등급을 출력하시오.
		// 95이상 A+	/ 94~90 A	/ 89~85 B+	/ 80~84 B
		// 79~75 C+ / 70~74 C	/ 69~60 D	/ 60미만 F
		
		// ex)
		// 점수 입력: 95
		// 95점, A+ 입니다.
		
		System.out.print("점수를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		
	if (input >=0 && input <=100) { 
		
		
		String division = ""; // 초기화하지 않고 그냥 선언만하게 되면 향후 에러 가능
							  // 즉, 니가 짜놓은 기준에 맞지 않는 수는 어쩔건데? 에 대한 
							  // 명확한 기준이 필요
		
		/*
		 * if (input>=95) {
			division = "A+" ;
		} else if (input >= 90) {
			division = "A" ;
		} else if (input >= 85) {
			division = "B+" ;
		} else if (input >=84) {
			division = "B" ;
		} else if (input >=80) {
			division = "C+";
		} else if (input >=75) {
			division = "C";
		} else if (input >= 60) {
			division = "D"; 
		} else if (input < 60) { // } else { 라고 써도 된다
			division = "F";
		} *
		  */
		
		// System.out.println(input + "점, " + division + "입니다.");	
	
	// 근데 솔직히 이 위에 코드 좀 비효율적임. 효율적으로 다시 쓰는 이프문은 아래.
	// 중첩 이프문 사용!
		
	if (input >=90) {
		division = "A";
		
		if(input>=95) {
			division += "+"; // 90점 이상 중에서도 95점 이상은 + 붙여서 산출하겠다
		}
		
	} else if (input>=80) {
		division = "B";
		
		if(input>=85) {
			division += "+"; // 80점 이상 중에서도 85점 이상은 + 붙여서 산출하겠다
	}
		
	
	} else if (input>=70) {
	  	division = "C";
		
		if(input>=75) {
			division += "+"; // 70점 이상 중에서도 75점 이상은 + 붙여서 산출하겠다
	}
		
	} else if (input>=60) {
		division = "D";
		
	} else {
		division = "F";
		
	}
		
	System.out.print(input + "점, " +  division + "입니다. ");
	
	
	} else { 
		System.out.println("잘못 입력하셨습니다. ");
	}
	
	}
	
}

