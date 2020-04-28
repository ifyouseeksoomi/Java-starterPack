package com.kh.inherit.chap01.model.vo;

public class Cup extends Product {

	private String brand;
	private double volume;
//	private String pName;
//	private int price;    					// 왜 pName, price 부분을 주석처리하냐면 이제 공통뽑아서 product 클래스 짰잖아
	
	// 기본 생성자
	public Cup() {}

	// 매개변수 있는 생성자							// 생성자의 역할: 작성자이자 객체가 생성되면 필드의 용도를 작성하기 위한 곳
											// 매개변수 있는 생성자의 역할은 바로 초기화하기 위함
	public Cup(String brand, double volume, String pName, int price) {
		super();
		this.brand = brand;
		this.volume = volume;
		setpName(pName);
		setPrice(price);
			// 왜 앞에 this. 이런게 없냐면 이미 상속받아서 pName은 이제 자기것처럼 쓸 수있게 되었기 때문에!
			// 부모로부터 상속받은 pName과 price는 접근제한자가 private이므로 직접 접근할 수는 없지만 
			// 부모로부터 상속받은 간접 접근방법인 setPname(), setPrice()를 이용하여 pName과 price를 초기화할 수 있다.
//		this.pName = pName;
//		this.price = price;
	}

	// getter / setter 
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	

//	public String getpName() {
//		return pName;
//	}
//
//	public void setpName(String pName) {
//		this.pName = pName;
//	}
//
//	
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}

	public String selectField() {
		return brand + " / " + volume + " / " + getpName()+ " / " +getPrice(); 				 /* + " / " + pName + " / " + price */
		// getpName, getPrice: 부모클래스에 있는 거라, 직접접근으로 하면 안되고(즉 겟 없이 하면 ㄴㄴ) 겟피네임 겟 프라이스로 할 것
	}
	}
