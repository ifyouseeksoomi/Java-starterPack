package com.kh.poly.chap01.model.vo;

public class Bentley extends Car {
	
	public String TakeOutUmbrella () {
		return "우산 꺼내기";
	}

	// 부모(Car)의 메소드 drive를 재정의(오버라이드)
	@Override
	public String drive() {
		return "날아다님";
	}
	// 컴파일 단계에서는 부모의 drive() 메소드와 바인딩 되어있다가, 
	// 실제 실행 당시에는 오버라이딩된 자식의 drive()와 바인딩이 된다 == 이것이 ""동적 바인딩"" 

	
}
