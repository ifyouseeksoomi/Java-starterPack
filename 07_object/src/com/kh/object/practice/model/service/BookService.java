package com.kh.object.practice.model.service;

import com.kh.object.practice.model.vo.Book;

public class BookService {
	
	// + practice() : void
	public void practice () {
		
		// 1) �⺻ �����ڸ� �̿��Ͽ� ù��° Book(book1) ��ü ����
		Book book1 = new Book();
		
		// 2) �Ű����� �����ڸ� �̿��Ͽ� �� ��° Book(book2) ��ü ����(��� ������ ����)
		Book book2 = new Book("�ڹ��� ����", 20000, 0.3, "���� ��");
		
		// 3) ��ü�� ���� �ʵ� �� ��� Ȯ��
		System.out.println(book1.selectBook());
		System.out.println(book2.selectBook());
		System.out.println("==============================");
		
		// 4) ù��° ��ü�� ���� ���� setter�� �̿��Ͽ� ����
		System.out.println("������ ��� Ȯ��");
		book1.setTitle("C���");
		book1.setPrice(30000);
		book1.setDiscountRate (0.1);
		book1.setAuthor("ȫ�浿");
		
		// 5) ������ ���� ��� Ȯ��
		System.out.println(book1.selectBook());
		System.out.println("==============================");
		
		// 6) �� ��ü�� �������� ������ å ������ ����ؼ� ���
		// ���ε� ����= ���� - (����*������)
		System.out.println( "������: " + book1.getTitle() );
		System.out.println( "���ε� ����: " + (int) ( book1.getPrice() - ( book1.getPrice() * book1.getDiscountRate() ) ) + "��");
		
		
		System.out.println( "������: " + book2.getTitle() );
		System.out.println( "���ε� ����: " + (int) (book2.getPrice() - ( book2.getPrice() * book2.getDiscountRate() ) ) + "��");
	}
}