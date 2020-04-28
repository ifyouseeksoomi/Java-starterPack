package com.kh.object.chap01_abstraction.model.service;

import com.kh.object.chap01_abstraction.model.vo.Student;

public class AbstractionService {

	public void createStudent () {		// 메소드의 이름이 create Student
		 
		Student std = new Student (); 	// 학생 객체 생성
		
		// 비어있는 학생 객체(std)에 속성(정보) 입력
		std.name = "황수미";
		std.age = 31;
		std.gender ='여';
		std.studentNumber = 201003878;
		std.schoolName = "KH";
		std.grade = "A+";
		
		// 기능 수행
		std.attendance();
		std.study(); 
		std.test();
		std.lunch();
		
		System.out.printf
		("%s 학생은 %d세 %c자이며 학번은 %d 입니다.", std.name, std.age, std.gender, std.studentNumber);
		
		
		
	}
	
}
