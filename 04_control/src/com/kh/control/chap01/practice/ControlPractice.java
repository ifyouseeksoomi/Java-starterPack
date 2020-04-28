package com.kh.control.chap01.practice;

import java.util.Scanner;

import com.kh.control.chap01.service.A_If;

public class ControlPractice {

	public void practice5 () {
		
		/*Q5.
		 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		 로그인 성공 시 “로그인 성공”,
		 아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요. 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String id = "myId";
		String pw = "myPassword12";
		
		/* String result1 = "로그인 성공";
		String result2 = "아이디가 틀렸습니다.";
		String result3 = "비밀번호가 틀렸습니다."; */
				
		System.out.print("아이디: ");
		String inputId = sc.nextLine();
		
		System.out.print("비밀번호: ");
		String inputPw = sc.nextLine();
		
		// class도 자료형 -> 그래서 String도 자료형
		// String.equals()
		// String 자료형이 가지고 있는 진짜 값들이 같은지를 비교하는 메소드
		// 결과로 true 아니면 false 만을 반환
		
		if (id.equals(inputId)) {														// .을 찍었는데 자동완성 뭐가 나온다는 것의 의미: 그 앞에 쓴 놈이 class라는 것
		      if (pw.equals(inputPw)) { 												// --> ""class도 자료형이다. ""
		    	  System.out.println("로그인 성공");
		      } else {
		    	  System.out.println("비밀번호가 틀렸습니다.");	  								// 이걸 먼저 쓴 이유는, 애초에 아이디가 틀리면 비번까지 안가려고.
		      } 
			
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	
	public void practice1() {
		
		/*
		 *아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		ex.
		1. 입력
		2. 수정
		3. 조회	
		4. 삭제
		7. 종료
		메뉴 번호를 입력하세요 : 3
		조회 메뉴입니다. 
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ex. " + "\n1. 입력" + "\n2. 수정" + "\n3. 조회" + "\n4. 삭제" + "\n7. 종료" + "\n메뉴 번호를 입력하세요: ");
		int input1 = sc.nextInt();
		sc.nextLine();
		
		switch (input1) {
			case 1:
				System.out.print("입력메뉴입니다");
			case 2:
				System.out.print("수정메뉴입니다");
			case 3:
				System.out.print("조회메뉴입니다");
			case 4:
				System.out.print("삭제메뉴입니다");
			case 7:
				System.out.print("프로그램이 종료됩니다.");
		}
		
		
	}

	public void practice2() {
		
		/*	 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		         짝수가 아니면 “홀수다“를 출력하세요.
			양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
			ex.
			숫자를 한 개 입력하세요 : -8
			양수만 입력해주세요.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 하나 입력하세요. ");
		
		int input2 = sc.nextInt();
		sc.nextLine();
		
		
		
		if (input2>0) {	
			
			if (input2%2==0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");		
		}
		
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	
	public void practice3 () {
		/* 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		불합격인 경우에는 “불합격입니다.”를 출력하세요. */	
		
		Scanner sc=new Scanner(System.in);
			
		System.out.print("국어점수: ");
		int kor = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수학점수: ");
		int math = sc.nextInt();
		sc.nextLine();
		
		System.out.print("영어점수: ");
		int eng = sc.nextInt();
		sc.nextLine();
		
		int sum = kor + math + eng;
		double ave = sum/3;
		
		if (kor>=40&&math>=40&&eng>=40 && ave>=60) {
			System.out.println("국어: "+ kor + "\n수학: "+ math + "\n영어: "+ eng + "\n합계: "+sum + "\n평균: "+ave+"\n축하합니다, 합격입니다!");
		   } else {
			   System.out.println("불합격입니다.");
		   }
	}
	
	public void practice4 () {
		// 수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("월을 입력하세요.");
		
		int month = sc.nextInt();
		sc.nextLine();
		
		switch (month) {
		case 12: case 1: case 2:
			System.out.println("겨울입니다."); break;
		case 3: case 4: case 5:
			System.out.println("봄입니다."); break;
		case 6: case 7: case 8:
			System.out.println("여름입니다."); break;
		case 9: case 10: case 11:
			System.out.println("가을입니다."); break;
		default:
			System.out.println("해당하는 계절이 없습니다."); break;
		} 
	}
	
	
	public void practice6() {
	 /* 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
	  
		단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		비회원은 게시글 조회만 가능합니다. 
		
		ex.
		권한을 확인하고자 하는 회원 등급 : 관리자
		회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회	*/
	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 등급: ");
		
		String level = sc.nextLine();
		
		String result ="";
	
		switch (level) {
		
	
		case "관리자": 
			result+="회원관리, 게시물 관리, ";
		case "회원" : 
			result+="게시글 작성, 댓글 작성, "; 
		case "비회원" :
			result+="게시글 조회"; break;
	
			
		}
		
		System.out.println(result);
	
	}
	
	
	public void practice9 () {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("중간고사 점수 입력: ");
		int mid = sc.nextInt();
		sc.nextLine();
		
		System.out.print("기말고사 점수 입력: ");
		int fin = sc.nextInt();
		sc.nextLine();
		
		System.out.print("과제점수 입력: ");
		int hw = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출석 회수 입력: ");
		int pre = sc.nextInt();
		sc.nextLine();
		
		System.out.println("\n============ 결과 ============\n");
		
		double resmid = 0.2*mid;
		double resfin = 0.3*fin;
		double reshw = 0.3*hw;
		double respre = pre;
		double ressum = resmid+resfin+reshw+respre;
		
		System.out.println("중간고사 점수(20): "+ resmid);
		System.out.println("기말고사 점수(30): "+ resfin);
		System.out.println("과제 점수 (30): "+ reshw);
		System.out.println("출석 점수 (20): "+ respre);
		System.out.println("총점: "+ ressum);
		
		if (pre>=14) {
			if (ressum>=70) {
				
				System.out.println("PASS");
				
			} else {
				System.out.println("FAIL [점수 미달]");
				
			}
			
		} else {
			System.out.println("Fail [출석 회수 부족 (" + pre+ "/" + 20);
		}
	}
	
	public void practice10 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요. ");
		
		System.out.println("\n1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합/불합");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 학인");
		System.out.println("9. P/F");
		System.out.println("10. A_if 클래스의 example1");
		
		System.out.print("\n선택: ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		A_If aif = new A_If();
		
		switch (menu) {
		
		case 1: practice1(); break; // 같은 클래스 내의 메소드끼리는 메소드명을 작성하는 것만으로도 호출이 가능!!
		case 2: practice2(); break;
		case 3: practice3(); break;
		case 4: practice4(); break;
		case 5: practice5(); break;
		case 6: practice6(); break;
		case 9: practice9(); break;
		case 10: aif.example1(); break; // 다른 클래스 메소드 호출 (이 때는 A_If 클래스를 어디에라도 따로 만들어야 한다!!!!!!!!!!!!!!!281라인 참고!!)
		
		
	}
		
		
	}



		
	
}
		
	







