package com.kh.darray.service;

import java.util.Scanner;

public class DArray_alex {

	public void example6_ex_alex () {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[2][3];
		
		for (int i=0; i<arr.length; i++) {
			System.out.println( (i+1)+ "�� �л��� ����: ");
			
			int sum =0;
			
			for (int j=0; j<arr[i].length; j++) {
				String subject = null;
				
				switch(j) {
				
				case 0: subject = "����"; break;
				case 1: subject = "����"; break;
				case 2: subject = "����"; break;
				
				}
				
				System.out.println(subject + "���� �Է�: ");
				
				arr[i][j] = sc.nextInt();
				sc.nextLine();
				
				sum += arr[i][j];
				
			}
			
			System.out.println("�հ�: " + sum);
			System.out.println("���: " + sum/arr[i].length);
			System.out.println();
			
		
		}  
		
		
	
		for (int i=0; i<arr[i].length; i++) {
			String subject =null;
			
			switch (subject) {
			case "����": System.out.println(subject+"��� ����: ");			}
			
		}
	}
	
	
}
