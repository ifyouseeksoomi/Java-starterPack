package com.kh.poly.chap02.ex2.model.vo;

public interface KoreaElectronics {

	public static final int VOLT = 220;
	
	// 인터페이스는 묵시적으로 public abstract 메소드라서 둘째줄처럼 void만 써도 돼
	public abstract void powerOn(); 
	void powerOff(); 
	
}
