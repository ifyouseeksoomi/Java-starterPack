package com.kh.object.chap01_abstraction.model.service;

import com.kh.object.chap01_abstraction.model.vo.Student;

public class AbstractionService {

	public void createStudent () {		// �޼ҵ��� �̸��� create Student
		 
		Student std = new Student (); 	// �л� ��ü ����
		
		// ����ִ� �л� ��ü(std)�� �Ӽ�(����) �Է�
		std.name = "Ȳ����";
		std.age = 31;
		std.gender ='��';
		std.studentNumber = 201003878;
		std.schoolName = "KH";
		std.grade = "A+";
		
		// ��� ����
		std.attendance();
		std.study(); 
		std.test();
		std.lunch();
		
		System.out.printf
		("%s �л��� %d�� %c���̸� �й��� %d �Դϴ�.", std.name, std.age, std.gender, std.studentNumber);
		
		
		
	}
	
}
