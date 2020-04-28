package com.kh.exception.chap01.model.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionService {

	public void example1() {
		// Unchecked Exception 
		// 별도의 예외 처리를 하지 않아도 되는 예외 (Exception)
		// 주로 프로그래머의 부주의로 인한 오류인 경우가 많기 때문에 예외 처리 코드 보단 if문등을 이용하여 코드를 수정하는 경우가 많음
		
		// 두 숫자를 입력받아 나누기하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1: ");
		int num1 = sc.nextInt(); sc.nextLine();
		
		System.out.print("입력 2: ");
		int num2 = sc.nextInt(); sc.nextLine();
		
		if (num2!=0) { 		
			System.out.print(num1 + "/" + num2 + "=" + num1/num2);
		} else {
			System.out.println("0으로 나눌 수는 없습니다. ");
		}
		
		// java.lang.ArithmeticException: / by zero
		// 산술 연산 중 0으로 나누는 예외 상황이 발생 --> 이 정도는 위에 쓴 것처럼 if문으로 에러나지 않게 처리가 가능하다
			
	}
	
	public void example2() {
		
		String[] arr= {"초코파이", "몽쉘", null, "오예스"};
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] != null ) {
			System.out.println(arr[i].length()); 
			}
		}
		
		// java.lang.NullPointerException 
		// Null: 아무것도 참조하고 있지 않다. (아무것도 참조하고 있지 않은데 거기 있는 기능을 수행하려고 하니 당연히 에러 발생)
		// 저장된 값인 Null의 참조변수를 이용하여 객체 멤버 접근 시 발생하는 예외
		// --> 역시 위에서처럼 if문으로 처리 가능하다
		
		// 만일 37번째 줄을 i<=arr.length;로 바꾸면 : java.lang.ArrayIndexOutOfBoundsException
		// 배열의 인덱스 범위를 넘어서서 참조할 때 발생하는 예외
		// --> 역시 위에서처럼 if문으로 처리 가능하다
		 
	}
	
	public void example3() {
		// Checked Exception
		// 반드시 예외 처리를 해야하는 예외(Exception) 
		// 주로 IO(입출력) 상황에서 많이 발생함
		
		// Scanner 발생 이전(1.5버전 이전)에서의 입력 방법 재현해보기
		BufferedReader br 
		= new BufferedReader(new InputStreamReader (System.in));
		// Scanner(jdk 1.5) 이전에 사용되던 키보드 입력 방법
		
		System.out.println("입력: ");
//		String str = br.readLine();
		// Unhandled Exception type IOExceptiopn == IOException 예외 처리가 안되어 있다.
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
