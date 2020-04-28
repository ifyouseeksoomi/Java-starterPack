package com.kh.darray.service;

import java.util.Arrays;
import java.util.Scanner;

public class DArray {

	// 2���� �迭: �������迭 �������� �ϳ��� ���� �� 
	
	public void example1 () {
		
		// 2���� �迭 ���� (�Ʒ� ������ � ��ĵ� ��� ok)
		int[][] arr1;
		int arr2[][];
		int[] arr3[];
		
		// [] --> �迭 1������ �ǹ���
		// 2���� �迭 �Ҵ�
		// �迭�� = new �ڷ��� [��ũ��] [��ũ��];
		
		arr1 = new int[3][5];	// 3�� 5�� 2���� �迭
		
		// 1���� �迭�� ���� == �迭��.length
		System.out.println("���� ����(���� ����): " + arr1.length);
		System.out.println("���� ����(���� ����): " + arr1[0].length);
		
		// 3�� 5���� ��� 5�� �ʱ�ȭ
		// (2���� �迭 ����ϹǷ� �������� ��� �ʿ�)
		
		// �� �ݺ� ����
		for (int i=0; i<arr1.length; i++) {
			
			// �� �ݺ� ����
			for (int j=0; j<arr1[i].length; j++) {
				
				// 2���� �迭 arr1�� ��� ���� 5�� �־����(i�� j���� ���� 5�� �ʱ�ȭ)
				arr1[i][j] = 5;
				
			}
		}
		
		// ������ �迭 ��¿� ����
		for(int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			
			// �� �� ����� ���� ������ �ٹٲ�
			System.out.println();	
		}
	}
	
	public void example2() {
		// 4�� 4�� int�� 2���� �迭�� ���� �� �Ҵ��ϰ�
		// �� �ε����� ������� 1~16������ �����ϰ� ���
		
		int arr[][] = new int[4][4];
		
		int value =1; // 1~16 �����ϴ� ���� (�ε����� 1~16���� �־����ϱ�. �ٵ� �� ���� ���� �ϸ� ���뽺����)
		
		// �� ����
		for (int i=0; i<arr.length; i++) {
	
			// �� ����
			for (int j=0; j<arr[i].length; j++) {
				
				arr[i][j] = value++; // ������������ ǥ���ؾ������� 1���� ���۵� �� �ִ�.
				// �ε����� ���� value ���� �� value 1 ����
				
				// �������ڸ��� ��µ� ���ÿ� ����
				System.out.printf("%3d", arr[i][j]); // %3d�� �ǹ̴� �� ĭ�� ������ �� ������ ����
				
			} // ���� for end
			
			// ��� �� �� ������ ���� �ٹٲ�
			System.out.println();
						
		} // �ٱ��� for end
	
	}
	
	public void example3() {
		// 2���� �迭 ����, �Ҵ�, �ʱ�ȭ ���� ����
		// 1 2 3
		// 4 5 6
		// 7 8 9
		// ���� ���� �� �迭 ����� ���� (3�� 3��)
		
		int[][] arr = {
						{1, 2, 3}, 	
						{4, 5, 6}, 
						{7, 8, 9}
					  };
		
	
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			
			} System.out.println();
		}		
	}
	
	public void example4() {
		// ���� �迭
		// ���� ������ ������������ ���� ������ �������� ���� 2���� �迭
		
		int[][] arr = new int [3][];
		// ���� �迭 �ุ �Ҵ�
		
		arr[0] = new int[2]; 
		arr[1] = new int[4];
		arr[2] = new int[3];
		
		// �� ĭ�� 1~9���� �� ����
		int value =1; // ���Կ� ����
		
		// ���� ũ��� �����Ǿ� �����Ƿ� �Ϲ������� �����ϸ� �ȴ�
		for (int i=0; i<arr.length; i++) {
			
			//
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j]= value++;
				
				System.out.print(arr[i][j]+" ");
			} // ���� for end
				
			System.out.println();
			
		} // �ٱ��� for end
	}
	
	public void example5() {
		// �����迭 ����, �Ҵ�� ���ÿ� �ʱ�ȭ
		int[][] arr = {
						{1, 2},
						{3},
						{4, 5, 6, 7}
		              };
		
		
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			} 
			System.out.println();
		}
		
	}
	
	public void example6_ex() {
		/*
		1�� �л��� ����
		���� ���� �Է� : 50
		���� ���� �Է� : 60
		���� ���� �Է� : 70
		�հ� : 180
		��� : 60
		
		2�� �л��� ����
		���� ���� �Է� : 70
		���� ���� �Է� : 80
		���� ���� �Է� : 90
		�հ� : 240
		��� : 80
		
		���� ��� ���� : 60
		���� ��� ���� : 70
		���� ��� ���� : 80

		*/
		
		Scanner sc = new Scanner (System.in);
		
		int[][] arr = new int[2][3];
		
		// �� ����(�л� ����)
		for (int i=0; i<arr.length; i++) {
			System.out.println( (i+1) + "�� �л��� ����: ");
			
			 int sum = 0; // �հ� ����� ���� (����, �Ҵ�, �ʱ�ȭ �� ��)
			
			// �� ���� (���� ����)
			for (int j=0; j<arr[i].length; j++) {
				String subject =null; 	// ���� ������ ����
				
				switch(j) {
				
				case 0: subject = "����"; break; 
				case 1: subject = "����"; break; 
				case 2: subject = "����"; break; 
				
				}
					
				System.out.print(subject + " ���� �Է�: ");
				
				// �� �ε����� ���� ġ�� ������� ����Ǵ�
				arr[i][j] = sc.nextInt();
				sc.nextLine();
				
				sum += arr[i][j]; // �հ� ����

			} // ���� for end
			
			System.out.println("�հ�: " + sum);
			System.out.println("���: " + sum/arr[i].length);
			System.out.println();
			
		} // �ٱ��� for end
		
		// ����(��) ���� for��
		for(int j=0; j<arr[0].length; j++) {
			String subject = null;
			
			switch (j) {
			case 0: subject = "����"; break;
			case 1: subject = "����"; break;
			case 2: subject = "����"; break;
			}
			
			// �� ���� ���� �հ� ������ ���� ���� ����
			int sum = 0;
			
			// �л�(��) ������ for��
			for(int i=0; i<arr.length; i++) {
				sum += arr[i][j];
			}
			
			System.out.println(subject + " ��� ����: " + sum/arr.length);
		}
	}
	
	public void example7 () {
		// 3�� 3�� ������ 2���� �迭��
		// 1~9 ������ �ߺ� ���� �����ϱ�
	
		// 1) 1���� �迭�� 1~9���� ���� �ߺ� ���� ���� (���� ��� + �ߺ� ���� ��� �� �� �ʿ�)
		
		int arr[] = new int[9];
		
		/* 
		double ran = Math.random();
		int r= (int)(ran*9 +1);				

		for (int i=0; i<arr.length; i++) {
			arr[i] = r;
		} 
		*/
		
		for (int i=0; i<arr.length; i++) {
			// 1~9 ���� �߻�
			arr[i] = (int)(Math.random() * 9 + 1);
			
			// �ߺ� �˻�
			for (int j=0; j<i; j++) {
				 if (arr[i] == arr[j]) {
					 i--;
					 break;
				 } 
			}
		}
		
		System.out.println(Arrays.toString(arr));
		 
		
		// 2) �̹� ���� �߻��� �ߺ� �˻簡 ��� ���� 1���� �迭�� ������
		//    2���� �迭�� (3X3����) ����� ����
		
		// �� ����� 2���� ����, �Ҵ�
		int[][] newArr = new int[3][3];
		
		// 1���� �迭 �ε��� ������ ����
		int index = 0;
		
		for(int i=0; i<newArr.length; i++) {
			for (int j=0; j<newArr[i].length; j++) {
			
				newArr[i][j] = arr[index++]; // index++ �ݵ�� ������������ �� ��
			
				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}
				
	}
	
	 
	
}
