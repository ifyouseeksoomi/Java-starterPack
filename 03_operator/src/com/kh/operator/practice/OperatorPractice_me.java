package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice_me {

	public void practice1() {
		
		System.out.println("������ �ϳ� �Է��ϼ���. ");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		sc.nextLine();
		
		String result1 = (input1>0) ? ("����Դϴ�.") : ("����� �ƴմϴ�.");
		System.out.println(result1);
		
	}
	
	public void practice2() {
		
		System.out.println("������ �ϳ� �Է��ϼ���. ");
		Scanner sc = new Scanner(System.in);
		int input2 = sc.nextInt();
		sc.nextLine();
		
		String result2 = (input2>0) ? ("����Դϴ�.") : ((input2==0) ? ("0�Դϴ�.") : ("�����Դϴ�."));
		System.out.println(result2);
		
	}
	
	public void practice3() {
		System.out.println("������ �ϳ� �Է��ϼ���. ");
		Scanner sc = new Scanner(System.in);
		int input3 = sc.nextInt();
		sc.nextLine();
		
		String result3 = ((input3%2==0) ? ("¦���Դϴ�. ") : ("Ȧ���Դϴ�. "));
		System.out.println(result3);
		
	}
	
	public void practice4() {
		System.out.println("�ο����� �Է��ϼ���. ");
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("���� ������ �Է��ϼ���. ");
		int candies = sc.nextInt();
		sc.nextLine();
		
		System.out.println("\n1�δ� ���� ����: "+ (candies/people));
		System.out.println("���� ���� ����: "+ (candies%people));
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸�: ");
		String name = sc.nextLine();
		
		System.out.println("�г�(���ڸ�): ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("��(���ڸ�): ");
		int classnum = sc.nextInt();
		sc.nextLine();

		System.out.println("��ȣ(���ڸ�): ");
		int privatenum = sc.nextInt();
		sc.nextLine();
		
		System.out.println("����(F/M): ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("����(�Ҽ��� �Ʒ� ��°�ڸ�����): ");
		double point = sc.nextDouble();
		
		gender = (gender=='M') ? '��' : '��' ; // ���� ������ �ƴ϶� ��Ȱ���� ���� ������ �׳� �Ѵ�. (������ ����Ѵ�.)
		
		System.out.println(grade + "�г� " + classnum + "�� " + privatenum + "�� " 
		+ name + " " + gender + "�л��� ������ " + point + "�̴�.");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}

