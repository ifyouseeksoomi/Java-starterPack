package com.kh.object.practice.model.vo;

public class Book {

	/*
	 * 
	 - title : String  // ������
	 - price : int // ����
	 - discountRate : double  // ������
	 - author : String // ���ڸ�
	 *
	 */
	
	private String title; // ������
	private int price; // ����
	private double discountRate; // ������
	private String author; // ���ڸ�
	
	/*
	 * 
	 + Book()
	 + Book(title:String, price:int, discountRate:double, author:String)
	 *
	 */
	
	// �⺻ ������
	public Book () {
		
	}
	
	// �Ű����� �ִ� ������
	public Book(String title, int price, double discountRate,
				String author) {
		this.title=title;
		this.price=price;
		this.discountRate=discountRate;
		this.author=author;
	}
	
	/*
	 + selectBook () : String
	 */
	
	// �޼ҵ� �ۼ�
	public String selectBook() {
		return title + " / " + price + " / " + discountRate +
				" / " + author;
	}
	
	
	// getter/setter �ۼ�
	public String getTitle () {
		return title;
	}

	public void setTitle (String title) {
		this.title = title;
	}
	
	
	public int getPrice () {
		return price;
	}
	
	public void setPrice (int price) {
		this.price = price;
	}
	
	
	public double getDiscountRate () {
		return discountRate;
	}
	
	public void setDiscountRate (double discountRate) {
		this.discountRate = discountRate;
	}
	
	
	public String getAuthor () {
		return author;
	}
	
	public void setAuthor (String author) {
		this.author = author;
	}
	
	
	
	
}

