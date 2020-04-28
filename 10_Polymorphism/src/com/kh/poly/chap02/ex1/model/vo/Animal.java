package com.kh.poly.chap02.ex1.model.vo;

public interface Animal {
	
	// 인터페이스의 필드는 무조건 public static final 
	// public static final int SOUL =1;
	
	// 인터페이스의 필드는 묵시적으로(앞에 안보이지만) public static final
	int SOUL =1;
	
	
	// 인터페이스의 메소드는 무조건 public abstract 입니다
	public abstract String breath();
	
	// 인터페이스의 메소드는 묵시적으로(앞에 없지만) public abstract 
	String eat();
	
	
	// 인터페이스를 상속하는 키워드
	/* 
	 * 인터페이스를 '클래스'가 상속: implements (""구현하다""의 뜻. 강제성이 존나 쎔)
	 * 인터페이스를 '추상 클래스'가 상속: implements
	 * --> 결론: 뭐가됐건 ""클래스로"" 인터페이스 상속 시 무조건 implements!
	 * 
	 * 인터페이스를 인터페이스가 상속: extends 
	 * (왜냐면 인터페이스 자체가 존나 미완성이니까 미완성의 부모를 미완성의 자식이 받아서 더 큰 미완성의 하나가 되는 것)
	 * 
	 */
	
	

}
