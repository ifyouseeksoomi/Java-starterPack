package com.kh.control.chap03.service;

import java.util.Scanner;

public class A_Break {

	public void example1() {
		
		// 1~10���� ��� (for�� ����ϳ� ���ǽ� ����ϸ� �ȵ�)
		
		for (int i=1;  ; i++) {
			// for���� ���ǽ��� ���� �ݺ����� ����Ǵ� ������ �� �� ����.
			// --> ���ѷ��� ���� �� ������ ����
			
			if (i>10) {
				
				break;
				
			} System.out.println(i);
		} 
		
	}

	public void example2() {
		// ���ڿ��� �Է¹޾� ����ϱ�. �� exit �Է� �� ����
		
		Scanner sc = new Scanner(System.in);
		
		String str = null; 					// �ԷµǴ� ���ڿ��� ������ ���� ����
		
		while (true) { 						// while�� ������ ���ѹݺ� ��Ű�� (�������� �ʴ� �̻� �Ȳ���.)
											// () ���� ���ǽ��� true�� ��� ����ȴٴ� while���� Ư¡�� �̿��� ������, true��� ���� �׳� ����� ����.
						
			System.out.println("�Է�: ");
			str = sc.nextLine();
			System.out.println("str: " + str);
			
			if(str.equals("exit")) {
				
				break;
			
			}
		}
		
	}



}


