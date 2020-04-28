package com.kh.array.service;

import java.util.Scanner;

public class A_Array {
	// 배열 
	// - ""같은 자료형""의 변수를 하나의 묶음으로 다루는 것.
	// - 저장된 값마다 인덱스가 지정됨.(인덱스 시작은 0)
	
	public void example1() {
		
		
		// 배열의 필요성을 파악해보자!
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		// ...
	    int num1000=0;
		
		// 같은 자료형인 변수가 여러개 필요한 경우
		// 변수 선언 방법으로는 한계가 있다. (특히 유지보수할 때 변수 값 모두 바뀐다고하면 뒤짐)
	    
	    // 배열 이용하여 선언, 할당, 초기화 진행
	    
	    
	    // 1. 배열 선언 (변수 선언과 크게 다르지 않다만 기호에 유의.[] == 배열을 나타내는 기호)
	    // 자료형[] 배열명;
	    // 자료형 배열명[];
	    
	    int[] arr; // int형 배열 참조변수 선언
	    // ★★ 배열을 선언한 변수는 참조형이다!!
	    
		
	    // 2. 배열 할당 (할당: 메모리상에 데이터 저장 공간을 확보하는 것)
	    // 이미 선언한 배열명= new 자료형 [원하는 배열크기];
	    // 							  (==배열 칸수)
	    
	    // ★★★ new 연산자의 의미
	    // - Heap 영역에 새로운 공간을 할당한다
	    
	    arr = new int[4]; 
	    // 메모리 구조 그림 참고
	    
	    // 3. 배열 초기화
	    // 배열명 [인덱스] = 값;
	    arr[0] =10;
	    arr[1] =20;
	    arr[2] =30;
	    arr[3] =40;
	    // arr[4] =50; 
	    // int 네 칸짜리로 만들었기 때문에(할당했기 떄문에), out of range로 뜸 == 에러
	    
	    System.out.println("arr[0]: " + arr[0]);
	    System.out.println("arr[1]: " + arr[1]);
	    System.out.println("arr[2]: " + arr[2]);
	    System.out.println("arr[3]: " + arr[3]);
	    
	    // int 배열 선언 및 4칸 할당   
	    int arr2[]=new int[4]; // int[] arr2; 보다는 저렇게 잘 씀 즉 int쪽에 안붙임
	    
	    // 배열명.length : 배열의 길이를 반환
	    for(int i=0; i<arr2.length; i++) { // length: 위에서 new int[4]라니까 4가 반환될 것
	    	// 즉   0    ~   4미만까지      1씩증가
	    	
	    	arr2[i]= (i+1)*5;
	    	// i == 0 --> arr2[0] = 5
	    	// i == 1 --> arr2[1] = 10
	    	// i == 2 --> arr2[2] = 15
	    	// i == 3 --> arr2[3] = 20
	    		    	
	    }
	    
	    // for문으로 배열 값 모두 출력
	    for(int i=0; i<arr2.length; i++) {
	    	System.out.println("arr2[" + i + "] =" + arr2[i]); // arr2[0] = 
	    	
	    }
	    
	}
	
	  public void example2() {
	    	
	    	// double형 배열 darr 선언 및 5칸을 할당하고
	    	// 각 index에 1.0부터 1씩 증가하는 값을 대입하고 출력
		  
		  double[] darr;
		  darr = new double[5];
		 		  
		  darr[0] = 1.0;
		  darr[1] = 2.0;
		  darr[2] = 3.0;
		  darr[3] = 4.0;
		  darr[4] = 5.0;
		  
		  System.out.println("arr[0]: " + darr[0]);
		  System.out.println("arr[1]: " + darr[1]);
		  System.out.println("arr[2]: " + darr[2]);
		  System.out.println("arr[3]: " + darr[3]);
		  System.out.println("arr[4]: " + darr[4]);
		    
		  
	  }
	  
	  public void example3() {
		  
		  
		  Scanner sc = new Scanner(System.in);
		  int iArr[];
		  
		  System.out.println("배열 크기: ");
		  int size =sc.nextInt();
		
		  // 입력된 크기 만큼의 배열 할당
		  iArr = new int[size];
		  
		  for(int i=0; i<iArr.length; i++) {
			  System.out.print("iArr[" + i + "] = ");
			  iArr[i] = sc.nextInt();
			  sc.nextLine();
		  }
		  
		  for(int i=0; i<iArr.length; i++) {
			  System.out.println("iArr[" + i+"]에 저장된 값: " + iArr[i]);
	    	
	    }
	       
	  }
	  
		public void example4() {
			// 배열 선언, 할당, 초기화 한번에 하기
			
			// int형 arr 선언 및 5칸 할당 후 
			// 1, 2, 3, 4, 5를 각각의 인덱스에 저장하기.
			
			int arr[] = {1, 2, 3, 4, 5};
			// 배열 선언	// 배열 할당 및 초기화 	     	: 그걸 한번에 한 것
			
			System.out.println("arr 배열의 길이: " + arr.length);
			
			for (int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			
		}
		
		public void example5() {
			// 5명의 키 정보를 입력받아 배열에 저장하고
			// 5명의 키 평균값을 출력.
			
			Scanner sc= new Scanner(System.in);
			
			double heights[] = new double[5];
			// double형 배열 heights 선언 및 할당
			
			// 5명 입력 -> 반복문(for)
			// 평균 == 합계/인원 수
			// 합계 --> sum을 이용해 누적
			
			
			for (int i=0; i<heights.length; i++) {									// i는 인덱스 값, 그리고 i<5 이러면 나중에 유지보수 귀찮 : 걍 인덱스 길이로 쳐버리는게 훨 편
				System.out.print((i+1)+"번째 입력: ");
				heights[i] = sc.nextDouble();										// 입력받은 값들을 하이츠 배열에 순서대로 배열하는 것임
				sc.nextLine();
			}
			
			// 합계 구하기 : 일단 합계 변수 선정 먼저
			
			double sum=0; 															// 이렇게 써도 메모리상에는 자동형변환되어서 0이 아니라 0.0으로 저장되게 된다.
			
			for(int i=0; i<heights.length; i++) {									// 어라 근데 위에 포문에서 int i=0; 했는데 또 쓸수 있나? ㅇㅇ 왜냐면 포문은 한번 끝나면 사라짐
				sum += heights[i];
				
			}
			
			System.out.println("평균: "+ sum/heights.length);
			
		}
		 
		
		public void example6 () {
			// 배열의 단점
			// 1) 한 가지 자료형만 저장할 수 있다.
			// 2) 한번 만들어진 배열은 크기 변경이 불가능하다. (인덱스 값 변경 불가) : 3칸짜리 배열 만들고 하나 추가하거나, 제거하거나 이런 짓 못함.
			// ex) 만 칸짜리 배열을 만들었는데, 실제 저장된 데이터는 세 개만 들어갔다. 데이터 절약을 위해 나머지 9997개 버리고 싶은데 그럴 수가 없다는 사실.
			
			// 입력받은 크기 만큼의 배열 할당하기
		
			Scanner sc = new Scanner(System.in);
			System.out.println("크기 입력: ");
			int size = sc.nextInt();
			//sc.nextLine();								// 왜 안쓰냐면 다음에 받는 값이 없으니까 솔직히 굳이 안써도 되는 것!
			
			// 입력받은 값 만큼의 크기를 가지는 배열 선언 및 할당
			int arr[]=new int[size];
			
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]);					// 여까지만 하고 내가 실행하면 0이 다섯개가 나온다. int형의 기본값이 0이고, 인덱스를 5로 줬기 때문. JVM이 그렇게 기본 할당한 것.
			}
			 
			// 지정된 크기를 넘어선 위치(인덱스)에 접근 시 어떻게 되는지 확인
			// arr[size] = 3; 								// 에러 발생 (ArrayIndexOutofBoundsException): 배열의 인덱스 범위를 넘어서서 에러 발생
			
			// 기존 배열보다 2배 큰 배열을 새롭게 할당하여 arr변수가 참조할 수 있게 코드 작성
			arr = new int[size*2];
			System.out.println("\n늘어난 배열 길이: " + arr.length);
			System.out.println("arr[size:] : " + arr[size]);
			
		}
		
		public void example7() {
			// 입력받은 문자열을 char형 배열에 한 글자씩 저장하기
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자열 입력: ");
			String input = sc.nextLine();
			
			// Hello 	5칸짜리 필요
			// hi 		2칸짜리 필요
			
			// 배열의 길이: 배열명.length 	(<-는 변수)		배열은 () 안붙임
			// 문자열의 길이: 변수명.length() 	(<-는 메소드)		문자열은 () 붙임
								
			// String(문자열)의 길이 만큼의 char 배열 선언 및 할당
			char cArr[] = new char[input.length()];				
			// 여기서 length() 하는거는 좀 다른 것.
			
			for (int i=0; i<cArr.length; i++) {
				cArr[i] = input.charAt(i);
			}										// input하나씩 한 칸에 배열 할당하고
			
			for (int i=0; i<cArr.length; i++) {
				System.out.println("cArr" + i + " 인덱스 값: " + cArr[i]);
			}										// 그 input 들어간 배열을 실제로 출력
			
			System.out.println();
			System.out.println("찾으려는 문자: ");
			char ch = sc.nextLine().charAt(0);
				
			for(int i=0; i<cArr.length; i++) {
				if(cArr[i] == ch) {
					System.out.println(i);			// 가장 검색의 원초적인 접근 (나랑 같나? 같으면 뽑고 아님 말고)
				}
			}
		
		} 

			
		public void example8() {
			// String 배열의 메모리 구조
			
			// String 배열 선언, 할당, 초기화
			
			String sArr[] = {"백반", "햄버거", "짜장면", "서브웨이", "도시락"};					// 배열을 선언하자마자 초기화를 할때는 {} 사용
			for(int i=0; i<sArr.length; i++) {
				System.out.println(sArr[i]);
			}
		}
		
		public void example9() {
			// 메뉴가 입력되어 있는 String 배열 선언 및 초기화 후
			// 난수를 발생시켜 메뉴를 하나 선정해보자!!
			
			Scanner sc= new Scanner(System.in);
			
			String menu[] = {"백반", "롯데리아", "버블티", "칼국수", "돈까스"};
			
			// 근데 난수란? 임의의 수
			
			// 난수를 발생 시키는 방법: Math.random()
			// Math 클래스: 자바에서 제공하는 수학관련 기능이 담겨있는 클래스
			
			// Math.random()이 발생시키는 난수의 범위
			// 0 <= x <1 (double형으로 랜덤 발생시킴 어라 index는 정수만 되는뎁)
			
			double ran = Math.random();
			// 0<= x < 1의 범위를 0 <= x <5로 범위를 변경할 수 있게 수식 추가 
			// 및 int형으로 형변환 (왜냐면 index는 int형만 쓰니깐~!)
			
			int r = (int) (ran*menu.length);
			
			System.out.println("오늘의 점심메뉴: " + menu[r]);
	
	  }
		
		
}  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
	


