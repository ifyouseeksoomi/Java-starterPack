package com.kh.object.chap01_abstraction.model.vo;

// ��ǻ�� ���ο� �л��̶�� ��ü�� ����� ���� ���赵(Ŭ����) �ۼ�
// Ŭ���� �ۼ� �� ��ü���� ����� Ư¡ �� �ϳ��� �߻�ȭ�� ����Ǿ�� ��.

public class Student { // �л��� �߻�ȭ�� Ŭ����
	
	// ----- �Ӽ� -----
	// �̸�, ����, ����, �й�, �б�, ���� (�л��̶�� �������� �Ӽ��� ���� ��)
	// �׻� �޼ҵ� �Ʒ� ���� ���µ� Ŭ���� �ٷ� �Ʒ� �Ẹ��� ó�� --> �̷� ���� �տ� private ���°� ��Ģ

	public String name;		// �̸�
	public int age;			// ����
	public char gender;		// ����
	public int studentNumber; 	// �й�
	public String schoolName; 	// �б�
	public String grade; 		// ����
	
	// ----- ��� ----- (��� �޼ҵ�: �ʵ��� ����ó���� �������� �� ��, Ŭ���� ���ο� �ۼ��ϸ�, �⺻�� public)	
	// ����, �⼮, ����, �޽�, 
	public void study () {
		System.out.println(name + " �л��� ���θ� �����߽��ϴ�.");
	}
	
	public void attendance() {
		System.out.println(name + " �л��� "+ schoolName + "�б��� �⼮�߽��ϴ�.");
		
	}
	
	public void test () {
		System.out.println(name + " �л��� ������" + grade + "�Դϴ�.");
	
	}
	
	public void lunch() {
		System.out.println(name + "�л��� �޽��� �Խ��ϴ�. ");
		
		
	}
	
	
	
	
	

}
