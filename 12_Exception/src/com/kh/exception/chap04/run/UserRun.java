package com.kh.exception.chap04.run;

import com.kh.exception.chap04.model.service.UserService;

public class UserRun {
	public static void main(String[] args) {
		UserService service = new UserService();
		service.method1();
		// UserService ��ü�� �ִ� method1() ȣ��
		// �ּ� �߰�
	}
}
