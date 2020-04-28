package com.kh.inherit.practice.view;

import java.util.Scanner;

import com.kh.inherit.practice.model.service.CircleService;
import com.kh.inherit.practice.model.service.RectangleService;

public class PracticeMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleService cService = new CircleService() ;
	private RectangleService rService = new RectangleService();
	
	public void mainMenu() { // ���θ޴�
		int input = 0; // �޴� �Է¿� ���� ����
		
		do { 
			System.out.println("===== �޴� =====");
			System.out.println("1. ��");
			System.out.println("2. �簢��");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ: ");
			
			input=sc.nextInt();
			// ���α׷� �帧�� �������� �� 
			// nextInt(), nextDouble() ���Ŀ� nextLine()�� ���� �� ���� ��쿡
			// ���� ���๮�� ���ſ� nextLine()�� �ۼ�
			
			switch (input) {
			
			case 1: circleMenu(); break;
			case 2: rectangleMenu(); break;
			case 9: System.out.println("�����մϴ�."); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			
			}
		
			
		} while(input != 9);
	}
	
	public void circleMenu() {
		int input = 0;
		
			System.out.println("===== �� �޴� =====");
			System.out.println("1. �� �ѷ�");
			System.out.println("2. �� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ: ");
			input = sc.nextInt(); 
			
			switch (input) {
			
			case 1: calcCircum(); break;
			case 2: calcCircleArea(); break;
			case 9: System.out.println("�������� �̵��մϴ�."); break;
			
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
			}
			
		
	}
	
	public void rectangleMenu() {
		int input =0;
		
		System.out.println("===== �簢�� �޴� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ: ");
		input = sc.nextInt(); 
		
		switch (input) {
		
		case 1: calcRectArea(); break;
		case 2: calcPerimeter(); break;
		case 9: System.out.println("�������� �̵��մϴ�."); break;
		
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
		}
		
	}
	
	public void calcCircum() {
		// ���ѷ� ���ϱ�
		System.out.print("x ��ǥ: ");
		int x = sc.nextInt();
		
		System.out.print("y ��ǥ: ");
		int y = sc.nextInt();
		
		System.out.print("������: ");
		int radius = sc.nextInt();
		
		System.out.println(cService.calcCircum(x, y, radius));
		
	}
	
	public void calcCircleArea() {
		// ���� ����
		System.out.print("x ��ǥ: ");
		int x = sc.nextInt();
		
		System.out.print("y ��ǥ: ");
		int y = sc.nextInt();
		
		System.out.print("������: ");
		int radius = sc.nextInt();
		
		System.out.println(cService.calcArea(x, y, radius));
		
		
	}
	
	public void calcPerimeter () {
		// �簢���� �ѷ�
		System.out.print("x ��ǥ: ");
		int x = sc.nextInt();
		
		System.out.print("y ��ǥ: ");
		int y = sc.nextInt();
		
		System.out.println("����: ");
		int height = sc.nextInt();
		
		System.out.println("�ʺ�: ");
		int width = sc.nextInt();
		
		System.out.println(rService.calcArea(x, y, width, height));
	}
	
	
	public void calcRectArea() {
		// �簢���� ����
		System.out.print("x ��ǥ: ");
		int x = sc.nextInt();
		
		System.out.print("y ��ǥ: ");
		int y = sc.nextInt();
		
		System.out.println("����: ");
		int height = sc.nextInt();
		
		System.out.println("�ʺ�: ");
		int width = sc.nextInt();
		
		System.out.println(rService.calcPerimeter(x, y, width, height));
	}
		
	
}
