package com.kh.variable.controller;

import java.util.Scanner;

public class F_Scanner {
	
// 키보드로 이름을 입력받아 "ㅇㅇㅇ님 환영합니다." 라는 문자열 형태로 출력하기
	public void scannerEx1() {
		Scanner sc = new Scanner(System.in);
		// Scanner는 Java에서 입력을 쉽게 할 수 있도록 제공해주는 클래스로 java.util 패키지에 포함되어있다.
	
		System.out.print("당신의 이름은 무엇입니까?  ");
		
		String name = sc.nextLine();
		
		System.out.println(name + "님 환영합니다.");
		
	}



// 이름, 나이, 성별을 입력받아 "ㅇㅇㅇ님은 ㅇㅇ세, ㅇ자입니다." 형태로 출력하기
    public void scannerEx2() {
	
	java.util.Scanner sc = new java.util.Scanner(System.in);
	// -> import 구문을 작성하지 않고 다른 클래스를 얻어오는 방법
	
	System.out.print("이름: ");
	String name = sc.nextLine();
	// sc.nextLine() : 키보드로 입력된 한 줄의 문자열을 (입력버퍼에서)읽어옴.
	// -> 엔터(\n)까지 포함해서 읽어옴.
	
	System.out.print("나이: ");
	int age = sc.nextInt(); // 나이는 nextline 쓸 수 없다. nextline은 문자열에만 쓰는 거라서.
	// sc.nextInt(): 키보드로 입력된 정수 값을 읽어옴.
	// -> 입력버퍼에서 공백, 띄어쓰기, 줄바꿈 이전까지만 읽어옴.
	
	sc.nextLine(); // 입력 버퍼에 있는 줄바꿈문자(\n) 제거 용도
	
	System.out.print("성별(남/여): ");	
	char gender = sc.nextLine().charAt(0); // sc.nextLine()로 한글자만 데려오기가 어려워서 뒤에 .charAt(0)한 것
	// charAt(index) : 문자열에서 index번째 문자 하나를 뽑음.
	// 참고로 index는 0부터 시작하는 것을 주의~!
	
	System.out.print("키(cm) : ");
	double height = sc.nextDouble();
	sc.nextLine(); // 입력 버퍼에서 줄바꿈(개행) 문자 제거(보니까 이새끼는 그냥 웬만하면 쓰는게 좋음 sc.nextLine 쓰지 않는 이상)
	
	
	System.out.printf("%s님은 %d세, %c자, 키 %.1fcm입니다. \n",name, age, gender, height);
	
	
	
	

}

}
	

