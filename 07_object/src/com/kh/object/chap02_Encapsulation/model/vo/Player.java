package com.kh.object.chap02_Encapsulation.model.vo;

// vo(Value Object): 값(데이터)을 보관할 수 있는 객체를 만들기 위한 클래스

public class Player { // 운동선수를 추상화한 클래스
	
	// ----- 속성 -----
	// * 캡슐화 원칙: 클래스의 멤버 변수(필드)에 private를 붙여 외부로부터의 직접 접근을 차단하는 것
	
	// public String name; 			// 이름 (캡슐화 미적용)
	private String name; 			// 이름
	private String event; 			// 종목
	private String uniform;			// 유니폼
	private boolean kookdae; 		// 국대 여부
	
	// ----- 기능 -----
	// 클래스 내부에 만들 수 있는 기능의 종류
	// 1) 멤버 변수(필드)를 이용한 연산 처리를 하는 기능
	// 2) 속성(필드)를 외부에서 간접 접근할 수 있는 방법			// 참고: 속성=멤버변수=필드
	// 	  --> getter / setter 메소드  					// 필드마다 getter setter는 한 쌍씩 존재
	
	
	// name에 대한 get/setter 작성
	
	// ""getter"": 객체의 값을 ""외부로 반환""하는 ""기능을 구현""한 ""메소드""
	// 외부에서 접근할 수 있도록 ""public으로"" 선언해야 함
	
		public String getName() {	
		// --> String (반환형): 메소드 수행 후 ""반환되는"" 값의 자료형
		
			// return: 메소드 종료 시 호출한 곳으로 돌려보내는 값을 작성.
			return name; 
			// 외부에서 getName() 호출 시 객체에 저장되어있는 name 반환
			
		}
		
	// ""setter"": 객체의 값을 ""기록""하는 기능을 구현한 메소드
	// 외부에서 접근할 수 있도록 ""public으로"" 선언
			
		public void setName(String name) {
							// 바로 이 괄호속에 들어가는 것이 매개변수(파라미터)
							// 메소드 호출 시 전달되는 값을 받아옴
							// 해당 기능 수행 시 필요한 값
			// name= name;
			// 매개변수에 매개변수를 넣겠다는게 아니라
			
			this.name = name;
			// 여기서의 this는 "이 클래스의" or "현재 객체의" 뜻. 즉 ""현재 객체의 시작 주소""를 가리킴
			// 좌변의 name과 우변의 name 색깔 다른 것을 보면 알 수 있음
			
		
		}
		
		// event get/setter 작성해보기
		
		// ""getter""
		
		// public 반환형 get변수명() { 					// 변수명 시작은 대문자로 할 것
		// 	 return 변수명(필드명);
		// }
		
		public String getEvent() {
			return event; 
		}
		
		// ""setter""
		
		// public void set변수명(매개변수) { 			// 변수명 시작은 대문자로 할 것
							  // 매개변수는 set하려는 필드와 같은 자료형 변수명 작성
		// 		this.필드명 = 매개변수명;
		// }
		
			public void setEvent(String event) {
				this.event = event;
			}

		
		// uniform, kookdae getter/setter 작성해보기
		public String getUniform () {
			return uniform;
		}
			public void setUniform(String uniform) {
				this.uniform = uniform;
			}
		
			
		public boolean getKookdae () {
			return kookdae;
		}
			public void setKookdae(boolean kookdae) {
				this.kookdae = kookdae;
			}
		



}
	
	


