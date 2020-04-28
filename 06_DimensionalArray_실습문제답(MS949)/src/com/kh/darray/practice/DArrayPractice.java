package com.kh.darray.practice;

import java.util.Scanner;

public class DArrayPractice {
	
	/* 실습문제 1
	3행 3열짜리 문자열 배열을 선언 및 할당하고
	인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
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

	
	/* 실습문제 2
	4행 4열짜리 정수형 배열을 선언 및 할당하고
	1) 1 ~ 16까지 값을 차례대로 저장하세요.
	2) 저장된 값들을 차례대로 출력하세요.

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
	
	
	/* 실습문제 3
	4행 4열짜리 정수형 배열을 선언 및 할당하고
	1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
	2) 저장된 값들을 차례대로 출력하세요.

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
	
	
	/* 실습문제 4
	4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
	아래의 내용처럼 처리하세요.
	 */
	public void practice4() {
		int[][] arr = new int[4][4];
		
		int rowLastIndex = arr.length-1; // 행의 마지막 인덱스
		int colLastIndex = arr[0].length-1; // 열의 마지막 인덱스
		
		for(int i=0; i<rowLastIndex; i++) {
			for(int j=0; j<colLastIndex; j++) {
				// 1 ~ 10 사이 난수를 발생시켜 2차원 배열에 대입.
				arr[i][j] = (int)(Math.random() * 10 + 1);
				
				// 난수 대입과 동시에 해당 행, 열 끝에 값을 누적
				arr[i][3] += arr[i][j]; // 행의 합 						(?★?)
				arr[3][j] += arr[i][j]; // 열의 합 						(?★?)
			}
		}
		
		// 2차원 배열 출력 + 총합 계산
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
				
				// 2차원 배열에 반복 접근 중 
				// 마지막 행 또는 마지막 열에 접근한 경우
				// 총합 누적 진행
				if(i == rowLastIndex || j == colLastIndex) {
					arr[rowLastIndex][colLastIndex] += arr[i][j];
					
					// 마지막 arr[3][3]에서 또 총합 누적이 진행되어 
					// 총합을 넘는 값이  arr[3][3] 저장되겠지만,
					// 마지막 누적 이전에 이미 총합을 출력하였기 때문에 문제 없음.
				}
			}
			System.out.println(); // 줄바꿈
		}
	}
	
	
	/* 실습문제 5
	2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
	“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
	크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
	(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자) 

	ex.
	행 크기 : 5
	열 크기 : 4
	T P M B 
	U I H S 
	Q M B H 
	H B I X 
	G F X I 
	 */
	public void practice5() {
		
			Scanner sc = new Scanner(System.in);
			
			
			while(true) {
				System.out.print("행 크기 : ");
				int row = sc.nextInt();
				System.out.print("열 크기 : ");
				int col = sc.nextInt();
				
				if((row < 1 && row >10) || (col < 1 && col > 10)) {
					System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
					
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
		
	
	
	/*  실습문제 6
	위의 초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제6 흐름’과 같은 방식으로 출력하세요.
	단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요.
	 */
	public void practice6() {
		String[][] arr = {
							{"이", "까", "왔", "앞", "힘"}, 
							{"차", "지", "습", "으", "냅"}, 
							{"원", "열", "니", "로", "시"}, 
							{"배", "심", "다", "좀", "다"},
							{"열", "히", "!", "더", "!!"}
						 };
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			
		}
	}
	
	
	/* 실습문제 7
	사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아 
	문자형 가변 배열을 선언 및 할당하세요.
	그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.

	ex.
	행의 크기 : 4
	0열의 크기 : 2
	1열의 크기 : 6
	2열의 크기 : 3
	3열의 크기 : 5
	a b 
	c d e f g h 
	i j k 
	l m n o p 
	 */
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		char[][] arr = new char[row][];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "의 크기 : ");
			int col = sc.nextInt();
			
			arr[i] = new char[col];
		}
		
		// 값 초기화
		char value = 'a';
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
