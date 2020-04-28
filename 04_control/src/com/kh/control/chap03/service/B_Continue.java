package com.kh.control.chap03.service;

public class B_Continue {

	// continue
	// - 반복문 내에서만 사용 가능한 예약어
	// - 코드 실행 중 continue를 만나게 되면 이후 내용을 실행하지 않고, 반복문 처음으로 돌아감
	// - 처음으로 돌아갈 때 증감식이 있으면 이를 수행함
	
	public void example1() {
		// 1에서 100사이의 정수 중 4의 배수를 제외하고 나머지 수들의 합을 구하여라 (continue사용)
	
		int sum=0;
		
		for (int i=1; i<=100; i++) {
			
			if (i%4==0) { // 4의 배수 검출
			
				continue;
			} 
			
			sum += i;
			
			} System.out.println("sum: "+sum);
		
	}
	
	public void example2() {
		// 2에서 9단까지의 구구단 출력
		// 단, 3단, 6단, 9단은 피해서 출력하기 (continue 이용)
	
		for (int dan=2; dan<10; dan++) {
			
			if (dan%3==0) {
				
				continue;
			}
			
			for (int su=1; su<10; su++) {
				
				//System.out.println(dan + "X" + su + "=" + dan*su);
				System.out.printf("%2d X%2d = %2d\n", dan, su, dan*su);
				
			}
			
			System.out.println();
	
		
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}}


