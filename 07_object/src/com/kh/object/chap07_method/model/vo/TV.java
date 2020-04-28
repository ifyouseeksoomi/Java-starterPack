package com.kh.object.chap07_method.model.vo;

public class TV {
	private String screen;
	private boolean power;
	public static int voltage; // 정격전압은 모두에게 공유가 가능해야 하므로 static

	// 기본 생성자
	public TV() {}
	
	// 매개변수 있는 생성자
	public TV(String screen, boolean power, int voltage) {
		this.screen = screen;
		this.power = power;
		this.voltage = voltage;
	}

	// getter/setter 단축키: alt+shift+s -> generate getter and setter
	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	public static void test () {
		System.out.println("test() 메소드는 static 메소드입니다. ");
		
	}
	
	
	
	
	
	
	
}
