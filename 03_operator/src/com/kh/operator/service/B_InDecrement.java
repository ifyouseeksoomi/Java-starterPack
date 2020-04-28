package com.kh.operator.service;

public class B_InDecrement {
	
	// ���� ������
	// - �ǿ����ڸ� 1 ���� �Ǵ� ���� ��Ű�� ������
	// -> ������: ������ ���ϴ� �� �Ǵ� ����
	
	// ++ (1����), -- (1����)
	
	// ���� ������: ���� ���� ���� ���� �� �ٸ� ���� ����, ���� ������ : �ٸ� ���� ���� �� ���� ���� ����
	
	public void example1() {
		// ���� ���� ������ �׽�Ʈ
		int num =10;
		System.out.println("���� �� �������� ���� ��: " + num); // num=10 
		System.out.println("++num 1ȸ ���� ��: " + (++num)); // num=11
		System.out.println("++num 2ȸ ���� ��: " + (++num)); // num=12
		System.out.println("++num 3ȸ ���� ��: " + (++num)); // num=13
		System.out.println("++num 4ȸ ���� ��: " + (++num)); // num=14
		System.out.println("++num 5ȸ ���� ��: " + (++num)); // num=15
		System.out.println("���� ���� ������ ���� ��: "+ num); // �� ������ ���� num=15
		
		// ��輱 ���
		System.out.println("\n-----------------------------\n");
		
		// ���� ���������� �׽�Ʈ (��)
		int num2 = 10;
		System.out.println("���� ���� ������ ���� ��: " + num2); // num2=10
		System.out.println("num2-- 1ȸ ���� ��: " + (num2--)); // ���: 10, num2=9
		// �� ���� ��°��� num2�� �� �� �� �Ű�����. ��� ��ü�� 10���� ���� ���̴� ���� ������ ������ �Ŀ� --�� ������. 
		// �׷��� ��� ��±��� ���� �� ""������ ����� ��""�� num2=9�� �ȴ�.
		System.out.println("num2-- 2ȸ ���� ��: " + (num2--)); // ���: 9, num2=8
		System.out.println("num2-- 3ȸ ���� ��: " + (num2--)); // ���: 8, num2=7
		System.out.println("num2-- 4ȸ ���� ��: " + (num2--)); // ���: 7, num2=6
		System.out.println("num2-- 5ȸ ���� ��: " + (num2--)); // ���: 6, num2=5
		System.out.println("���� ���� ������ ���� ��: " + num2); // ���: 5, num2=5
	}
	
	public void example2( ) {
		int num1 = 20;
		int result = num1++ *3;
		
		System.out.println("num1: " + num1); // num1: 21
		System.out.println("result: " + result); // result: 60
		
		System.out.println("\n-----------------------------\n");
	}
		
	public void example3( ) {
		int a=10;
		int b=20;
		int c=30;
		
		int result1= a++ ; 
		// result1=10, �� ���Ŀ� a�� 1�����ؼ� a=11, b=20, c=30
		
		int result2= (++a) + (b++) ;
		//			   12  +   20
		// a=12(�̹����� �����ϱ�), b=21(���������̴ϱ� ���� result2 �� ���� �����ߴ�), result2=32, c=30
		
		int result3= (a++) + (--b) + (--c) ;
		// 			   12  +   20  +   29
		// a=13 , b=20, c=29, result3=61
		
		System.out.println("a: " + a); // 13
		System.out.println("b: " + b); // 20
		System.out.println("c: " + c); // 29
		System.out.println("result1: " + result1); // 10
		System.out.println("result2: " + result2); // 32
		System.out.println("result3: " + result3); // 61
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


