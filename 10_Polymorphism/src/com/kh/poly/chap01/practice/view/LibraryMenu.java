package com.kh.poly.chap01.practice.view;

import java.util.Scanner;

import com.kh.poly.chap01.practice.model.service.LibraryService;
import com.kh.poly.chap01.practice.model.vo.Book;
import com.kh.poly.chap01.practice.model.vo.Member;

public class LibraryMenu {
	
	private LibraryService service = new LibraryService();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("�̸�: ");
		String name=sc.next(); // nextLine�� �ƴϸ� �׳� �ԷµǴ� ���� �� �ܾ ��������� �ǹ� // ������: ���๮�� �Ƚᵵ �ȴ� 
		
		System.out.print("����: ");
		int age = sc.nextInt();
		
		System.out.print("����(M/F): ");
		char gender = sc.next().charAt(0); // sc.next()�� ���ۿ� �����ִ� ���๮�ڸ� �����ϰ� ���� �ܾ �о����
		
		// �Է¹��� ������(��ȣ�ӿ� �Ű������� �־) ��� ��ü ����
		Member m = new Member(name, age, gender);
		
		// LibraryService�� insertMember() �޼ҵ忡 ����
		service.insertMember(m);
		
		// ���� �ݺ� �޴� ����
		/* ==== �޴� ====  // ���� �ݺ� ����
			1. ����������  // LibraryService�� myInfo() ȣ���Ͽ� ���
			2. ���� ��ü ��ȸ  // LibraryMenu�� selectAll() ȣ��
			3. ���� �˻�  // LibraryMenu�� searchBook() ȣ��
			4. ���� �뿩�ϱ�  // LibraryMenu�� rentBook() ȣ��
			9. ���α׷� �����ϱ� 
			�޴� ��ȣ : // �޴� ��ȣ �Է� �ޱ� */
		
		int menu =0;
		while(true) { // ���� ���ǿ� ���� �ݺ� �����̶���ؼ� �׷���
			System.out.print("========== �޴� ==========\n"
					+ "1. ���������� \n"
					+ "2. ���� ��ü ��ȸ \n"
					+ "3. ���� �˻� \n" 
					+ "4. ���� �뿩�ϱ� \n"
					+ "9. ���α׷� �����ϱ�\n"
					+ "�޴���ȣ : ");
			menu = sc.nextInt(); sc.nextLine();
			
			switch(menu) {
			
			case 1: System.out.print(service.myInfo()); break; // LibraryService�� myInfo() ȣ���Ͽ� ����϶�
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 9: System.out.print("���α׷��� �����մϴ�. "); return; 
				// <�߿�> return�� �ǹ�: ȣ���� �޼ҵ�� ��ȯ(���ư���)
				// void �޼ҵ�� ��ȯ"��"�� ����!
				// JVM�� ������ �� void �޼ҵ� ���� �������� return�� �ڵ� �߰���
			default: System.out.print("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���. ");
				
			}
		}
		
	} 
	
	public void selectAll() {
		// LibraryService�� selectAll()�޼ҵ� ȣ���Ͽ� ��� �� Book[] �ڷ��� bList�� ��� 
		// for�� �̿��Ͽ� bList�� ��� ���� ��� ���
		// ��, i�� �̿��Ͽ� �ε����� ���� ��� -> �뿩�� �� ������ȣ�� �˱� ����
		// ex ) 0������ : �������� ���� / ������ / tvN / true
		
		Book[] bList = service.selectAll();
		for (int i=0; i<bList.length; i++) {
			System.out.println(i + "�� ����: " + bList[i]);
			// ���� ������ ���(print)�� ���� �ڵ����� .toString()�� JVM�� ���ؼ� �߰��ǹǷ� bList[i].toString() ���� �ʾƵ� ������.
		}
		
	}
	
	public void searchBook() {
		// �˻��� ���� Ű���� : ��  // �Է� ���� (keyword)
		System.out.print("�˻��� ���� Ű����: ");
		String keyword = sc.nextLine();
				
		// �Էµ� Ű���带 �̿��Ͽ� LibraryService�� searchBook()�� ȣ���ϰ�
		// ��ȯ���� book[] �ڷ��� searchList�� ���� ��
		Book[] searchList = service.searchBook(keyword);
		
		// for���� �̿��Ͽ� �˻� ����� ���� ��� ���
		for(int i=0; i<searchList.length; i++) {
			if(searchList[i]==null) {
				break; // null�̶�� ��µǴ°� �úƱ� �����ϱ� �ƿ� ����� ���ع����� ��
			}
			
			System.out.println(searchList[i]);
		}
		
		
	}
	
	public void rentBook() {
		// �����뿩�� ���� ������ȣ�� �˾ƾ� �ϱ� ������ selectAll() �޼ҵ� ȣ��
		selectAll();

		// ���뿩�� ���� ��ȣ ���� : �� 	>> �Է� ���� (index)
		System.out.println("�뿩�� ���� ��ȣ ����: ");
		int index = sc.nextInt(); sc.nextLine();
		
		// LibraryService�� rentBook() �� ����
		// �� ��� ���� result�� �ް� �� result��
		int result = service.rentBook(index);
		
		// 0�� ���  ������������ �뿩�Ǿ����ϴ�.�� ���
		// 1�� ���  ������ �������� �뿩 �Ұ����Դϴ�.�� ���
		// 2�� ���  ������������ �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ�����
		//		     �������������� Ȯ���ϼ��䡱 ���
		if (result ==0 ) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		} else if (result ==1) { 
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�. ");
		} else {
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
		}
	}


}
