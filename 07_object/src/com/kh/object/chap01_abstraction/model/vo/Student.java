package com.kh.object.chap01_abstraction.model.vo;

// 컴퓨터 내부에 학생이라는 객체를 만들기 위한 설계도(클래스) 작성
// 클래스 작성 시 객체지향 언어의 특징 중 하나인 추상화가 적용되어야 함.

public class Student { // 학생을 추상화한 클래스
	
	// ----- 속성 -----
	// 이름, 나이, 성별, 학번, 학교, 성적 (학생이라면 가져야할 속성만 적은 것)
	// 항상 메소드 아래 변수 쓰는데 클래스 바로 아래 써보기는 처음 --> 이럴 때는 앞에 private 쓰는게 규칙

	public String name;		// 이름
	public int age;			// 나이
	public char gender;		// 성별
	public int studentNumber; 	// 학번
	public String schoolName; 	// 학교
	public String grade; 		// 성적
	
	// ----- 기능 ----- (멤버 메소드: 필드의 연산처리를 목적으로 할 때, 클래스 내부에 작성하며, 기본이 public)	
	// 공부, 출석, 시험, 급식, 
	public void study () {
		System.out.println(name + " 학생이 공부를 시작했습니다.");
	}
	
	public void attendance() {
		System.out.println(name + " 학생이 "+ schoolName + "학교에 출석했습니다.");
		
	}
	
	public void test () {
		System.out.println(name + " 학생의 성적은" + grade + "입니다.");
	
	}
	
	public void lunch() {
		System.out.println(name + "학생이 급식을 먹습니다. ");
		
		
	}
	
	
	
	
	

}
