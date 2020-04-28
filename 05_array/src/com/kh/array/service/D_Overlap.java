package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap { // 중복제거

	public void example1() {
		
		// int형 배열 arr을 선언하여 5칸 할당 후
		// 각 인덱스에 값을 입력받아 저장.
		// 단, 중복되는 값은 저장하지 않음.
		// (중복값 입력 시 "중복값 존재" 출력)
		
		int arr[] = new int[5];
		Scanner sc = new Scanner (System.in);
		
		for (int i=0; i<arr.length; i++) {											// 5번 순차적으로 입력받을 거니까 for문 시작
			System.out.print(i+"번째 인덱스 값: ");
			arr[i] = sc.nextInt();
			sc.nextLine();
		
			// ★ 중복 검사
			for(int j=0; j<i; j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println("중복값 존재");
					i--; // 바깥쪽 for문 현재 바퀴 유지시키는 장치
					break;
				}
				
			} // 안쪽 for end
						
		} // 바깥 for end
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void example2 () {
		// 로또 번호 생성기					
		// - 로또 번호의 범위: 1 ~ 45 		-> 난수(Math.random())
		// - 번호 추출 개수: 6개 			    -> int형 배열 6칸 할당	
		// - 그 외 특징: 중복 번호 추출 X			-> 오늘 배운 중복제거 기능으로 가능
		// - 오름차순 정렬					
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			// 1~45 난수를 발생시켜 대입: Math.random()필요
			double ran = Math.random() *45+1;
			// 0 <= ran < 1
			// 0.xxx <= ran < 45.xxx
			// 1.xxx <= ran < 46.xxx 
			// 1 <= (int)ran < 46
			
			lotto[i] = (int)ran;
			
			// 중복 검사
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					// 같은 값이 배열에 존재하는 경우
					i--; // 현재 바퀴 반복
					break;
					
				} 
				
			} // 바깥쪽 for end
		}	
			// 오름차순 정렬 
			/*for(int i=1; i<lotto.length; i++ ) {
				for (int j=0; j<i; j++) {
					if (lotto[i] < lotto[j]) {
						int tmp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = tmp;
					}
				}
			}*/						// 이게 오름차순 오늘 배운거고
			
			Arrays.sort(lotto);		// 이건 오름차순 한방에 끝내는거고
			
			System.out.println("오늘의 로또 번호: " + Arrays.toString(lotto));
			
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
