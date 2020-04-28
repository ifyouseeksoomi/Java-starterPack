package com.kh.object.practice.model.vo;

public class Book {

	/*
	 * 
	 - title : String  // 도서명
	 - price : int // 가격
	 - discountRate : double  // 할인율
	 - author : String // 저자명
	 *
	 */
	
	private String title; // 도서명
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자명
	
	/*
	 * 
	 + Book()
	 + Book(title:String, price:int, discountRate:double, author:String)
	 *
	 */
	
	// 기본 생성자
	public Book () {
		
	}
	
	// 매개변수 있는 생성자
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
	
	// 메소드 작성
	public String selectBook() {
		return title + " / " + price + " / " + discountRate +
				" / " + author;
	}
	
	
	// getter/setter 작성
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

