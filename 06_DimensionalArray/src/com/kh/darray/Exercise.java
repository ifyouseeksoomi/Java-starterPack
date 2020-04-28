package com.kh.darray;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {

	public void exercise1 () {
		
		// 3�� 3��¥�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
		// �ε��� 0�� 0������ 2�� 2������ ���ʴ�� �����Ͽ� 
		// ��(0, 0)���� ���� �������� ���� �� ����ϼ���.
		
		String arr[][] = new String [3][3];
		
	
		for (int i=0; i<arr.length; i++) {		
			
			for (int j=0; j<arr[i].length; j++) {	
							
				arr[i][j]= (String) ("(" + i + ", " + j + ")");	
				System.out.print(arr[i][j]);
			} 					
		
		System.out.println();
		}
	}
	
	public void exercise2 () {
		// 4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
		// 1) 1 ~ 16���� ���� ���ʴ�� �����ϼ���.
		// 2) ����� ������ ���ʴ�� ����ϼ���
		
		int arr[][] = new int [4][4];
		
		int index=1;
		
		for (int i=0; i<arr.length;	 i++) {
			for (int j=0; j<arr[i].length; j++) {
			
				
				arr[i][j] = index++; 
				System.out.printf("%3d",arr[i][j]);
				
			} System.out.println();
		} 
	}
	
	public void exercise3() {
		// 4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
		// 1) 16 ~ 1�� ���� ���� �Ųٷ� �����ϼ���.
		// 2) ����� ������ ���ʴ�� ����ϼ���.
		
		int arr[][]= new int[4][4];
		
		int index = 16;
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				
				arr[i][j]= index--;
				System.out.printf("%3d", arr[i][j]);
				
			} System.out.println();
		}
	}
	
	public void exercise4() {
		// 4�� 4�� 2���� �迭�� �����Ͽ� 
		// 0�� 0������ 2�� 2�������� 1~10������ ������ ���� �� ���� ��
		// �Ʒ��� ����ó�� ó���ϼ���.
		
		int arr[][] = new int[4][4];
		
		int rowLastIndex = arr.length-1;
		int colLastIndex = arr[0].length-1;
		
		for(int i=0; i<rowLastIndex; i++) {
			for (int j=0; j<colLastIndex; j++) {
				arr[i][j] = (int)(Math.random() *10+1);
				
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
				
				if (i==rowLastIndex || j == colLastIndex) {
					arr[rowLastIndex][colLastIndex] += arr[i][j];
				}
			}	
			System.out.println();
		}
	}
	
	public void exercise5() {
		// 2���� �迭�� ��� ���� ũ�⸦ ����ڿ��� ���� �Է¹޵�, 
		// 1~10���� ���ڰ� �ƴϸ� ���ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.�� ��� �� �ٽ� ������ �ް� �ϼ���.
		// ũ�Ⱑ ������ ������ �迭 �ȿ��� ���� �빮�ڰ� �������� ���� �� �� ����ϼ���.
		// (char���� ���ڸ� ���ؼ� ���ڸ� ǥ���� �� �ְ� 65�� A�� ��Ÿ��, ���ĺ��� �� 26����) : 65~90
		// �̿�
		
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			
		System.out.print("size1 �Է�: ");
		int size1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("size2 �Է�: ");
		int size2 = sc.nextInt();
		sc.nextLine();
			
		if ( (size1 < 1 || size1 > 10) || (size2 < 1 || size2 >10) ) {
			System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			
		} else {
			char[][] arr = new char [size1][size2];
			
			for (int i=0; i<arr.length; i++) {
				for (int j=0; j<arr[i].length; j++) {
					arr[i][j] = (char)((int)(Math.random()*26+65));
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			break;
			
			}
		}
	
	}
			
			
			
	public void exercise6 () {
		// ���� �ʱ�ȭ�Ǿ� �ִ� �迭�� ������ �Ʒ��� ��[�׸�] �ǽ�����6 �帧���� ���� ������� ����ϼ���.
		// ��, print()�� ����ϰ� �� ���̿� ����(�� ��)�� �����ϵ��� ����ϼ���.
		
		String[][] strArr =  
				
				{{"��", "��", "��", "��", "��"}, 
				 {"��", "��", "��", "��", "��"}, 
				 {"��", "��", "��", "��", "��"}, 
				 {"��", "��", "��", "��", "��"}, 
				 {"��", "��", "! ", "��", "!!"}};
		
		for (int i=0; i<strArr.length; i++) {
			for (int j=0; j<strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			} 
			System.out.println();
		} 
		
				 
	}
				 
				 
	public void exercise7 () {
		// ����ڿ��� ���� ũ�⸦ �Է� �ް� �� ����ŭ�� �ݺ��� ���� ���� ũ�⵵ �޾�
		// ������ ���� �迭�� ���� �� �Ҵ��ϼ���.
		// �׸��� �� �ε����� ��a������ �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("���� ũ��: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		char[][] arr= new char[num1][];
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(i + "�� ũ��: ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			arr[i] = new char[num2];
			
		}
		
		char value = 'a';
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
			
	}
}

