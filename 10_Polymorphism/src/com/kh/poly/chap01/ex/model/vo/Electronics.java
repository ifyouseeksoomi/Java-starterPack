package com.kh.poly.chap01.ex.model.vo;

public class Electronics { 	// 부모
	private boolean power; 	// 전원
	private String brand;	// 제조사
	private String sNum;	// 시리얼넘버
	
	// 기본 생성자
	public Electronics () {}

	// 매개변수 있는 생성자
	public Electronics(boolean power, String brand, String sNum) {
		super();	
		this.power = power;
		this.brand = brand;
		this.sNum = sNum;
	}

	// 게터쎄터
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getsNum() {
		return sNum;
	}

	public void setsNum(String sNum) {
		this.sNum = sNum;
	}

	// 투스트링 오버라이딩
	@Override
	public String toString() {
		return "power=" + power + ", brand=" + brand + ", sNum=" + sNum ;
	
	
	
}
}
