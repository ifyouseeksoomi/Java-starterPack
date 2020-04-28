package com.kh.poly.chap02.ex1.model.vo;

public abstract class Bird implements Animal { // 
	public static final int BIRD_LEG =2;
	private String wingType; 
	
	// 기본 생성자
	public Bird () {}
	// 생성자를 가질 수 있으나 해당 생성자로 직접 객체 생성은 하지 못함
	// 근데도 생성자 만드는 이유는 이담에 super()해서 상속할라고 그러는거임 (자식이 super() 생성자를 사용해야되므로!)
	
	// 날 수 있거나, 날 수 없거나, 날아는 다니나 모양이 다르거나 할 수 있다
	// --> 구체적이지 않고 불확실함 --> 추상 메소드로 표현
	public abstract String fly(); // 이거 있으니까 이제 이건 추상 클래스.
	
	public String flappingWing() {
		return "날개를 파닥거림";
	}

	// 게터쎄터 버드레그 안만들어도되는게 저거는 이미 퍼블릭스태틱파이널이다
	public String getWingType() {
		return wingType;
	}

	public void setWingType(String wingType) {
		this.wingType = wingType;
	}

	
	
	
	
}
