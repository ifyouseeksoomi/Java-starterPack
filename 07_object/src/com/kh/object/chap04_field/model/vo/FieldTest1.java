package com.kh.object.chap04_field.model.vo;

public class FieldTest1 {

	// ���� �����ڿ� ���� �ʵ� ���� ���� ���� ����
	
	// (+)public: ���� ������Ʈ ������ ��𼭵� ���� ���� ����
	public int num1 =1; 				// num1�� 1�� ����� �ʱ�ȭ
										// ��ü�� �����ʰ� ���ÿ� ���� ����Ǿ� ����
	
	
	// (#)protected: ���� ��Ű�� �� + �ܺ� ��Ű�� �� ��Ӱ��迡�� ���� ���� ����
	protected int num2 =2;
	
	
	// (~)default: ���� ��Ű�� ������ ���� ���� ����
	int num3 =3;
	
	
	// (-)private: ���� Ŭ���� ������ ���� ���� ���� (�� ���� Ŭ���������� ���� ����)
	private int num4 =4;
	
	
	public void print() {
		// ���� ��Ű��, ���� Ŭ���� ���ο��� ��� ���� ������ ���� ���� ��� ���� ����
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
}
