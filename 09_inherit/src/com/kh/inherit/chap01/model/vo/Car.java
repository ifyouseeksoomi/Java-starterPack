package com.kh.inherit.chap01.model.vo;

public class Car extends Product {

	private String engine;
	private String colour;
	private String carType;
//	private String pName;
//	private int price;
	
	// 기본 생성자
	public Car() {}

	// 매개변수가 있는 생성자
	public Car(String engine, String colour, String carType, String pName, int price) {
		// super();	// 부모 기본 생성자 
		super(pName, price); // 부모의 매개변수 있는 생성자 호출
		this.engine = engine;
		this.colour = colour;
		this.carType = carType;
//		this.pName = pName;
//		this.price = price;
	}

	// getter & setter
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

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

//	public String getpName() {
//		return pName;
//	}
//
//	public void setpName(String pName) {
//		this.pName = pName;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	// 모든 필드 정보 반환
	public String selectField () {
		return engine + " / " + colour + " / " + carType + " / " 
			   + super.selectField(); 
			   // --> pName + + " / " + price
		
		
		// super 참조 변수
		// - 자식 객체 내에 부모 시작 부분을 참조하는 변수
		// - 부모의 필드와 메소드에 접근해야 할 때 사용
									
	} 
	
}
