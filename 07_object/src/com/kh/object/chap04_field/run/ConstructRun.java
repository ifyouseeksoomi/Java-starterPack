package com.kh.object.chap04_field.run;

import com.kh.object.chap06_constructor.model.vo.UserME;

public class ConstructRun {
	public static void main(String[] args) {

		// 오버로딩 확인 (selectUser 안 만들어서 지금 뭔가 에러가 나고있음)
		UserME u4 = new UserME("user4", "1q2w3e4r");
		// System.out.println(u4.selectUser());
		
		UserME u5 = new UserME("백동현", 20, '남');
		//System.out.println(u5.selectUser());
		
	}
}
