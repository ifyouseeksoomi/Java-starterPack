package com.kh.inherit.chap01.model.vo;

public class Cup extends Product {

	private String brand;
	private double volume;
//	private String pName;
//	private int price;    					// �� pName, price �κ��� �ּ�ó���ϳĸ� ���� ����̾Ƽ� product Ŭ���� ®�ݾ�
	
	// �⺻ ������
	public Cup() {}

	// �Ű����� �ִ� ������							// �������� ����: �ۼ������� ��ü�� �����Ǹ� �ʵ��� �뵵�� �ۼ��ϱ� ���� ��
											// �Ű����� �ִ� �������� ������ �ٷ� �ʱ�ȭ�ϱ� ����
	public Cup(String brand, double volume, String pName, int price) {
		super();
		this.brand = brand;
		this.volume = volume;
		setpName(pName);
		setPrice(price);
			// �� �տ� this. �̷��� ���ĸ� �̹� ��ӹ޾Ƽ� pName�� ���� �ڱ��ó�� �� ���ְ� �Ǿ��� ������!
			// �θ�κ��� ��ӹ��� pName�� price�� ���������ڰ� private�̹Ƿ� ���� ������ ���� ������ 
			// �θ�κ��� ��ӹ��� ���� ���ٹ���� setPname(), setPrice()�� �̿��Ͽ� pName�� price�� �ʱ�ȭ�� �� �ִ�.
//		this.pName = pName;
//		this.price = price;
	}

	// getter / setter 
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	

//	public String getpName() {
//		return pName;
//	}
//
//	public void setpName(String pName) {
//		this.pName = pName;
//	}
//
//	
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}

	public String selectField() {
		return brand + " / " + volume + " / " + getpName()+ " / " +getPrice(); 				 /* + " / " + pName + " / " + price */
		// getpName, getPrice: �θ�Ŭ������ �ִ� �Ŷ�, ������������ �ϸ� �ȵǰ�(�� �� ���� �ϸ� ����) ���ǳ��� �� �����̽��� �� ��
	}
	}
