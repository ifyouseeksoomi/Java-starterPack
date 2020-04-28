package com.kh.object.practice.run;

import com.kh.object.practice.model.service.BookService;

public class PracticeRun {

	// + main(args : String[]) : void
	// 클래스 다이어그램에서 밑줄은 static을 의미한다
	
	public static void main(String[] args) {
		BookService bs = new BookService ();
		bs.practice();
		
	}
}
