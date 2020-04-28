package com.kh.inherit.chap01.model.service;

import com.kh.inherit.chap01.model.vo.Car;
import com.kh.inherit.chap01.model.vo.Computer;
import com.kh.inherit.chap01.model.vo.Cup;

public class InheritService {
	public void example1 () {
		
		// product�� ��ӹ��� Computer ��ü ����
		Computer com = new Computer ();
		
		// Computer���� �޼ҵ�
		com.setCpu("i7 - 9700k");
		com.setRam(32);
		
		// Product�κ��� ��ӹ��� �޼ҵ�
		com.setpName("�Ｚ ��������");
		com.setPrice(2000000);
		
		System.out.println(com.getCpu());
		System.out.println(com.getRam());
		System.out.println(com.getpName());
		System.out.println(com.getPrice());
		
		// Cup ��� �׽�Ʈ
		System.out.println("=============================");
		
		Cup cup = new Cup("��Ÿ����", 1, "2020 ���ɿ����", 33000);				// �Ű����� �ְ� �ʱ�ȭ
		
		System.out.println(cup.getBrand());
		System.out.println(cup.getVolume());
		System.out.println(cup.getpName());
		System.out.println(cup.getPrice());

		// System.out.println(cup.selectField);
		
		// Car ��� �׽�Ʈ
		System.out.println("=============================");

		Car car = new Car ("v6", "��ũ��", "Ʈ��", "����  ���� �����", 30000000);
		
		System.out.println(car.getEngine());
		System.out.println(car.getColour());
		System.out.println(car.getCarType());
		System.out.println(car.getpName());
		System.out.println(car.getPrice());
		
		System.out.println(car.selectField()); // car.selectField�� ���� car���� �ְ� product���� ����. �Ȱ��� �̸�. �̷� ���� �ڽ��� ����ȴ�.
	}
	
}