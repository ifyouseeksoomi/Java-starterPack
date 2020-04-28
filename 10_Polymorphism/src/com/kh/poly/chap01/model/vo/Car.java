package com.kh.poly.chap01.model.vo;

public class Car {
	private String engine;
	private String colour;
	
	public Car () {}

	public Car(String engine, String colour) {
		super();
		this.engine = engine;
		this.colour = colour;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", colour=" + colour + "]";
	}
	
	// 바인딩 확인
	// 바인딩이란? 실제 실행할 메소드와 호출되는 메소드를 연결하는 것
	
	public String drive () { 
		return "달리다."; 
	}
	
	// 다형성이 적용된 상태에서 ex) Car c = new Bentley();
	// c.drive()를 호출하면 컴파일 단계에서는 Car에 있는 drive()와 바인딩을 진행 : 이게 바로 ""정적 바인딩"" (코드만보면 정말, 카에 있는 드라이브를 불러라 이거니까)
	
	
	
	
	
	
	
}
