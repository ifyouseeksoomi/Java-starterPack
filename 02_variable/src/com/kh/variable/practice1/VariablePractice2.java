package com.kh.variable.practice1;

public class VariablePractice2 {

	public void method2() {
		
		java.util.Scanner method2 = new java.util.Scanner (System.in);
				
		System.out.print("ù ��° ����: ");
		int number1 = method2.nextInt();
	
		System.out.print("�� ��° ����: ");
		int number2 = method2.nextInt();
		
		method2.nextLine();
		
		System.out.println("\n���ϱ� ���: " +(number1+number2));
		System.out.println("���� ���: "+ (number1-number2));
		System.out.println("���ϱ� ���: "+ (number1*number2));
		System.out.println("������ �� ���: "+ (number1/number2));
 	}
	
}
