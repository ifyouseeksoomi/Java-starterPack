package com.kh.inherit.chap01.model.service;

import com.kh.inherit.chap01.model.vo.Car;
import com.kh.inherit.chap01.model.vo.Computer;
import com.kh.inherit.chap01.model.vo.Cup;

public class InheritService {
	public void example1 () {
		
		// product를 상속받은 Computer 객체 생성
		Computer com = new Computer ();
		
		// Computer만의 메소드
		com.setCpu("i7 - 9700k");
		com.setRam(32);
		
		// Product로부터 상속받은 메소드
		com.setpName("삼성 오딧세이");
		com.setPrice(2000000);
		
		System.out.println(com.getCpu());
		System.out.println(com.getRam());
		System.out.println(com.getpName());
		System.out.println(com.getPrice());
		
		// Cup 상속 테스트
		System.out.println("=============================");
		
		Cup cup = new Cup("스타벅스", 1, "2020 벚꽃에디션", 33000);				// 매개변수 있게 초기화
		
		System.out.println(cup.getBrand());
		System.out.println(cup.getVolume());
		System.out.println(cup.getpName());
		System.out.println(cup.getPrice());

		// System.out.println(cup.selectField);
		
		// Car 상속 테스트
		System.out.println("=============================");

		Car car = new Car ("v6", "핑크색", "트럭", "포터  벚꽃 에디션", 30000000);
		
		System.out.println(car.getEngine());
		System.out.println(car.getColour());
		System.out.println(car.getCarType());
		System.out.println(car.getpName());
		System.out.println(car.getPrice());
		
		System.out.println(car.selectField()); // car.selectField가 지금 car에도 있고 product에도 있음. 똑같은 이름. 이럴 때는 자식이 실행된다.
	}
	
}
