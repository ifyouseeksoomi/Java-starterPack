package com.kh.exception.chap02.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchService {
	
	// try: ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 ��� ���� �ۼ��ϰ� �õ�
	// catch: try���� �������� ���ܸ� ��Ƽ� ó���ϴ� ����
	// finally: try~catch���� ���� �� �������� �ݵ�� �����ؾ� �ϴ� �ڵ带 �ۼ��ϴ� �κ�
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1: ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է�2: ");
		int num2 = sc.nextInt();
		
		try {
			System.out.println(num1 + "/" + num2 + "=" + num1/num2);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} finally {
			System.out.println("���α׷� ����");
		}
	
	}
	
	public void example2() {
		
		String[] arr = {"�Ľ�Ÿ", "���", "���", null, "Į����"};
		
		int i=0;
		while (true) {
			try {
			System.out.println(arr[i++].charAt(0));
				// �θ� Ÿ���� ���� ó��(Catch)�� �ڽĺ��� ���� �ۼ��ϸ�
				// try�������� �߻��Ͽ� ���޵Ǵ� Exception ��ü��
				// �� ��Ƽ� ó���ϴ� ��Ȳ�� �߻��Ͽ� 
				// ���Ŀ� �ۼ��� �ڽ� Ÿ�� ���� ó��(catch)�� �������� ���ϴ� ���� �߻�
				// --> �ذ���: �θ�Ÿ�� ����ó�� �ڵ带 �ڽ� ���Ŀ� �ۼ��Ѵ�. (�� or ��� -> ��Ÿ��)
			} catch (NullPointerException e) {
				System.out.println("���� ���� �����ϴ�. ");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭�� �ε��� ������ �Ѿ�� ������ �����Ͽ����ϴ�.");
				break;
			} catch (RuntimeException e) {
				System.out.println("�ڵ� ���� �� ���� �߻�");

			}
		}
		
	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		int menu=0; // int���̾��ٰ� String���� �ٲ㼭 �غ� ������, �� ����ڰ�
					// int���� �Է��ؾ��Ѵٴ� �δ��� ���� �Ϸ���
		do {
			System.out.println("===== �޴� =====");
			System.out.println("1.example1() ȣ��");
			System.out.println("2.example2() ȣ��");
			System.out.println("9. ���α׷� ����");
			System.out.print("����>> ");
			
			try {
				
				menu = sc.nextInt();
				
				switch (menu) {
				case 1: 
					example1();
					break;
				case 2:
					example2();
					break;
				case 9:
					System.out.println("�����մϴ�. ");
				default:
					System.out.println("�ٽ� �Է����ּ���.");
					
				}
				
				
			} catch (InputMismatchException e) {
				System.out.println("������ �Է����ּ���.");
				sc.nextLine();
				// ���ۿ� �����ִ� �߸� �Էµ� ���ڿ��� ���������ν� �ٽ� nextInt()��
				// ����� �� �ֵ�����.
			} catch (Exception e) {
				// exception�� �ֻ��� �θ��̹Ƿ� �ᱹ ���������� ��� ���ܸ� ��ڴٴ� ����
				System.out.println("�߻��� ���� ó��");
				break;
			}
			// java.util.InputMismatchException 
			// Scanner�� �̿��Ͽ� ������ �Է� �� 
			// �Է� �ڷ����� ����ġ�ϴ� ��쿡 �߻�
			
		} while (menu != 9);
	}
	
	public void example4() {
		// �� ������ �Է¹޾� ���� �� ���ϱ�
	    // ��, BufferedReader ����ϱ�
		
		BufferedReader br = null; // ó������ �׳� ���������� ����°���
		// �׸��� �̰� �� �Ʒ��Ʒ��ٿ��ٰ� BufferedReader br = new ~~�̷��� ���� ������
		// try ��������ȭ��Ű�� �������� �� ����.
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("���� 1 �Է�: ");
			int num1 = Integer.parseInt(br.readLine());
			
			System.out.print("���� 2 �Է�: ");
			int num2 = Integer.parseInt(br.readLine());
			
			System.out.print("��: " + (num1/num2));
			
		} catch (IOException e) { 
			e.printStackTrace(); 
			// ���ܰ� �߻��� ������ ���ñ����� ���� �߻� �ڵ��� ��ġ�� ���
			// --> ���� ó�� �� console�� ��µǴ� ���� ����� ����
			// ��Ⱑ �����۵��ϰ� ���� �� �����ϸ� ������ �ʴ� �����ڵ��� �׷��� ������ ����� ����.

		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			
		} catch (NumberFormatException n) {
			System.out.println("������ �Է����ּ���. ");
		
		} finally {
			
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
						
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


