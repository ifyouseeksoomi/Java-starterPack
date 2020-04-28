package com.kh.inherit.chap01.model.vo;

public class Product {
	// Computer, Cup, Car 클래스에서 공통된 요소 추출하여 부모 클래스 생성
	
	private String pName;
	private int price;
	
	// 기본 생성자
	public Product() {}

	// 매개 변수 있는 생성자
	public Product(String pName, int price) {
		super();
		this.pName = pName;
		this.price = price;
	}

	// 공통된 getter & setter 뽑아내기 
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// selectfield 작성
	public String selectField () {
		return pName + " / " + price;
	 }
	
	
	// 이렇게 공통부분 추출이 끝나면, 이 클래스를 부모로 잡는다.
	
}
