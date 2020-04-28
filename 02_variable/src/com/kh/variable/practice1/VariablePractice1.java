package com.kh.variable.practice1;

public class VariablePractice1 {

	public void method1() {
		
		java.util.Scanner method1 = new java.util.Scanner(System.in);
	
		System.out.print("이름을 입력하세요: ");
		String name = method1.nextLine();
		
		System.out.print("성별을 입력하세요(남/여): ");
		char gender = method1.nextLine().charAt(0);
		
		System.out.print("나이를 입력하세요: ");
		int age = method1.nextInt();
		
		method1.nextLine();
		
		System.out.print("키를 입력하세요(cm): ");
		double height = method1.nextDouble();
		
		method1.nextLine();
	
		System.out.printf("\n키 %.1fcm인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);
		
		
				
		
		
		
		
		
	}
}
