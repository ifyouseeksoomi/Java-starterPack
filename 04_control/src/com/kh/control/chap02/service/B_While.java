package com.kh.control.chap02.service;

import java.util.Scanner;

public class B_While {
	// while�� :
	// for���� �޸� �ݺ� Ƚ���� ������ ���� �ʰ�
	// Ư�� ������ false�� �� ������ �ݺ��ϴ� �뵵�� ���Ǵ� �ݺ���
	
	/* [ǥ����]
	 * 
	 * [�ʱ��]
	 * while (���ǽ�) { 
	 * 		����� ����;
	 * 		[������ or �б⹮]
	 * } 
	 * 
	 * [���� ����]
	 *    1) ���ǽ� Ȯ�� -> ���ǽ��� true�̸� while ���� �ڵ� ����
	 * -> 2) while�� ó������ ���ư� ���ǽ� Ȯ�� -> (�ݺ�)
	 * -> 3) �̷��ٰ� ���ǽ��� false�� �Ǹ� while���� ���� ����
	 * 
	 */
	
	public void example1() {
		// 1~5���� ��� (while)
		
		int i = 1; 						// �ʱ��
		while(i<=5) {					// ���ǽ�
			System.out.println(i);		// ����� ����
			i++; 						// ������
		}
	}
	
	public void example2() {
		// 10~1���� ��� (while)
		
		int i=10;
		
		while (i>0) {					// "i=0�� �������� ���߰ڴ�" ��� ��
			System.out.println(i);
			i--;
		}
		
	}
		
	public void example3() {
		// �ԷµǴ� ��� ���� �� (0 �Է� �� ����) << �ܼ��� 0�� �ԷµǸ� �����°����� �� �� �ݺ��ϰڴٴ� Ƚ���� ������ ���� ����. �̷� �� ���� ���� while��.
		
		Scanner sc = new Scanner(System.in);
			
		int sum =0; 			// �հ踦 �����ϱ� ���� ���� ���� �� 0���� �ʱ�ȭ
		
		//1) int input = -1;			// ������ ���ο� �ԷµǴ� ���� �����ϱ� ���� ���� ���� �� �ʱ�ȭ
										// 0���� �ʱ�ȭ�ϴ� ������ 0�� int���� �⺻ ���̶� �׷� �ͻ�. 
										// �ٵ� ���ڱ� -1�� �ʱ�ȭ ���� �ٲ� ������ �Ʒ����� while�� �� �ƿ� �ȵ��ư��Űŵ� (while �ʱ���� input!=0�̶�� ���� ��쿡 ����)
										// �׷����� �ұ��ϰ� int input�� 0���� �ʱ�ȭ�ϰ� ���ư��� ����� �Ʒ� ������ boolean���.
		
		int input = 0;
		boolean flag = true;	// while�� �ݺ� ����� ����
		
		while(flag) {
			System.out.print("�Է�: ");
			input = sc.nextInt();
			sc.nextLine();
			
			if (input == 0) { 	// �Էµ� ���� 0�� ���, �����ϴ� ���� �⺻ ��Ģ��! �׷� ��� ����?
								// --> while���� ���ǽ��� false�� �ٲٸ� �ȴ�
								// --> �� ���� flag������ false�� ��ȯ��Ű�� �ȴٴ� ��
				flag = false;
				
			} else {
				
				sum += input;
			}
				
			
		}
		
		System.out.println("�հ�: "+ sum);
		
	}
	
	public void example4() {
		// ��ø while�� 
		// �ԷµǴ� ����ŭ�� ���μ��� ������ *�� ä���� �簢�� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �Է�: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		int i=0; 							// �ʱ��
		while(i < input) { 					// ��(����) ���ǽ�
			
			int j=0;						// �ʱ��2
			while(j < input) { 				// ��(����) ���ǽ�
				System.out.print("*");
				j++; 						// ������2
			}
			
			System.out.println(); 			// �ٹٲޱ��
		
			i++;
		}
		
		// while���� ��ø�ؼ� ����ϴ� ���� �������� �ʴ´�.
		// ���� �� ����ؾ��� ����� ���� ������ ��Ȯ�ϰ� �� ��.
		
	} 
		
	public void example5() {
		// Ű����� ���ڿ��� �Է¹޾� �״�� ����ϱ� �ݺ�
		// ��, "exit" �Է� �� ����
		
		Scanner sc = new Scanner(System.in);
		String str = null; 						
		// null�̶� ������ ������ �⺻������ '�����ϰ� �ִ� ���� ����'��. "��� �ִ�"�ʹ� �ٸ�.
		
		// String str2 = "";				 // �� ���ڿ� (����): ��½� �ƹ��͵� ����� X
		
		do { 								 // �ݺ����� ���� �ѹ��� ������ �����ϰڴٴ� �ǹ�
			System.out.print("���ڿ��� �Է��ϼ���. ");
			str= sc.nextLine();
			
			System.out.println("str: " + str);
			
		} while (!str.equals("exit"));		 // 
		
	}	
		
	public void example6() {
		// ���ῡ �ش��ϴ� ��ȣ�� �ԷµǱ� ������ ������ �ݺ��Ǵ� �޴� �����
		
		Scanner sc = new Scanner(System.in);
		
		int menu=0; // �Է¹޴� ��ȣ�� ������ ���� ���� �� �ʱ�ȭ
		
		do {
			
			System.out.println("====================================");
			System.out.println("1.1�� ���");
			System.out.println("2.2�� ���");
			System.out.println("3.3�� ���");
			System.out.println("0. ���α׷� ����");
			System.out.println("====================================");
			
			System.out.print("\n�޴� ���� >> ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) { 
			case 1: System.out.println("1�� ��� ����"); break;
			case 2: System.out.println("2�� ��� ����"); break;
			case 3: System.out.println("3�� ��� ����"); break;
			case 0: System.out.println("���α׷��� �����մϴ�. "); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); 
			}
			
		} while(menu!=0); 
		
	}
		
}