package com.kh.object.chap06_constructor.model.vo;

public class UserME {
	
	
	// * 만약 클래스 내부에 생성자가 작성되지 않은 경우 
	// JVM에 의해서 컴파일 단계에서 기본 생성자가 자동으로 추가된다 : public User() {}
	
	private String userId = null;
	private String userPwd = null;
	private String userName;
	private int age;
	private char gender;
	
	/* 오버로딩(Over Loading, 과적)
	 * 한 클래스 내에서 동일한 이름의 메소드를 여러개 작성하는 기법
	 * 
	 * - 오버로딩의 조건
	 * 0. 메소드명이 동일해야 함
	 * 1. 매개변수의 개수 (다른)
	 * 2. 매개변수의 타입 (다른)
	 * 3. 매개변수의 순서 (다른)
	 *
	 * 0조건(필수) + 위 1~3 세 가지 중 ""하나라도"" 충족 시 오버로딩 가능
	 */
	
	// 매개변수 있는 생성자
	// 객체 생성과 동시에 매개변수로 전달받은 값으로, 필드를 초기화하는 목적으로 사용
	public UserME (String userId, String userPwd, String userName, int age, char gender) {
		this(userName, age, gender);
		//this(userId, userPwd);		// this 생성자는 무조건 첫 줄만 인식! --> 두 줄 이상 작성 불가
		
		// this() 생성자
		// - 같은 클래스에서 다른 생성자를 호출할 때 사용
		// ** this() 생성자는 반드시 호출하려는 생성자의 제일 첫번째줄에 작성되어야 한다.
		
		// this() 생성자 사용 시 장점
		// 1) 중복 코드 제거
		// 2) 코드 길이 감소
		
		this.userId= userId;
		this.userPwd = userPwd;
		/*this.userName= userName;
		this.age =age;
		this.gender = gender;*/
	}

	public UserME (String userId, String userPwd) {
		this.userId = userId; // "여기에다가 매개변수로 받아온(보라색) 유저아이디를 초기화하겠다"
		this.userPwd = userPwd; 
	}
	
	// 매개변수의 개수가 다르므로 오버로딩이 성립
	public UserME (String userName, int age, char gender) {
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}
	
	// 위에것과 매개변수의 순서만 바뀌었더니 또 오버로딩이 성립
	public UserME (char gender, String userName, int age) {
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}
	
	// 위에 위에것과 매개변수의 개수는 같지만, 타입이 다르므로 오버로딩이 성립
	public UserME (String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	// 위에 것과 순서는 다르다? 그렇지 않다 어차피 이름 안보고 String만 봄! 
	// 즉 순서, 타입, 갯수 모두 일치 --> 오버로딩 불가
	/* public User (String userName, String userId, String userPwd) {
			this.userId = userId;
			this.userPwd = userPwd;
			this.userName = userName;
	} */

	
	public UserME() {
		
	}
	
	
	


	
	
}
