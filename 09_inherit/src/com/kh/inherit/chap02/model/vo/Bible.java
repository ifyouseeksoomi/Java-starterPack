package com.kh.inherit.chap02.model.vo;

public final class Bible extends Book { // 상속 불가 클래스 (final class는 자식 클래스 가질 수 없다)
	public String ImprovedFaith() { // 신앙심 향상
		return "신앙심 +1";
	}
	
	
} 
