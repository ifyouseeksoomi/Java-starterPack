package com.kh.operator.service;

import java.util.Scanner;

public class C_Arithmetic {

	// ��� ������
	// ���� ��Ģ���꿡 %(modulars, mod)�� �߰���.
	// ������(/) ���� �� �ڷ����� ����
	
	// �� ������ �Է¹޾� +, -, *, /, % ��� ���
	public void example1 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ����: ");
		int num1 = sc.nextInt();
		sc.nextLine();
			
		System.out.print("�ι�° ����: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("num1+num2= " + (num1+num2));
		System.out.println("num1-num2= " + (num1-num2)); 
		System.out.println("num1*num2= " + (num1*num2)); 
		System.out.println("num1/num2= " + (num1/num2)); 
		System.out.println("num1%num2= " + (num1%num2)); 
		
	}
}
