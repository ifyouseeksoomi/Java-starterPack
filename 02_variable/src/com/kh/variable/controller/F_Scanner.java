package com.kh.variable.controller;

import java.util.Scanner;

public class F_Scanner {
	
// Ű����� �̸��� �Է¹޾� "�������� ȯ���մϴ�." ��� ���ڿ� ���·� ����ϱ�
	public void scannerEx1() {
		Scanner sc = new Scanner(System.in);
		// Scanner�� Java���� �Է��� ���� �� �� �ֵ��� �������ִ� Ŭ������ java.util ��Ű���� ���ԵǾ��ִ�.
	
		System.out.print("����� �̸��� �����Դϱ�?  ");
		
		String name = sc.nextLine();
		
		System.out.println(name + "�� ȯ���մϴ�.");
		
	}



// �̸�, ����, ������ �Է¹޾� "���������� ������, �����Դϴ�." ���·� ����ϱ�
    public void scannerEx2() {
	
	java.util.Scanner sc = new java.util.Scanner(System.in);
	// -> import ������ �ۼ����� �ʰ� �ٸ� Ŭ������ ������ ���
	
	System.out.print("�̸�: ");
	String name = sc.nextLine();
	// sc.nextLine() : Ű����� �Էµ� �� ���� ���ڿ��� (�Է¹��ۿ���)�о��.
	// -> ����(\n)���� �����ؼ� �о��.
	
	System.out.print("����: ");
	int age = sc.nextInt(); // ���̴� nextline �� �� ����. nextline�� ���ڿ����� ���� �Ŷ�.
	// sc.nextInt(): Ű����� �Էµ� ���� ���� �о��.
	// -> �Է¹��ۿ��� ����, ����, �ٹٲ� ���������� �о��.
	
	sc.nextLine(); // �Է� ���ۿ� �ִ� �ٹٲ޹���(\n) ���� �뵵
	
	System.out.print("����(��/��): ");	
	char gender = sc.nextLine().charAt(0); // sc.nextLine()�� �ѱ��ڸ� �������Ⱑ ������� �ڿ� .charAt(0)�� ��
	// charAt(index) : ���ڿ����� index��° ���� �ϳ��� ����.
	// ����� index�� 0���� �����ϴ� ���� ����~!
	
	System.out.print("Ű(cm) : ");
	double height = sc.nextDouble();
	sc.nextLine(); // �Է� ���ۿ��� �ٹٲ�(����) ���� ����(���ϱ� �̻����� �׳� �����ϸ� ���°� ���� sc.nextLine ���� �ʴ� �̻�)
	
	
	System.out.printf("%s���� %d��, %c��, Ű %.1fcm�Դϴ�. \n",name, age, gender, height);
	
	
	
	

}

}
	

