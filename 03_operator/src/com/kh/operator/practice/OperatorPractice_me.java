package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice_me {

	public void practice1() {
		
		System.out.println("정수를 하나 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		sc.nextLine();
		
		String result1 = (input1>0) ? ("양수입니다.") : ("양수가 아닙니다.");
		System.out.println(result1);
		
	}
	
	public void practice2() {
		
		System.out.println("정수를 하나 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int input2 = sc.nextInt();
		sc.nextLine();
		
		String result2 = (input2>0) ? ("양수입니다.") : ((input2==0) ? ("0입니다.") : ("음수입니다."));
		System.out.println(result2);
		
	}
	
	public void practice3() {
		System.out.println("정수를 하나 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int input3 = sc.nextInt();
		sc.nextLine();
		
		String result3 = ((input3%2==0) ? ("짝수입니다. ") : ("홀수입니다. "));
		System.out.println(result3);
		
	}
	
	public void practice4() {
		System.out.println("인원수를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("사탕 개수를 입력하세요. ");
		int candies = sc.nextInt();
		sc.nextLine();
		
		System.out.println("\n1인당 사탕 개수: "+ (candies/people));
		System.out.println("남는 사탕 개수: "+ (candies%people));
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		
		System.out.println("학년(숫자만): ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("반(숫자만): ");
		int classnum = sc.nextInt();
		sc.nextLine();

		System.out.println("번호(숫자만): ");
		int privatenum = sc.nextInt();
		sc.nextLine();
		
		System.out.println("성별(F/M): ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("성적(소수점 아래 둘째자리까지): ");
		double point = sc.nextDouble();
		
		gender = (gender=='M') ? '남' : '여' ; // 변수 선언이 아니라 재활용일 때는 시작을 그냥 한다. (변수명만 사용한다.)
		
		System.out.println(grade + "학년 " + classnum + "반 " + privatenum + "번 " 
		+ name + " " + gender + "학생의 성적은 " + point + "이다.");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}

