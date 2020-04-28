package com.kh.darray.service;

import java.util.Scanner;

public class DArray_alex {

	public void example6_ex_alex () {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[2][3];
		
		for (int i=0; i<arr.length; i++) {
			System.out.println( (i+1)+ "번 학생의 점수: ");
			
			int sum =0;
			
			for (int j=0; j<arr[i].length; j++) {
				String subject = null;
				
				switch(j) {
				
				case 0: subject = "국어"; break;
				case 1: subject = "수학"; break;
				case 2: subject = "영어"; break;
				
				}
				
				System.out.println(subject + "점수 입력: ");
				
				arr[i][j] = sc.nextInt();
				sc.nextLine();
				
				sum += arr[i][j];
				
			}
			
			System.out.println("합계: " + sum);
			System.out.println("평균: " + sum/arr[i].length);
			System.out.println();
			
		
		}  
		
		
	
		for (int i=0; i<arr[i].length; i++) {
			String subject =null;
			
			switch (subject) {
			case "국어": System.out.println(subject+"평균 점수: ");			}
			
		}
	}
	
	
}
