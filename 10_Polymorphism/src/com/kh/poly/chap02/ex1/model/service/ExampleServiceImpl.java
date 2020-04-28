package com.kh.poly.chap02.ex1.model.service;

public class ExampleServiceImpl implements ExampleService {

	@Override
	public String javaFeatures() {
		return "객체지향 언어 / GC으로 메모리 관리 / 운영체제 독립적(이식성) / 사용하기쉽다는데 나는 아님  등등" ;
	}

	@Override
	public String defineInheritance() {
		return "다른 클래스가 가지고 있는 멤버를 새로 작성할 클래스에서 직접 만들지 않고 \n새 클래스가 자신의 멤버처럼 사용할 수 있는 기능"
				+ "\n1) 모든 클래스는 Object 클래스의 후손이며" +
				"\n2) 부모 클래스의 생성자와 초기화 블록은 상속 되지 않고"
				+ "\n3) 부모의 private 멤버는 상속은 되나 직접 접근은 안된다";
	}

	@Override
	public String definePolymorphism() {
		return "<여러개의 형태를 갖는다>는 뜻으로, 상속을 이용한 기술" 
				+"\n상속 관계에 있는 여러 타입의 자식 객체를 참조할 수 있는 기술" 
				+"\n종류로는 업캐스팅과 다운캐스팅이 있다."
				+"\n업캐스팅은 부모 타입의 참조형 변수가 모든 자식 타입 객체의 주소를 참조하는 것"
				+"\n다운캐스팅은 이미 자식 객체 주소를 받은 부모 참조형 변수가 자식의 멤버를 참조해야 할 때," 
				+"\n부모 클래스 타입의 참조형 변수를 자식 클래스타입으로 형변환 하는 것" 
				+"\n자동으로 이루어지는 작업이 아니므로 반드시 자식 타입을 앞에 ()로 명시해야 한다";
	}

	@Override
	public String defineAbstractClass() {
		return "";
	}

	@Override
	public String defineInterface() {
		return null;
	}

	@Override
	public String gugudan(int start, int end) {
		return null;
	}

	@Override
	public String reverseStar(int input) {
		return null;
	}

}
