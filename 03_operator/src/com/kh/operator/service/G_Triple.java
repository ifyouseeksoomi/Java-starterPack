package com.kh.operator.service;

import java.util.Scanner;

public class G_Triple {
	// ���� ������
	// (���ǽ�) ? ��1 : ��2;
	// - ���ǽ��� true�� ��� ��1 ����, ���ǽ��� false�� ��� ��2 ����
	// - ���ǽ��� ����� �ݵ�� true �Ǵ� false
	// --> ��/�� ������ ����� ��κ�
	
	public void example1( ) {
		// ������ �Է¹޾� ������� �ƴ��� �˻��ϱ�
		// ����: ���� == ��������, ��������, 0
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		// ���� ���ǿ� ���� ���׿����� �ۼ��غ���
		// 				        ���ǽ�            ?     ��1	    :	        ��2
		String result = (input > 0)  ? ("����Դϴ�.") : ("����� �ƴմϴ�.");
		
		System.out.println(input + "��/�� " + result); 
	}

	public void example2( ) {
		// ������ �Է¹޾� ������� 0���� �������� �˻��ϱ�
		// ������ ���� �����ڰ� "��ø ���"�Ǿ�� �Ѵ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		// ���� ���ǿ� ���� ���׿����� �ۼ��غ��� (��2���� ���ο� ���ǽ��� ���� ����)
		// 				        ���ǽ�            ?     ��1	    :	                       ��2
		String result = (input > 0)  ? ("����Դϴ�.") : ((input < 0) ? "�����̴�." : "0�̴�.");
													
		System.out.println(input + "��/�� " + result); 
		
		
		
		
		
		
		
		
		
		
		
	}
}
