package com.kh.exception.chap01.model.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionService {

	public void example1() {
		// Unchecked Exception 
		// ������ ���� ó���� ���� �ʾƵ� �Ǵ� ���� (Exception)
		// �ַ� ���α׷����� �����Ƿ� ���� ������ ��찡 ���� ������ ���� ó�� �ڵ� ���� if������ �̿��Ͽ� �ڵ带 �����ϴ� ��찡 ����
		
		// �� ���ڸ� �Է¹޾� �������ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� 1: ");
		int num1 = sc.nextInt(); sc.nextLine();
		
		System.out.print("�Է� 2: ");
		int num2 = sc.nextInt(); sc.nextLine();
		
		if (num2!=0) { 		
			System.out.print(num1 + "/" + num2 + "=" + num1/num2);
		} else {
			System.out.println("0���� ���� ���� �����ϴ�. ");
		}
		
		// java.lang.ArithmeticException: / by zero
		// ��� ���� �� 0���� ������ ���� ��Ȳ�� �߻� --> �� ������ ���� �� ��ó�� if������ �������� �ʰ� ó���� �����ϴ�
			
	}
	
	public void example2() {
		
		String[] arr= {"��������", "����", null, "������"};
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] != null ) {
			System.out.println(arr[i].length()); 
			}
		}
		
		// java.lang.NullPointerException 
		// Null: �ƹ��͵� �����ϰ� ���� �ʴ�. (�ƹ��͵� �����ϰ� ���� ������ �ű� �ִ� ����� �����Ϸ��� �ϴ� �翬�� ���� �߻�)
		// ����� ���� Null�� ���������� �̿��Ͽ� ��ü ��� ���� �� �߻��ϴ� ����
		// --> ���� ������ó�� if������ ó�� �����ϴ�
		
		// ���� 37��° ���� i<=arr.length;�� �ٲٸ� : java.lang.ArrayIndexOutOfBoundsException
		// �迭�� �ε��� ������ �Ѿ�� ������ �� �߻��ϴ� ����
		// --> ���� ������ó�� if������ ó�� �����ϴ�
		 
	}
	
	public void example3() {
		// Checked Exception
		// �ݵ�� ���� ó���� �ؾ��ϴ� ����(Exception) 
		// �ַ� IO(�����) ��Ȳ���� ���� �߻���
		
		// Scanner �߻� ����(1.5���� ����)������ �Է� ��� �����غ���
		BufferedReader br 
		= new BufferedReader(new InputStreamReader (System.in));
		// Scanner(jdk 1.5) ������ ���Ǵ� Ű���� �Է� ���
		
		System.out.println("�Է�: ");
//		String str = br.readLine();
		// Unhandled Exception type IOExceptiopn == IOException ���� ó���� �ȵǾ� �ִ�.
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
