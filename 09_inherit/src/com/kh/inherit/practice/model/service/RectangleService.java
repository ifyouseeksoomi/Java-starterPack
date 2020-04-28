package com.kh.inherit.practice.model.service;

import com.kh.inherit.practice.model.vo.Rectangle;

public class RectangleService {

	private Rectangle r = new Rectangle ();
		
		public String calcArea(int x, int y, int width, int height) {
			
			// 객체 필드 초기화
			r.setX(x);
			r.setY(y);
			r.setWidth(width);
			r.setHeight(height);
			
			int area = width*height;
			
			return "사각형 넓이: " + r + " / " + area;
			
		}
		
		public String calcPerimeter(int x, int y, int width, int height) {
			
			// 객체 필드 초기화
			r.setX(x);
			r.setY(y);
			r.setWidth(width);
			r.setHeight(height);
			
			int perimeter = 2*(width+height);
			
			return "사각형 둘레: " + r + " / " + perimeter;
					
		}
			
		
}
		
	
	
	
	

