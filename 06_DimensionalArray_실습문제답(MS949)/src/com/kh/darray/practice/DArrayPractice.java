package com.kh.darray.practice;

import java.util.Scanner;

public class DArrayPractice {
	
	/* �ǽ����� 1
	3�� 3��¥�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
	�ε��� 0�� 0������ 2�� 2������ ���ʴ�� �����Ͽ� ��(0, 0)���� ���� �������� ���� �� ����ϼ���.
	ex.
	(0, 0)(0, 1)(0, 2)
	(1, 0)(1, 1)(1, 2)
	(2, 0)(2, 1)(2, 2)

	 */
	public void practice1() {
		String[][] arr = new String[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	
	/* �ǽ����� 2
	4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
	1) 1 ~ 16���� ���� ���ʴ�� �����ϼ���.
	2) ����� ������ ���ʴ�� ����ϼ���.

	ex.
	 1  2  3  4 
	 5  6  7  8 
	 9 10 11 12 
	13 14 15 16 
	 */
	public void practice2() {
		int[][] arr = new int[4][4];
		
		int value = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	/* �ǽ����� 3
	4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
	1) 16 ~ 1�� ���� ���� �Ųٷ� �����ϼ���.
	2) ����� ������ ���ʴ�� ����ϼ���.

	ex.
	16 15 14 13 
	12 11 10  9 
	 8  7  6  5 
	 4  3  2  1 
	 */
	public void practice3() {
		int[][] arr = new int[4][4];
		
		int value = 16;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value--;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	/* �ǽ����� 4
	4�� 4�� 2���� �迭�� �����Ͽ� 0�� 0������ 2�� 2�������� 1~10������ ������ ���� �� ���� ��
	�Ʒ��� ����ó�� ó���ϼ���.
	 */
	public void practice4() {
		int[][] arr = new int[4][4];
		
		int rowLastIndex = arr.length-1; // ���� ������ �ε���
		int colLastIndex = arr[0].length-1; // ���� ������ �ε���
		
		for(int i=0; i<rowLastIndex; i++) {
			for(int j=0; j<colLastIndex; j++) {
				// 1 ~ 10 ���� ������ �߻����� 2���� �迭�� ����.
				arr[i][j] = (int)(Math.random() * 10 + 1);
				
				// ���� ���԰� ���ÿ� �ش� ��, �� ���� ���� ����
				arr[i][3] += arr[i][j]; // ���� �� 						(?��?)
				arr[3][j] += arr[i][j]; // ���� �� 						(?��?)
			}
		}
		
		// 2���� �迭 ��� + ���� ���
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
				
				// 2���� �迭�� �ݺ� ���� �� 
				// ������ �� �Ǵ� ������ ���� ������ ���
				// ���� ���� ����
				if(i == rowLastIndex || j == colLastIndex) {
					arr[rowLastIndex][colLastIndex] += arr[i][j];
					
					// ������ arr[3][3]���� �� ���� ������ ����Ǿ� 
					// ������ �Ѵ� ����  arr[3][3] ����ǰ�����,
					// ������ ���� ������ �̹� ������ ����Ͽ��� ������ ���� ����.
				}
			}
			System.out.println(); // �ٹٲ�
		}
	}
	
	
	/* �ǽ����� 5
	2���� �迭�� ��� ���� ũ�⸦ ����ڿ��� ���� �Է¹޵�, 1~10���� ���ڰ� �ƴϸ�
	���ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.�� ��� �� �ٽ� ������ �ް� �ϼ���.
	ũ�Ⱑ ������ ������ �迭 �ȿ��� ���� �빮�ڰ� �������� ���� �� �� ����ϼ���.
	(char���� ���ڸ� ���ؼ� ���ڸ� ǥ���� �� �ְ� 65�� A�� ��Ÿ��, ���ĺ��� �� 26����) 

	ex.
	�� ũ�� : 5
	�� ũ�� : 4
	T P M B 
	U I H S 
	Q M B H 
	H B I X 
	G F X I 
	 */
	public void practice5() {
		
			Scanner sc = new Scanner(System.in);
			
			
			while(true) {
				System.out.print("�� ũ�� : ");
				int row = sc.nextInt();
				System.out.print("�� ũ�� : ");
				int col = sc.nextInt();
				
				if((row < 1 && row >10) || (col < 1 && col > 10)) {
					System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
					
				}else{
					char[][] arr = new char[row][col];
					
					for(int i=0; i<arr.length; i++) {
						for(int j=0; j<arr[i].length; j++) {
							arr[i][j] = (char)((int)(Math.random() * 26 + 65));
						}
					}
					
					for(int i=0; i<arr.length; i++) {
						for(int j=0; j<arr[i].length; j++) {
							System.out.print(arr[i][j] + " ");
						}
						System.out.println();
					}
					
					break;
				}
				
			}
		}
		
	
	
	/*  �ǽ����� 6
	���� �ʱ�ȭ�Ǿ� �ִ� �迭�� ������ �Ʒ��� ��[�׸�] �ǽ�����6 �帧���� ���� ������� ����ϼ���.
	��, print()�� ����ϰ� �� ���̿� ����(�� ��)�� �����ϵ��� ����ϼ���.
	 */
	public void practice6() {
		String[][] arr = {
							{"��", "��", "��", "��", "��"}, 
							{"��", "��", "��", "��", "��"}, 
							{"��", "��", "��", "��", "��"}, 
							{"��", "��", "��", "��", "��"},
							{"��", "��", "!", "��", "!!"}
						 };
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			
		}
	}
	
	
	/* �ǽ����� 7
	����ڿ��� ���� ũ�⸦ �Է� �ް� �� ����ŭ�� �ݺ��� ���� ���� ũ�⵵ �޾� 
	������ ���� �迭�� ���� �� �Ҵ��ϼ���.
	�׸��� �� �ε����� ��a������ �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.

	ex.
	���� ũ�� : 4
	0���� ũ�� : 2
	1���� ũ�� : 6
	2���� ũ�� : 3
	3���� ũ�� : 5
	a b 
	c d e f g h 
	i j k 
	l m n o p 
	 */
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ũ�� : ");
		int row = sc.nextInt();
		
		char[][] arr = new char[row][];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "�� ũ�� : ");
			int col = sc.nextInt();
			
			arr[i] = new char[col];
		}
		
		// �� �ʱ�ȭ
		char value = 'a';
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		// ���
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
