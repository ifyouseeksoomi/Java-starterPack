package com.kh.control.chap02;

import java.util.Scanner;

public class PracticeFor {

	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String star = "*";
		char blank = ' ';
		
		for (int i=0; i<input; i++) {
			
			// 앞쪽 공백 출력 for문
			for(int k=0; k<input-1-i; k++) {
				System.out.print(blank);
			}
			
			for (int j=0; j<=i; j++) {
				System.out.print(star);
			}
			
			System.out.println();
			
		} 

	}
}
