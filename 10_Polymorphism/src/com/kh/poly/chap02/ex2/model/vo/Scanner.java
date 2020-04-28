package com.kh.poly.chap02.ex2.model.vo;

public interface Scanner extends KoreaElectronics {
	// 자바에서 클래스는 다중상속 안됐지만 인터페이스끼리의 다중상속은 가능~! (AllinOnePrinter만드는 클래스로 가보기)

	public abstract void scan (); // 스캔 기능
	
}
