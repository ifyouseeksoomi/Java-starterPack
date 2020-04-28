package com.kh.poly.chap02.ex1.model.service;

import com.kh.poly.chap02.ex1.model.vo.Bird;
import com.kh.poly.chap02.ex1.model.vo.Chicken;

public class Chap01Service {
	public void example1() {
		
		// 자식 참조변수로 자식 객체 참조해보기
		Chicken c = new Chicken();
		
		// 부모 참조변수로 부모 객체 참조해보기
		// Bird b = new Bird ();	// Bird가 추상 클래스라서(미완성 클래스니깐) 객체 생성이 불가능하니깐 에러
		
		// 부모 참조 변수로 자식 객체를 참조해보기 (다형성)
		Bird b2 = new Chicken();
		
		
		
	}

}
