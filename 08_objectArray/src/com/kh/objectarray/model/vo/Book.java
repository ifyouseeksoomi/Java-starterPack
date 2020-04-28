package com.kh.objectarray.model.vo;

public class Book {

	// �ʵ� �ۼ� �Ϸ�
	private String title; // ����
	private int price; // ����
	private double discountRate; // ������
	private String author; // ����
	
	// �⺻ ������
	public Book() {}
	
	// �Ű����� �ִ� ������(��ü)
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}

	// getter/setter 
	public String getTitle () {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int price() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double discountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountrate) {
		this.discountRate = discountRate;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// �ʵ� ���� ��¿� �޼ҵ�
	public String selectBook() {
		return title + " / " + price + " / " + discountRate+ " / " + author ;
	}
}
