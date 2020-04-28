package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap { // �ߺ�����

	public void example1() {
		
		// int�� �迭 arr�� �����Ͽ� 5ĭ �Ҵ� ��
		// �� �ε����� ���� �Է¹޾� ����.
		// ��, �ߺ��Ǵ� ���� �������� ����.
		// (�ߺ��� �Է� �� "�ߺ��� ����" ���)
		
		int arr[] = new int[5];
		Scanner sc = new Scanner (System.in);
		
		for (int i=0; i<arr.length; i++) {											// 5�� ���������� �Է¹��� �Ŵϱ� for�� ����
			System.out.print(i+"��° �ε��� ��: ");
			arr[i] = sc.nextInt();
			sc.nextLine();
		
			// �� �ߺ� �˻�
			for(int j=0; j<i; j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println("�ߺ��� ����");
					i--; // �ٱ��� for�� ���� ���� ������Ű�� ��ġ
					break;
				}
				
			} // ���� for end
						
		} // �ٱ� for end
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void example2 () {
		// �ζ� ��ȣ ������					
		// - �ζ� ��ȣ�� ����: 1 ~ 45 		-> ����(Math.random())
		// - ��ȣ ���� ����: 6�� 			    -> int�� �迭 6ĭ �Ҵ�	
		// - �� �� Ư¡: �ߺ� ��ȣ ���� X			-> ���� ��� �ߺ����� ������� ����
		// - �������� ����					
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			// 1~45 ������ �߻����� ����: Math.random()�ʿ�
			double ran = Math.random() *45+1;
			// 0 <= ran < 1
			// 0.xxx <= ran < 45.xxx
			// 1.xxx <= ran < 46.xxx 
			// 1 <= (int)ran < 46
			
			lotto[i] = (int)ran;
			
			// �ߺ� �˻�
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					// ���� ���� �迭�� �����ϴ� ���
					i--; // ���� ���� �ݺ�
					break;
					
				} 
				
			} // �ٱ��� for end
		}	
			// �������� ���� 
			/*for(int i=1; i<lotto.length; i++ ) {
				for (int j=0; j<i; j++) {
					if (lotto[i] < lotto[j]) {
						int tmp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = tmp;
					}
				}
			}*/						// �̰� �������� ���� ���Ű�
			
			Arrays.sort(lotto);		// �̰� �������� �ѹ濡 �����°Ű�
			
			System.out.println("������ �ζ� ��ȣ: " + Arrays.toString(lotto));
			
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
