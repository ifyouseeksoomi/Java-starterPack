package com.kh.poly.chap01.model.vo;

public class Bentley extends Car {
	
	public String TakeOutUmbrella () {
		return "��� ������";
	}

	// �θ�(Car)�� �޼ҵ� drive�� ������(�������̵�)
	@Override
	public String drive() {
		return "���ƴٴ�";
	}
	// ������ �ܰ迡���� �θ��� drive() �޼ҵ�� ���ε� �Ǿ��ִٰ�, 
	// ���� ���� ��ÿ��� �������̵��� �ڽ��� drive()�� ���ε��� �ȴ� == �̰��� ""���� ���ε�"" 

	
}
