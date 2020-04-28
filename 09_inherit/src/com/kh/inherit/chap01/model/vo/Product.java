package com.kh.inherit.chap01.model.vo;

public class Product {
	// Computer, Cup, Car Ŭ�������� ����� ��� �����Ͽ� �θ� Ŭ���� ����
	
	private String pName;
	private int price;
	
	// �⺻ ������
	public Product() {}

	// �Ű� ���� �ִ� ������
	public Product(String pName, int price) {
		super();
		this.pName = pName;
		this.price = price;
	}

	// ����� getter & setter �̾Ƴ��� 
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
	
	// selectfield �ۼ�
	public String selectField () {
		return pName + " / " + price;
	 }
	
	
	// �̷��� ����κ� ������ ������, �� Ŭ������ �θ�� ��´�.
	
}
