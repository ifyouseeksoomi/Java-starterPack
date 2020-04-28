package com.kh.inherit.chap01.model.vo;

// Computer 클래스가 Product 클래스를 상속
// 상속 키워드: extends
// 부모의 멤버 + 자식의 멤버 -> 부모보다 몸집이 확장(연장)됨

public class Computer extends Product { // 같은 패키지 안에 있어서 임포트 필요 X
	private String cpu;
	private int ram;
//	private String pName;
//	private int price;
	
	// 기본생성자
	public Computer() {
		super (); // '상위'의 의미로, 컴퓨터를 만들 때 product를 만들고 그 다음에 컴퓨터를 만들어라'의미 // + 
				  // 기본생성자는 작성하지 않아도 JVM에 의해 컴파일 단계에서 자동 추가된다.
	}

	// 생성자 자동완성 
	// alt + shift + s -> o (Generate Constructor using Fields... )
	public Computer(String cpu, int ram, String pName, int price) {
		super();
		this.cpu = cpu;
		this.ram = ram;
//		this.pName = pName;
//		this.price = price;
	}

	// getter / setter 
	// alt + shift + s -> r
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

//	public String getpName() {
//		return pName;
//	}
//
//	public void setpName(String pName) {
//		this.pName = pName;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
	

	// 필드 정보 모두 반환하는 메소드
	public String selectField() {
		return cpu + " / " + ram;
	// + pName + " / " + price;
	}
	

}
