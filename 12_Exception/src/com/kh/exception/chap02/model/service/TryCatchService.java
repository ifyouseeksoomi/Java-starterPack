package com.kh.exception.chap02.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchService {
	
	// try: 예외가 발생할 가능성이 있는 코드를 블록 내에 작성하고 시도
	// catch: try에서 던져지는 예외를 잡아서 처리하는 구문
	// finally: try~catch구문 수행 후 마지막에 반드시 실행해야 하는 코드를 작성하는 부분
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1: ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2: ");
		int num2 = sc.nextInt();
		
		try {
			System.out.println(num1 + "/" + num2 + "=" + num1/num2);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
	
	}
	
	public void example2() {
		
		String[] arr = {"파스타", "백반", "돈까스", null, "칼국수"};
		
		int i=0;
		while (true) {
			try {
			System.out.println(arr[i++].charAt(0));
				// 부모 타입의 예외 처리(Catch)를 자식보다 먼저 작성하면
				// try구문에서 발생하여 전달되는 Exception 객체를
				// 다 잡아서 처리하는 상황이 발생하여 
				// 이후에 작성된 자식 타입 예외 처리(catch)는 동작하지 못하는 문제 발생
				// --> 해결방법: 부모타입 예외처리 코드를 자식 이후에 작성한다. (널 or 어레이 -> 런타임)
			} catch (NullPointerException e) {
				System.out.println("참조 값이 없습니다. ");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 범위를 넘어서는 영역을 참조하였습니다.");
				break;
			} catch (RuntimeException e) {
				System.out.println("코드 실행 중 예외 발생");

			}
		}
		
	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		int menu=0; // int형이었다가 String으로 바꿔서 해본 이유는, 꼭 사용자가
					// int형만 입력해야한다는 부담이 없게 하려고
		do {
			System.out.println("===== 메뉴 =====");
			System.out.println("1.example1() 호출");
			System.out.println("2.example2() 호출");
			System.out.println("9. 프로그램 종료");
			System.out.print("선택>> ");
			
			try {
				
				menu = sc.nextInt();
				
				switch (menu) {
				case 1: 
					example1();
					break;
				case 2:
					example2();
					break;
				case 9:
					System.out.println("종료합니다. ");
				default:
					System.out.println("다시 입력해주세요.");
					
				}
				
				
			} catch (InputMismatchException e) {
				System.out.println("정수만 입력해주세요.");
				sc.nextLine();
				// 버퍼에 남아있는 잘못 입력된 문자열을 꺼내옴으로써 다시 nextInt()가
				// 수행될 수 있도록함.
			} catch (Exception e) {
				// exception이 최상위 부모이므로 결국 최종적으로 모든 예외를 잡겠다는 말임
				System.out.println("발생된 예외 처리");
				break;
			}
			// java.util.InputMismatchException 
			// Scanner를 이용하여 데이터 입력 시 
			// 입력 자료형이 불일치하는 경우에 발생
			
		} while (menu != 9);
	}
	
	public void example4() {
		// 두 정수를 입력받아 나눈 몫 구하기
	    // 단, BufferedReader 사용하기
		
		BufferedReader br = null; // 처음에는 그냥 참조변수만 만드는거임
		// 그리고 이걸 이 아래아랫줄에다가 BufferedReader br = new ~~이렇게 안한 이유는
		// try 지역변수화시키지 않으려고 한 것임.
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("숫자 1 입력: ");
			int num1 = Integer.parseInt(br.readLine());
			
			System.out.print("숫자 2 입력: ");
			int num2 = Integer.parseInt(br.readLine());
			
			System.out.print("몫: " + (num1/num2));
			
		} catch (IOException e) { 
			e.printStackTrace(); 
			// 예외가 발생한 시점의 스택구조와 예외 발생 코드의 위치를 출력
			// --> 예외 처리 전 console에 출력되던 에러 내용과 같음
			// 기기가 정상작동하고 있을 때 웬만하면 나오지 않는 에러코드임 그러나 무조건 쓰라고 했음.

		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			
		} catch (NumberFormatException n) {
			System.out.println("정수만 입력해주세요. ");
		
		} finally {
			
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
						
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


