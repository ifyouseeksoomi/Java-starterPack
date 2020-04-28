package com.kh.objectarray.model.vo;

import java.util.Scanner;

public class BookService {
		// Book ��ü 5���� �Ű����� �ִ� �����ڸ� �̿��Ͽ� ���� ��
		// å ������ �Է¹޾�
		// �ش� å�� �ִ��� �˻��Ͽ�
		// ������ Book ��ü�� �ʵ����� ���
		// ������ "�ش��ϴ� å�� �����ϴ�" ���
	
	// 1. ���� ���� �ڵ� ¥�� (���� �ƴ� ��������)
	// �ʵ忡 Scanner ��ü�� �����Ͽ� Ŭ���� ���ο��� ��� ��� �����ϰ� ��
	private Scanner sc = new Scanner(System.in);

	public void searchBookV1() {
		
		// å 5�� ��ü ����
		Book book1 = new Book("�ڹ��� ����", 30000, 0.2, "���� ��");
		Book book2 = new Book("C����� ����", 50000, 0.1, "��ö��");
		Book book3 = new Book("�� �ڹ� ��մ�", 100000, 0.05, "�鵿��");
		Book book4 = new Book("�����", 100000, 0.05, "�����㺣��");
		Book book5 = new Book("�ظ�����", 12000, 0.3, "����K�Ѹ�");
	
		// �˻��� å ���� �Է¹ޱ�
		System.out.print("�˻��� å ������ �Է��ϼ���: ");
		String title = sc.nextLine();
		
		if(book1.getTitle().equals(title)) {
			// book1�� ����� �Է¹��� ������ ���� ���
			System.out.println(book1.selectBook());
			// �� å�� ������ �� ����Ͻÿ�.
			
		} else if(book2.getTitle().equals(title)) {
			System.out.println(book2.selectBook());
			
		} else if(book3.getTitle().equals(title)) {
			System.out.println(book3.selectBook());
			
		} else if(book4.getTitle().equals(title)) {
			System.out.println(book4.selectBook());
			
		} else if(book5.getTitle().equals(title)) {
			System.out.println(book5.selectBook());
			
		} else {
			System.out.println("�ش��ϴ� å�� �����ϴ�.");}
		}
		
	// 2. ��ü �迭�� �̿��Ͽ� å �˻��ϱ�
	public void searchBookV2 () {
		
		// ���1
		Book[] books = new Book[5];
		
		books[0] = new Book("�ڹ��� ����", 30000, 0.2, "���� ��");
		books[1] = new Book("C����� ����", 50000, 0.1, "��ö��");
		books[2] = new Book("�� �ڹ� ��մ�", 100000, 0.05, "�鵿��");
		books[3] = new Book("�����", 100000, 0.05, "�����㺣��"); 
		
		// ���2: ��ġ int[] arr= {1, 2, 3, 4, 5}; �ϴ°�ó��
//		Book[] books = {
//				new Book("�ڹ��� ����", 30000, 0.2, "���� ��"),
//				new Book("C����� ����", 50000, 0.1, "��ö��"),
//				new Book("�� �ڹ� ��մ�", 100000, 0.05, "�鵿��"),
//				new Book("�����", 100000, 0.05, "�����㺣��")
//		};
//		
		// å ���� �Է� �ޱ�
		System.out.print("�˻��� å ������ �Է��ϼ���: ");
		String title = sc.nextLine();
		
		boolean flag = true;
		
		for (int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(title)) {
				// it means "books�� i��° �ε��� ����� Ÿ��Ʋ�� ���Դµ�, �װ��� �ϰ� �Է��� Ÿ��Ʋ ���� ���ٸ�,"
				System.out.println(books[i].selectBook());
				// it means "�׷� ���� �ϰ� ã�� �� �ε��� ����� ������ ����ض�"
				flag = false; // �˻��� �� ���, ���� �� ������ ����� ���ؼ� flag�� false�� �ٲ�
				break;
				
			} 
		} // for end
				
			if (flag) { // �˻��� ���� �ȵǰ����� �Ʒ��� ������ �Է��ϰ� ��
				System.out.println("�ش��ϴ� å�� �����ϴ�.");
		}
	
	}
}
