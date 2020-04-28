package com.kh.inherit.chap01.model.vo;

public class Car extends Product {

	private String engine;
	private String colour;
	private String carType;
//	private String pName;
//	private int price;
	
	// �⺻ ������
	public Car() {}

	// �Ű������� �ִ� ������
	public Car(String engine, String colour, String carType, String pName, int price) {
		// super();	// �θ� �⺻ ������ 
		super(pName, price); // �θ��� �Ű����� �ִ� ������ ȣ��
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
	
	// ��� �ʵ� ���� ��ȯ
	public String selectField () {
		return engine + " / " + colour + " / " + carType + " / " 
			   + super.selectField(); 
			   // --> pName + + " / " + price
		
		
		// super ���� ����
		// - �ڽ� ��ü ���� �θ� ���� �κ��� �����ϴ� ����
		// - �θ��� �ʵ�� �޼ҵ忡 �����ؾ� �� �� ���
									
	} 
	
}
