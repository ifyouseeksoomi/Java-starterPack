package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {
	// 얕은 복사 : 참조하는 배열의 시작 주소만을 복사
	// 깊은 복사 : 복사하고자 하는 배열과 동일한 자료형, 크기를 가지는 배열을 만들어 내부 데이터를 똑같이 작성(복사)하는 것
	//       : 얘는 주로 언제 많이 쓰냐면, 원본데이터를 유지하면서 그 데이터를 가져다가 뭔가 추가작업을 하고 싶을 때 (example4)
		
	// 결국 얕.복과 깊.복의 차이는 원본데이터를 유지할 수 있느냐 없느냐의 차이인 것!
				
		
	public void example1 () {
		// 얕은 복사 시 원본데이터 유지 여부 확인
		
		int origin[] = {10, 20, 30, 40, 50};
		
		// 얕은 복사 진행
		int copyArr[] = origin;
		// 배열 참조형 변수에 저장된 주소값을 복사해옴
		
		// 데이터 변경 전 원본
		System.out.println(Arrays.toString(origin));
		// Arrays는 자바에서 제공하는 기본 클래스임 : 배열을 편하게 사용하거나 또는 추가적인 기능을 제공하는 클래스
		// Arrays.toString(배열명)
		// : 배열 내의 데이터를 한번에 출력
		
		// 데이터 변경 전 복사본
		System.out.println(Arrays.toString(copyArr));
		
		// 복사본의 데이터를 변경
		copyArr[2] = 10000;
		
		System.out.println("\n복사본 값 변경 후");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// 배열의 해시코드 출력
		// 해시코드란? 주소값을 해시함수라는걸 이용하여 변경된 형태
		// 해시함수란? 특정 문자열을 정해진 길이의 형태로 변형. 
		// ex. 1234 를 해시함수에 넣었더니 asdfjiowejtkalsd가 나왔다. 
		//     즉 문자열을 특정 길이만큼으로 아무렇게나 변경해주는 것
		
		// 참고: 같은 주소값을 가질 경우 해시코드도 같은 값이다
		System.out.println("\norigin의 hashCode(): " + origin.hashCode());
		System.out.println("copyArr의 hashCode(): " + copyArr.hashCode());
		
	}
	
	public void example2() {
		// for문을 이용한 깊은 복사 + 원본데이터 유지 확인
		
		int[] origin = {1, 2, 3, 4, 5}; 
		// index번호는 origin0, origin1, origin2, origin3, origin4 이렇게 되는 거고 값이 1, 2, 3, 4, 5인거다
		
		// 깊은 복사를 하려면 같은 자료형, 같은 크기 이상의 배열을 선언 및 할당해야함
		int[] copyArr = new int[origin.length];				// 60~63 이것이 깊은 복사의 process
														 	// for문은 차후에 어레이카피식으로 할수도 있다
		for(int i=0; i<copyArr.length; i++) {
			copyArr[i] = origin[i]; 						// 깊은 복사 완료!
															
		
			}

		System.out.println("변경 전: ");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// 복사본 데이터 변경
		copyArr[2] = 9999;
		
		System.out.println("변경 후: ");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// 두 배열의 해시코드 출력 (다른지 확인)
		System.out.println("\norigin의 hashCode(): "+ origin.hashCode());
		System.out.println("copyArr의 hashCode(): "+ copyArr.hashCode());
		
}
	
	public void example3() {
		// System.arraycopy()를 이용한 깊은 복사 + 원본데이터 유지 확인
		
		int[] origin = {1, 2, 3, 4, 5};
				
		// 깊은 복사를 하려면 같은 자료형, 같은 크기 이상의 배열을 선언 및 할당해야함
		int[] copyArr = new int[origin.length];
				
		//ex2와 달리 여기 for문을 지우고 시스템쩜 어래이카피(자바 기본 제공툴)를 쓴다
		// System.arraycopy(원본배열명, 복사시작 인덱스 지정, 복사본 배열명, 복사본에서 복사될 위치 지정, 복사 길이)
		System.arraycopy(origin, 0, copyArr, 0, origin.length);

		System.out.println("변경 전: ");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// 복사본 데이터 변경
		copyArr[2] = 9999;
				
		System.out.println("변경 후: ");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
				
		// 두 배열의 해시코드 출력 (다른지 확인)
		System.out.println("\norigin의 hashCode(): "+ origin.hashCode());
		System.out.println("copyArr의 hashCode(): "+ copyArr.hashCode());
				
	}
	
	public void example4() {
		// 처음에 배열 크기를 입력하고 해당 크기만큼의 입력을 진행하여 각 인덱스에 값을 초기화함.
		// 입력 완료 시, 추가적으로 더 입력할 내용이 있는지 물어보고 있을 경우, 추가로 필요한 배열 크기를 입력받아 
		// 다시 늘어난 배열 크기만큼 입력을 받음.
		
		// 추가적으로 입력할 내용이 없다면 
		// 배열에 저장된 모든 내용을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 크기 입력: ");
		int size = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[size];		// 배열 초기화식 (size는 내가 size 길이의 배열을 만들겠다는 의미)
		
		int i=0;						// 각 인덱스에 접근하기 위한 초기화 식, 0으로 하는건 원래 0 1 2 3이렇게 세니깐 / ★ 이 초기식 빼지 않도록 주의
		while(true) {					// 조건문에 걍 true쓰는것: 아주 무한으로 막 돌려버리게
			System.out.print(i + "번째 인덱스 입력: ");	
			arr[i] =sc.nextInt();
			sc.nextLine();
			
			i++;						// 만약 i가 인덱스보다 그 이상의 수이면 에러날테니까 이럴때는 아래에다 이프문을 쓰는데
			
			// 증가한 i값이 현재 배열 길이와 같다면, (즉 인덱스가 그 이상의 수라면)
			if(i==arr.length) {
				System.out.print("추가로 입력하시겠습니까? (아무거나/n) : ");
				char ch = sc.nextLine().charAt(0);
				
				if(ch == 'n') {
					break;				// 'n' 입력시 반복문 종료 / 이 분기문은 가장 가까이있는 while문(129)에만 작용할 것
				} else {
					System.out.print("추가할 배열 길이: ");
					size += sc.nextInt();
					sc.nextLine();
					
					// 깊은 복사용 배열 선언 및 할당 (이 짓을 왜 하필 여기서 하냐면 추가할 배열 길이를 받은 순간, 깊은 복사가 필요해지는거니까)
					int[] copyArr = new int[size];
					
					// 깊은 복사 진행
					System.arraycopy(arr, 0, copyArr, 0, arr.length);
					
					// arr변수가 깊은 복사된 배열 주소를 참조 (얕은 복사)
					// = 위에서 깊은 복사 후, 아래 식으로 얕은복사까지 하는 것임
					arr = copyArr;
				}
			}
		}
		
		// arr에 저장된 내용 모두 출력
		for(int j=0; j<arr.length; j++) {
			System.out.println("arr[" + j + "] =" + arr[j]);
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
