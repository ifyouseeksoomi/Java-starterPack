package com.kh.object.chap05_initblock.model.vo;

public class Product {
	
	private String pName; // ��ǰ��
	private int price;	  // ����
	
	
	{ // �ν��Ͻ� �ʱ�ȭ ���
		// �ν��Ͻ� ����(�������)�� 
		// ��ü ���� �� ���� �� ���� �ʱ�ȭ �ϴ� �뵵
		pName = "������Z�ø�";
		price = 1200000;
	}
	
	public String selectProduct() {
		return pName + " / " + price;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}
