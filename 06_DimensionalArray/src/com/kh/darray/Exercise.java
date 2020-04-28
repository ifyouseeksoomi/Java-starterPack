package com.kh.darray;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {

	public void exercise1 () {
		
		// 3행 3열짜리 문자열 배열을 선언 및 할당하고
		// 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 
		// “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
		
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
		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 1 ~ 16까지 값을 차례대로 저장하세요.
		// 2) 저장된 값들을 차례대로 출력하세요
		
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
		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		// 2) 저장된 값들을 차례대로 출력하세요.
		
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
		// 4행 4열 2차원 배열을 생성하여 
		// 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		// 아래의 내용처럼 처리하세요.
		
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
		// 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 
		// 1~10사이 숫자가 아니면 “반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
		// 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
		// (char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자) : 65~90
		// 미완
		
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			
		System.out.print("size1 입력: ");
		int size1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("size2 입력: ");
		int size2 = sc.nextInt();
		sc.nextLine();
			
		if ( (size1 < 1 || size1 > 10) || (size2 < 1 || size2 >10) ) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			
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
		// 위의 초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제6 흐름’과 같은 방식으로 출력하세요.
		// 단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요.
		
		String[][] strArr =  
				
				{{"이", "까", "왔", "앞", "힘"}, 
				 {"차", "지", "습", "으", "냅"}, 
				 {"원", "열", "니", "로", "시"}, 
				 {"배", "심", "다", "좀", "다"}, 
				 {"열", "히", "! ", "더", "!!"}};
		
		for (int i=0; i<strArr.length; i++) {
			for (int j=0; j<strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			} 
			System.out.println();
		} 
		
				 
	}
				 
				 
	public void exercise7 () {
		// 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
		// 문자형 가변 배열을 선언 및 할당하세요.
		// 그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("행의 크기: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		char[][] arr= new char[num1][];
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(i + "의 크기: ");
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

