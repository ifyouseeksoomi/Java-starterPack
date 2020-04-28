package com.kh.object.chap04_field.model.service;

import com.kh.object.chap04_field.model.vo.Field;

public class FieldService {
	public void example1 () {
		
		Field f1 = new Field();
		
		f1.number = 100;
		f1.setCh('A');
		
		System.out.println("f1.number: " + f1.number);
		System.out.println("f1.getCh(): " + f1.getCh());
		
		Field f2 = new Field();
		
		f2.number = 200;
		f2.setCh('Z');
		
		System.out.println("f2.number: " + f2.number);
		System.out.println("f2.getCh(): " + f2.getCh());

		// 여기서 내 예상대로라면 이 아래 코드는 100, A가 나와야하는데 아니다. 200, A가 나옴. 왜지?
		System.out.println("f1.number: " + f1.number);
		System.out.println("f1.getCh(): " + f1.getCh());
		
		// 여기까지만 듣고 갔다는 이야기 ㅎㅎ
		
		
		
	} 
}
