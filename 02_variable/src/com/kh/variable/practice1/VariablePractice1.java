package com.kh.variable.practice1;

public class VariablePractice1 {

	public void method1() {
		
		java.util.Scanner method1 = new java.util.Scanner(System.in);
	
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = method1.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��): ");
		char gender = method1.nextLine().charAt(0);
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age = method1.nextInt();
		
		method1.nextLine();
		
		System.out.print("Ű�� �Է��ϼ���(cm): ");
		double height = method1.nextDouble();
		
		method1.nextLine();
	
		System.out.printf("\nŰ %.1fcm�� %d�� %c�� %s�� �ݰ����ϴ�^^", height, age, gender, name);
		
		
				
		
		
		
		
		
	}
}
