package com.kh.control.chap01.practice;

import java.util.Scanner;

import com.kh.control.chap01.service.A_If;

public class ControlPractice {

	public void practice5 () {
		
		/*Q5.
		 ���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���.
		 �α��� ���� �� ���α��� ������,
		 ���̵� Ʋ���� �� �����̵� Ʋ�Ƚ��ϴ�.��,
		 ��й�ȣ�� Ʋ���� �� ����й�ȣ�� Ʋ�Ƚ��ϴ�.���� ����ϼ���. 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String id = "myId";
		String pw = "myPassword12";
		
		/* String result1 = "�α��� ����";
		String result2 = "���̵� Ʋ�Ƚ��ϴ�.";
		String result3 = "��й�ȣ�� Ʋ�Ƚ��ϴ�."; */
				
		System.out.print("���̵�: ");
		String inputId = sc.nextLine();
		
		System.out.print("��й�ȣ: ");
		String inputPw = sc.nextLine();
		
		// class�� �ڷ��� -> �׷��� String�� �ڷ���
		// String.equals()
		// String �ڷ����� ������ �ִ� ��¥ ������ �������� ���ϴ� �޼ҵ�
		// ����� true �ƴϸ� false ���� ��ȯ
		
		if (id.equals(inputId)) {														// .�� ����µ� �ڵ��ϼ� ���� ���´ٴ� ���� �ǹ�: �� �տ� �� ���� class��� ��
		      if (pw.equals(inputPw)) { 												// --> ""class�� �ڷ����̴�. ""
		    	  System.out.println("�α��� ����");
		      } else {
		    	  System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");	  								// �̰� ���� �� ������, ���ʿ� ���̵� Ʋ���� ������� �Ȱ�����.
		      } 
			
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	
	public void practice1() {
		
		/*
		 *�Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
		���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���.
		ex.
		1. �Է�
		2. ����
		3. ��ȸ	
		4. ����
		7. ����
		�޴� ��ȣ�� �Է��ϼ��� : 3
		��ȸ �޴��Դϴ�. 
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ex. " + "\n1. �Է�" + "\n2. ����" + "\n3. ��ȸ" + "\n4. ����" + "\n7. ����" + "\n�޴� ��ȣ�� �Է��ϼ���: ");
		int input1 = sc.nextInt();
		sc.nextLine();
		
		switch (input1) {
			case 1:
				System.out.print("�Է¸޴��Դϴ�");
			case 2:
				System.out.print("�����޴��Դϴ�");
			case 3:
				System.out.print("��ȸ�޴��Դϴ�");
			case 4:
				System.out.print("�����޴��Դϴ�");
			case 7:
				System.out.print("���α׷��� ����˴ϴ�.");
		}
		
		
	}

	public void practice2() {
		
		/*	 Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
		         ¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
			����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���.
			ex.
			���ڸ� �� �� �Է��ϼ��� : -8
			����� �Է����ּ���.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �ϳ� �Է��ϼ���. ");
		
		int input2 = sc.nextInt();
		sc.nextLine();
		
		
		
		if (input2>0) {	
			
			if (input2%2==0) {
			System.out.println("¦����");
		} else {
			System.out.println("Ȧ����");		
		}
		
		} else {
			System.out.println("����� �Է����ּ���.");
		}
		
	}
	
	
	public void practice3 () {
		/* ����, ����, ���� �� ������ ������ Ű����� �Է� �ް� �հ�� ����� ����ϰ�
		�հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� ����� �����ϼ���.
		(�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���)
		�հ� ���� ��� ���� �� ������ �հ�, ���, �������մϴ�, �հ��Դϴ�!���� ����ϰ�
		���հ��� ��쿡�� �����հ��Դϴ�.���� ����ϼ���. */	
		
		Scanner sc=new Scanner(System.in);
			
		System.out.print("��������: ");
		int kor = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��������: ");
		int math = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��������: ");
		int eng = sc.nextInt();
		sc.nextLine();
		
		int sum = kor + math + eng;
		double ave = sum/3;
		
		if (kor>=40&&math>=40&&eng>=40 && ave>=60) {
			System.out.println("����: "+ kor + "\n����: "+ math + "\n����: "+ eng + "\n�հ�: "+sum + "\n���: "+ave+"\n�����մϴ�, �հ��Դϴ�!");
		   } else {
			   System.out.println("���հ��Դϴ�.");
		   }
	}
	
	public void practice4 () {
		// ���� �ڷ�(7page)���� if������ �Ǿ��ִ� ��, ����, ����, �ܿ� ������ switch������ �ٲ㼭 ����ϼ���.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���.");
		
		int month = sc.nextInt();
		sc.nextLine();
		
		switch (month) {
		case 12: case 1: case 2:
			System.out.println("�ܿ��Դϴ�."); break;
		case 3: case 4: case 5:
			System.out.println("���Դϴ�."); break;
		case 6: case 7: case 8:
			System.out.println("�����Դϴ�."); break;
		case 9: case 10: case 11:
			System.out.println("�����Դϴ�."); break;
		default:
			System.out.println("�ش��ϴ� ������ �����ϴ�."); break;
		} 
	}
	
	
	public void practice6() {
	 /* ����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է� �޾� �� ����� ���� �� �ִ� ������ ����ϼ���.
	  
		��, �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
		ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
		��ȸ���� �Խñ� ��ȸ�� �����մϴ�. 
		
		ex.
		������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ������
		ȸ������, �Խñ� ���� �Խñ� �ۼ�, ��� �ۼ� �Խñ� ��ȸ	*/
	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ Ȯ���ϰ��� �ϴ� ���: ");
		
		String level = sc.nextLine();
		
		String result ="";
	
		switch (level) {
		
	
		case "������": 
			result+="ȸ������, �Խù� ����, ";
		case "ȸ��" : 
			result+="�Խñ� �ۼ�, ��� �ۼ�, "; 
		case "��ȸ��" :
			result+="�Խñ� ��ȸ"; break;
	
			
		}
		
		System.out.println(result);
	
	}
	
	
	public void practice9 () {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�߰���� ���� �Է�: ");
		int mid = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�⸻��� ���� �Է�: ");
		int fin = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�������� �Է�: ");
		int hw = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�⼮ ȸ�� �Է�: ");
		int pre = sc.nextInt();
		sc.nextLine();
		
		System.out.println("\n============ ��� ============\n");
		
		double resmid = 0.2*mid;
		double resfin = 0.3*fin;
		double reshw = 0.3*hw;
		double respre = pre;
		double ressum = resmid+resfin+reshw+respre;
		
		System.out.println("�߰���� ����(20): "+ resmid);
		System.out.println("�⸻��� ����(30): "+ resfin);
		System.out.println("���� ���� (30): "+ reshw);
		System.out.println("�⼮ ���� (20): "+ respre);
		System.out.println("����: "+ ressum);
		
		if (pre>=14) {
			if (ressum>=70) {
				
				System.out.println("PASS");
				
			} else {
				System.out.println("FAIL [���� �̴�]");
				
			}
			
		} else {
			System.out.println("Fail [�⼮ ȸ�� ���� (" + pre+ "/" + 20);
		}
	}
	
	public void practice10 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ����� �����ϼ���. ");
		
		System.out.println("\n1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. ��/����");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� ����");
		System.out.println("9. P/F");
		System.out.println("10. A_if Ŭ������ example1");
		
		System.out.print("\n����: ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		A_If aif = new A_If();
		
		switch (menu) {
		
		case 1: practice1(); break; // ���� Ŭ���� ���� �޼ҵ峢���� �޼ҵ���� �ۼ��ϴ� �͸����ε� ȣ���� ����!!
		case 2: practice2(); break;
		case 3: practice3(); break;
		case 4: practice4(); break;
		case 5: practice5(); break;
		case 6: practice6(); break;
		case 9: practice9(); break;
		case 10: aif.example1(); break; // �ٸ� Ŭ���� �޼ҵ� ȣ�� (�� ���� A_If Ŭ������ ��𿡶� ���� ������ �Ѵ�!!!!!!!!!!!!!!!281���� ����!!)
		
		
	}
		
		
	}



		
	
}
		
	







