package com.kh.exception.chap04.model.service;

public class InputZeroException extends Exception {
	// 사용자 정의 예외 생성 방법
	// --> Exception또는 그 후손 클래스 상속받으면 됨
	
	// 만약 checked Exception으로 만들 경우
	// 보통 Exception상속받음
	
	// 만약 Unchecked Exception으로 만들 경우
	// 보통 RuntimeException상속받음
	
	// 생성자 필수
	public InputZeroException() {
		super();
	}
	
	public InputZeroException(String msg) {
		super(msg);
	}
	
	
}
