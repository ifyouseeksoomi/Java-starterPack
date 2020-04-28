package com.kh.control.chap02.service;

import java.util.Scanner;

public class A_For {
	/* 
	 * [표현식]
	 * for(초기식; 조건식; 증감식) {
	 * 		반복 수행할 코드;
	 * }
	 * 
	 * [표현식 개체 설명]
	 * 초기식: for문 내에서 반복제어를 위해 사용할 변수를 선언하는 부분
	 * 조건식: 반복문이 반복을 수행하기 위한 조건을 작성하는 부분
	 * 		- 조건식이 true이면 반복 O, 조건식이 false이면 반복 종료
	 * 		- 조건식은 매 반복 시작시마다 검사를 진행.
	 * 증감식: 초기식을 증가 또는 감소 시켜 변화를 주는 식
	 * 		- 매 반복 종료 시, 초기식을 증가 또는 감소 시킴.  
	 * 
	 * 
	 * [ex.]
	 * for(1; 5 이하; 초기식+1) --> 6 출력
	 * 
	 */

	public void example1() {
		// 1부터 5까지 주르륵 출력하기
	
		//     초기식;    조건식;  증감식
		for ( int i=1 ; i<=5 ; i++  ) {  // 여기 증감식에서는 전위, 후위 크게 상관이 없는게 이미 세미콜론부터 ) 까지안에 연산자가 ++ 하나라서 헛갈릴 염려X
			
			System.out.println(i);
		}
	}		
		// 출력하면 1, 2, 3, 4, 5가 나올 건데 이게 어떻게 되는거냐면
		// 1로 돌렸을 때(초기식) 조건식에 맞으니까 증감으로 가는데 여기서 i=1를 버리는게 아니라 이것도 역시 출력임. 
		// 그래서 쌓여서 1, 2, 3, 4, 5 출력되는 거임.  
	
	
	
	public void example2() {
		// 5부터 1까지 출력하기
		
		for (int i=5 ; (i>0) && (i<6) ; i-- ) {
			System.out.println(i);
		}
	}
	
		// 근데, 내가 생각한 것보다도 1 2 3 4 5 출력했던 식을 그냥 다 뒤집는게 더 쉽다.
		// -> for (int i=5; i>=1; i--)
	
	
	
	public void example3() {
		// 1부터 50까지 홀수 모두 출력

		for (int i=1; i<51; i+=2) {
			System.out.println(i);
		}
	}
	
	
	public void example4() {
		// 구구단 7단 출력하기 
		
		int dan=7;
		for (int i=1; i<=9; i++) {
			System.out.println(dan + "X" + i + "=" + (dan*i));
		}
	}
	
	
	public void example5() {
		// 정수를 하나 입력받아 해당 수가 2~9 사이 수인지 검사하여 
		// 맞을 경우, 해당단의 구구단을 출력하기
		// 아닐 경우, "2~9 사이의 수를 입력하세요" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2에서 9사이의 정수를 하나 입력하세요. ");
		int dan = sc.nextInt();
		sc.nextLine();
		
		if ((dan>=2) && (dan<=9)) {
			for (int i=1; i<=9; i++) {
				System.out.printf("%d X %d =%d\n", dan, i, dan*i);			
					}
				}
	
	}
	

	public void example6() {
		// 1~100까지의 합
		
		int sum=0;
		// 1부터 100까지의 숫자의 합을 저장할 변수 sum
		// 이 변수를 선언과 동시에 초기화 (여기에서는 필수 작업)
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	
	}
	
	
	public void example7() {
		// 1~입력받은 정수까지의 합								scanner 사용+for문
		// 단, 입력하는 수는 1을 초과한 수여야함.					scanner 사용
		// 1이하의 수 입력시, "잘못 입력하셨습니다." 출력 				if-else문
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1을 초과하는 정수 하나를 입력하시오. ");
		int input = sc.nextInt();
		sc.nextLine();

		if (input<=1) {
			System.out.println("잘못 입력하셨습니다.");
		} else { 
			
			int sum = 0;
			
			for ( int i=1; i<=input; i++ ) {
				sum+=i;
			}
			
			System.out.println(sum);	
		}
	}
	
	public void example8() {
		// 중첩 for문 (이중 for문)
		
		// 1부터 5까지 출력되는 문장을 다섯줄 출력하기
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) { 
				System.out.print(j+ " ");
			}
			
			System.out.println(); 			// 1 2 3 4 5 출력 후 줄바꿈 코드
		
		}
	
	}
	
	public void example9() {
		// 0분 0초부터 9분 59초
	
		for(int min=0; min<10; min++) {  // 분
			
			for (int sec=0; sec<60; sec++) { // 초
				
				System.out.printf("%2d분 %2d초\n", min, sec);
		}
	}
		
		
	}
	
	
	public void example10() {
		// 구구단 2단부터 9단까지 모두 출력
		
		// 2~9단을 반복하는 for문을 먼저 바깥쪽에 만든다.
		for (int dan=2; dan<10; dan++) {
			
			// 그 안에, 해당 단에 곱해지는 수(1~9)를 반복하는 for문을 만든다.
			for (int su=1; su<10; su++) {
				System.out.printf("%2d*%2d=%2d ", dan, su, dan*su);				
			}
			
			System.out.println("\n"); // 줄바꿈
		}
	}
	

	public void example11() {
		// 별 찍기 (* 이용)
		// 1. 걍 5행 5열 출력
		
		for(int i=0; i<5; i++) {		// 0으로 시작해서 [ 0 1 2 3 4 ] 5회 반복 가능. 참고로 행을 만드는 식임.
			
			for(int j=0; j<5; j++) {    // 역시 0으로 시작해서 [ 0 1 2 3 4 ] 5회 반복 가능.
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
				
		// for (char star=1; star<6; star++) {
		//	System.out.println("*");
		
	}
	
	
	public void example12() {
		// 별 찍기 (* 이용)
		// 2. 별을 1, 2, 3, 4개 찍기
		
		// *
		// **
		// ***
		// ****
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
			
		
	}
		
		
}

	

