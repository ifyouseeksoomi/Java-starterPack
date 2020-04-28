package com.kh.array.service;

import java.util.Arrays;

public class C_ArraySort { // 배열 정렬
	
	public void example1() {
		// 두 변수의 값을 서로 바꾸기 / 에버노트 필기 사진 참고
		
		int a = 10;
		int b = 20;
		
		// 두 변수의 값을 바꾸기 위한 임시 변수 선언
		
		int tmp;
		
		tmp = a; 					// 1) a: 10, b: 20, tmp: 10
		a = b;						// 2) a: 20, b: 20, tmp: 10
		b= tmp; 					// 3) a: 20, b: 10, tmp: 10
		
		// 이러다가 나중에 tmp 안쓰면 알아서 GC된다는 사실
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		// 진짜 바껴있음..
			
	}
	
	public void example2() {
		// 배열 내에서 인덱스끼리 값 바꾸기
		int[] arr = {2, 1, 3};
		
		int tmp = arr[0];
		arr[0]= arr[1];
		arr[1]=tmp;
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void example3() {
		// 삽입 정렬 (insertion sort) / 에버노트 필기 참고
		// 정렬 알고리즘 중 가장 간단하고 기본이 되는 알고리즘
		
		int[] arr = {2, 5, 4, 1, 3};
		// 오름차순으로 정렬!
		
		// 선택 정렬은 두 번째 값(★ 1번인덱스)부터 시작!
		for(int i=1; i<arr.length; i++) {
			// i에 의해서 선택된 인덱스: 비교 주체
			// 1번 인덱스가 주체: 0~0
			// 2번 인덱스가 주체: 0~1
			// 3번 인덱스가 주체: 0~2
			// 4번 인덱슥사 주체: 0~3
			// 근데 보면 ~n 에서 n은 다 i미만이네! 그래서 포문을 짤 수가 있다는 소리
			
			for(int j=0; j<i; j++ ) {
				// i와 비교되기 위한 j 인덱스: 비교 대상
				
				// 오름차순 정렬을 위한 비교 수행
				if(arr[i] < arr[j]) { // 이거 >랑 < 바꾸면 오름/내림 차순 바뀜
					// 이 if 조건문의 뜻은 '주체가 대상보다 작으면'
					int tmp = arr[i]; // i나 j나 아무거나 쓰기
					arr[i] = arr[j];
					arr[j] = tmp;
				} // if end
			} // 안쪽 for end
		} // 바깥 for end
		
		System.out.println(Arrays.toString(arr));
	
	}
	
	public void example4() {
		// 선택 정렬 (Selection Sort)
		// 비교되지 않은 배열 전체를 탐색하여 최솟값을 찾아 
		// 배열의 앞쪽부터 채워나가는 정렬 방식
		
		// ★ 데이터의 양이 적을 경우 좋은 성능을 보이는 정렬 방식
		// 실제로 100개 이상부터 성능저하가 급격하게 일어남
		
		int[] arr= {2, 1, 4, 5, 3};
		System.out.println("최초배열: " + Arrays.toString(arr));
		
		int min=0; 
			// ★ 뒤쪽 배열 중(맨 앞을 빼고) 제일 작은 값을 저장하고 있는 인덱스를 저장
		for (int i=0; i<arr.length-1; i++) {
			// ★ 선택 정렬은 배열의 길이 -1바퀴째에서 정렬이 완료됨
			
			min = i;
			for (int j=i+1; j<arr.length; j++) {
				// 앞쪽을 제외하고 뒤쪽에서 가장 작은 수를 찾음
				
				if(arr[j] < arr[min] ) {
				   //뒤쪽     	//현재
					min =j; // 이 인덱스가 가장 작았다 라는 뜻
				} // if end
			} // 안쪽 for end
			
			int tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
			
			System.out.println(i+1 + "바퀴" + Arrays.toString(arr));
		
	}

}
}
