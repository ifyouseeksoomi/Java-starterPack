package com.kh.object.chap04_field.run;

import com.kh.object.chap06_constructor.model.vo.UserME;

public class ConstructRun {
	public static void main(String[] args) {

		// �����ε� Ȯ�� (selectUser �� ���� ���� ���� ������ ��������)
		UserME u4 = new UserME("user4", "1q2w3e4r");
		// System.out.println(u4.selectUser());
		
		UserME u5 = new UserME("�鵿��", 20, '��');
		//System.out.println(u5.selectUser());
		
	}
}
