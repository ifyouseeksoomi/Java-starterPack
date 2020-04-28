package com.kh.inherit.chap02.model.vo;

public class NewBible /*extends Bible*/ {
						// final 클래스는 상속 불가 : 그렇다면 새로 써야할듯
						// final 메소드는 오버라이드가 불가
	
	public static final String stealMoney() {
		return "소지금 -10%";
	}
	

}
