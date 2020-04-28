package com.kh.exception.chap04.model.service;

public class InputZeroException extends Exception {
	// ����� ���� ���� ���� ���
	// --> Exception�Ǵ� �� �ļ� Ŭ���� ��ӹ����� ��
	
	// ���� checked Exception���� ���� ���
	// ���� Exception��ӹ���
	
	// ���� Unchecked Exception���� ���� ���
	// ���� RuntimeException��ӹ���
	
	// ������ �ʼ�
	public InputZeroException() {
		super();
	}
	
	public InputZeroException(String msg) {
		super(msg);
	}
	
	
}
