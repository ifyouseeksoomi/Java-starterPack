package com.kh.inherit.practice.model.service;

import com.kh.inherit.practice.model.vo.Circle;

public class CircleService {

	private Circle c = new Circle ();
	
	public String calcArea(int x, int y, int radius) {
	
		// ��ü�ʵ� �ʱ�ȭ
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double area = Math.PI * radius * radius;
		
		return "�� ����: " + c + " / " + area;

	}
	
	

	// calcCircum
	public String calcCircum(int x, int y, int radius) {
		
		// �� �ѷ� ��� ���
		
		// ��ü�ʵ� �ʱ�ȭ
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		// �� �ѷ�
		double circum = 2 * Math.PI * radius;
		
		return "�� �ѷ�: " + c + " / " + circum;
		
		// ��
		
		
	}
 }
