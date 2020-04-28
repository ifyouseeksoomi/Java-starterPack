package com.kh.poly.chap02.ex2.model.vo;

public abstract class AllinOnePrinter implements Printer, Scanner {
	// 인터페이스는 다중상속이 가능하다! , 로 이어쓰면 돼 위에처럼
	// 클래스간의 상속에서만 단일 상속 
	
	// 추상 클래스
	// --> 추상 메소드가 ""0개 이상"" 존재하는 클래스 (없어도 된다는 뜻임) 
	// --> 즉 추상 메소드가 하나도 없는데도 추상클래스라 부를 수 있음
	
	private String brand; // 제조사
	private String pName; // 제품명
	
	public AllinOnePrinter() {} // 기본 생성자
	// 추상 클래스, 인터페이스를 이용하여 객체를 만들 수 있다?  X
	// why? 미완성 클래스로는 객체 생성이 불가하기 때문에~!
	
	// 아니 근데 추상클래스에 왜 생성자를 작성?
		// 이 AllinOnePrinter를 상속 받은 어떤 자식클래스가 내부에 부모부분을 만들어야할테고
		// 그것을 위해서는 생성자가 반드시 필요하기 때문에 써준 것이다
		// --> 즉 자식 객체 생성 시 내부에 부모 ""부분""을 생성하기 위해서 필요는 하나, 이를 이용하여 단일 부모 ""객체""는 만들 수 없다
		
	public AllinOnePrinter(String brand, String pName) {
		super();
		this.brand = brand;
		this.pName = pName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() { 
		return "AllinOnePrinter [brand=" + brand + ", pName=" + pName + "]";
	}
	
	
	
	
}
