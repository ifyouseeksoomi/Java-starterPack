package com.kh.variable.practice1;

public class VariablePractice2 {

	public void method2() {
		
		java.util.Scanner method2 = new java.util.Scanner (System.in);
				
		System.out.print("첫 번째 정수: ");
		int number1 = method2.nextInt();
	
		System.out.print("두 번째 정수: ");
		int number2 = method2.nextInt();
		
		method2.nextLine();
		
		System.out.println("\n더하기 결과: " +(number1+number2));
		System.out.println("빼기 결과: "+ (number1-number2));
		System.out.println("곱하기 결과: "+ (number1*number2));
		System.out.println("나누기 몫 결과: "+ (number1/number2));
 	}
	
}
