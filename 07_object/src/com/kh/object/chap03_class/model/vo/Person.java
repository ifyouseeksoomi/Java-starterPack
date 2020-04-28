package com.kh.object.chap03_class.model.vo;

public class Person {
	
	// ----- 필드(멤버 변수) -----
	private String name; 
	private int age;
	private char gender;
	private String address;
	private double height;
	
	
	// ----- 메소드(멤버 메소드) -----
	
	// getter/setter 한 쌍씩 만들어보기
	// ex. name
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// 내가 해보기
	// age
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// gender
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	// address
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	// height
	public double getHeight () {
		return height;
	}

	public void setHeight (double height) {
		this.height= height;
	}
	
	
	public void walk() {
		System.out.println(name +  "이 직립보행을 함.");
	}
	
	// 객체가 가지고 있는 모든 필드의 정보를 반환하는 메소드 
	public String selectInformation () {									// public void는 반환값이 없다는 이야기라서 지금 쓰면 안된다. 
																			// 뒤에 return에서 str 나오려면 걔가  String형이니까 String으로 해야함
		String str = name + " / " + age + " / " + gender + " / " + 
					 address + " / " + height;
		
		return str;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
