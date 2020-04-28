package com.kh.object.chap02_Encapsulation.model.service;

import com.kh.object.chap02_Encapsulation.model.vo.Player;

public class EncapsulationService {

	public void createPlayer() {
		
		Player p1 = new Player();
		// player 객체 생성
		
		// p1.name = "홍길동";
		// p1.event = "LOL"; 			
			// 에러발생: name, event는 private한 속성으로 적었으므로 자동 완성기능 X. 외부 접근이 차단되어 있음.
		
		// setter를 이용하여 p1에 이름 설정
		p1.setName("홍길동");
		p1.setEvent("육상");
		p1.setUniform("나이키");
		p1.setKookdae(true);
		
		// getter를 이용하여 p1에 세팅된 name 얻어오기
		System.out.println("p1의 이름: " + p1.getName());
		System.out.println("p1의 종목: " + p1.getEvent());
		System.out.println("p1의 유니폼: " + p1.getUniform());
		System.out.println("p1의 국대여부: " + p1.getKookdae());
	}
}

