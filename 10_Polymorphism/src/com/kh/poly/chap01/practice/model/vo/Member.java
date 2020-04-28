package com.kh.poly.chap01.practice.model.vo;

public class Member {

	private String name;
	private int age;
	private char gender;
	private int couponCount; // =0 안써도 JVM에 의해서 기본적으로 0 제공하므로 없어도 똑같다
	// private를 쓰는 이유: 외부로부터의 직접접근을 차단하는 encapsulation의 효과 (간접접근할 수 있도록 게터쎄터)
	
	public Member () {}
	public Member (String name, int age, char gender) {
		// 보아하니 쿠폰카운트는 들어가지 않는다: 쿠폰카운트는 입력을 하지 않겠다는 의미 << 이런 것을 잘 체크해야한다
		this.name = name;
		this.age = age;
		this.gender = gender;	
		// this 참조변수: 현재 객체(이 객체)의 시작 주소 참조하시오 
		// ★ this() 생성자: 내 안에 있는(현재 객체에 있는) 다른 생성자 호출하고 싶을 때 쓰는 것
		//				실제 내 클래스 이름 써서 Member() 이런식으로 하면 X
		// super: 상위 클래스 or 부모 클래스 의 시작 주소를 가리키는 참조 변수
	}
	
		
	public String getName () {
		return name;
	} // getter: 외부에서 필드값을 얻어가므로 반환형이 꼭 필요하다
	
	public void setName(String name) {
		this.name = name;
	} // setter : 세팅 당하는 것이므로 돌려보낼 것이 없으니 반드시 void, 좌변 현재 객체의(this.) ~에 우변 ~를 넣겠다.

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getCouponCount() {
		return couponCount;
	}
	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	} 
	
	// object이 toString을 제공하는 목적: "오버라이드해서 객체가 가지고 있는 필드 정보 제공하라"는 의미
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", couponCount=" + couponCount + "]";
	}
	
}
