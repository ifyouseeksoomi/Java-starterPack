package com.kh.operator.service;

public class F_Compound {
	// ���� ���� ������
	// - �ٸ� �����ڿ� ���� �����ڸ� �Բ� ����ϴ� ������
	// - �ڱ� �ڽŰ� ���� �� ����� �ٽ� �ڱ� �ڽſ��� ����
	// - ��ȣ�� � ��쿡�� �� �����ʿ� ���� ���� ���� ����
	
	// ex)
	// int a = 10;
	// a += 10; (�� ���� �ᱹ a = a+10 �� ���� ����ó�� but ������ ���°� �ӵ��� �� ������)
	// a = 20;
	
	// * ���� ���� ������ ����ó�� �ӵ��� �ξ� �����Ƿ� ��� ����.
	
	public void example1 () {
		int num = 12;
		
		// ex) num�� 3 ���� ��Ű��
		num += 3;
		System.out.println("num 3 ����: " + num);
		
		// num�� 5 ���� ��Ű��
		num -= 5;
		System.out.println("num 5����: " + num);
		
		// num�� 6�� ���� ��Ű��
		num *= 6;
		System.out.println("num 6�� ����: " + num);
				
		// num�� 1/2�� ���� ��Ű��
		num /= 2;
		System.out.println("num 1/2�� ����: " + num);
		
		// num�� 4�� ������ �� ������
		num %= 4;
		System.out.println("num 4�� ������ �� ������: " + num);
	}
	
}
