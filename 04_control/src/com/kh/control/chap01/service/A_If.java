package com.kh.control.chap01.service;

import java.util.Scanner;

public class A_If {
	/* ���α׷��� ������ ������ �Ʒ�, �¿��� ��� ���������� ����ȴ�.
	 * 
	 * �� �������� �帧�� �ٲ� �� ����ϴ� ���� ���.
	 * 
	 * - ���������� ���ϴ� �ڵ带 ���� --> ���ǹ�
	 * - �ݺ������� ���ϴ� �ڵ带 �ݺ����� --> �ݺ���
	 * - �ݺ������� Ư�� ���ǿ� ���� �ݺ� ������ �����ϴ� �� --> �б⹮
	 * 
	 * <���ǹ�>
	 * ���ǽ��� ���̳� �����̳ĸ� �Ǵ��ؼ� 
	 * �׿� �����ϴ� �ڵ带 �����ϴ� ����
	 * 
	 * ���ǹ��� ��ǥ������ if, switch�� ����
	 * */
	
	public void example1 () {
		// �ܵ� if��
		// if���� ���ǽ��� true�̸� �߰�ȣ({}, ���)���� �ڵ带 ����
		// if���� ���ǽ��� false�̸� �ش� �ڵ带 �����ϰ� �ǳ� �ڴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		if(input > 0) {
			System.out.println("����̴�.");
		}
		
		if(input <= 0) {
			System.out.println("����� �ƴϴ�."); 
		}
			
	}
		// �̷������� �ڵ带 ���� �ʹ� ��ø�Ǵ� ���� ���Ƽ� �� ��ȿ�����̶� �츮�� else���� �����ϰ� �ȴ�
		
		
		
	public void example2 () {
		// if-else��
		/* - ���ǽ��� ���� ��� if���� �ڵ带, ������ ��쿡�� else���� �ڵ带 ����.
		 * 
		 * [ǥ����]
		 * if(���ǽ�){
		 *  	���� ��� �����ڵ� ...
		 *  } else {
		 *  	������ ��� �����ڵ� ...
		 *  }
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String result; // ��� ���� ���� ����
		if(input % 2 == 0) { // �Էµ� ���� ¦���� ���
			result = "¦��";
		} else {
			result = "Ȧ��";
		}
		
		System.out.println(input+"��/�� "+result+"�̴�.");
		
	}
	
	public void example3 () {
		// ���̸� �Է¹޾� �Ϲ�, û�ҳ�, �ʵ��л�, �����оƵ� ���� �� ��� �ޱ�
		// �Ϲ�: 1250�� (20�� �̻�)
		// û�ҳ�: 720�� (14�� �̻� 19�� ����)
		// �ʵ��л�: 450�� (8�� �̻� 13�� ����)
		// �����оƵ�: 0�� (0�� �̻� 7�� ����)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���. ");
		int age = sc.nextInt();
		sc.nextLine();
		
		int fare = 0; // ����� ������ ���� ���� �� 0���� �ʱ�ȭ 
		
		if(age >= 20) { 
			fare = 1250; // 20�� �̻��� ��� �Ϲ�
		} else if(age>=14 && age <=19) {
			fare = 720; // 14�� �̻� 19�� ���� û�ҳ�
		} else if(age>=8 && age <=13) {
			fare = 450; // 8�� �̻� 13�� ���� �ʵ��л�
		} else if(age>=0 && age<=7) {
			// fare = 0; (�ʱ�ȭ ���� 0�̴ϱ� �Ƚᵵ ��) // 0�� �̻� 7�� ���� ������ �Ƶ�
		} else { 
			// else if ���� else�� ���� �ڵ� ���� �� ������
			// 0 �̸� (��, ���� �ÿ� ��� �����ؾ�������)
			fare = -1;
		}
			
		System.out.println(fare + "��");	
		
	}
		
	
	public void example4 () {
		// ���̸� �Է¹޾� �Ϲ�, û�ҳ�, �ʵ��л�, �����оƵ� ���� �� ��� �ޱ�
		// �Ϲ�: 1250�� (20�� �̻�)
		// û�ҳ�: 720�� (14�� �̻� 19�� ����)
		// �ʵ��л�: 450�� (8�� �̻� 13�� ����)
		// �����оƵ�: 0�� (0�� �̻� 7�� ����)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���. ");
		int age = sc.nextInt();
		sc.nextLine();
		
		String division; // ���� ������ ������ ���� ����
		int fare = 0; // ����� ������ ���� ���� �� 0���� �ʱ�ȭ 
		
		if(age>=20) {
			
			if(age>=65) {
				division = "����";
				
			} else {
			
			division = "�Ϲ�";
			fare = 1250; // 20�� �̻��� ��� �Ϲ�
		
			}
			
		} else if(age>=14) {
			division = "û�ҳ�";
			fare = 720; // 14�� �̻� 19�� ���� û�ҳ�
			
		} else if(age>=8) {
			division = "�ʵ��л�";
			fare = 450; // 8�� �̻� 13�� ���� �ʵ��л�
			
		} else if(age>=0) {
			// fare = 0; (�ʱ�ȭ ���� 0�̴ϱ� �Ƚᵵ ��) // 0�� �̻� 7�� ���� ������ �Ƶ�
			division = "������ �Ƶ�";
			
		} else { 
			// else if ���� else�� ���� �ڵ� ���� �� ������
			// 0 �̸� (��, ���� �ÿ� ��� �����ؾ�������)
			division = "ERROR";
			fare = -1;
		}
		
		System.out.println("����: " + division);
		System.out.print("���: ");	
		
		if(fare == -1) { // �� ERROR�� ���
			System.out.println("ERR_04");
		} else { 
			System.out.println(fare +"��");
		}

	}
	
	public void example5() {
		// ������ �ϳ� �Է¹޾� ����� ����Ͻÿ�.
		// 95�̻� A+	/ 94~90 A	/ 89~85 B+	/ 80~84 B
		// 79~75 C+ / 70~74 C	/ 69~60 D	/ 60�̸� F
		
		// ex)
		// ���� �Է�: 95
		// 95��, A+ �Դϴ�.
		
		System.out.print("������ �Է��ϼ���. ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		
	if (input >=0 && input <=100) { 
		
		
		String division = ""; // �ʱ�ȭ���� �ʰ� �׳� �����ϰ� �Ǹ� ���� ���� ����
							  // ��, �ϰ� ¥���� ���ؿ� ���� �ʴ� ���� ��¿�ǵ�? �� ���� 
							  // ��Ȯ�� ������ �ʿ�
		
		/*
		 * if (input>=95) {
			division = "A+" ;
		} else if (input >= 90) {
			division = "A" ;
		} else if (input >= 85) {
			division = "B+" ;
		} else if (input >=84) {
			division = "B" ;
		} else if (input >=80) {
			division = "C+";
		} else if (input >=75) {
			division = "C";
		} else if (input >= 60) {
			division = "D"; 
		} else if (input < 60) { // } else { ��� �ᵵ �ȴ�
			division = "F";
		} *
		  */
		
		// System.out.println(input + "��, " + division + "�Դϴ�.");	
	
	// �ٵ� ������ �� ���� �ڵ� �� ��ȿ������. ȿ�������� �ٽ� ���� �������� �Ʒ�.
	// ��ø ������ ���!
		
	if (input >=90) {
		division = "A";
		
		if(input>=95) {
			division += "+"; // 90�� �̻� �߿����� 95�� �̻��� + �ٿ��� �����ϰڴ�
		}
		
	} else if (input>=80) {
		division = "B";
		
		if(input>=85) {
			division += "+"; // 80�� �̻� �߿����� 85�� �̻��� + �ٿ��� �����ϰڴ�
	}
		
	
	} else if (input>=70) {
	  	division = "C";
		
		if(input>=75) {
			division += "+"; // 70�� �̻� �߿����� 75�� �̻��� + �ٿ��� �����ϰڴ�
	}
		
	} else if (input>=60) {
		division = "D";
		
	} else {
		division = "F";
		
	}
		
	System.out.print(input + "��, " +  division + "�Դϴ�. ");
	
	
	} else { 
		System.out.println("�߸� �Է��ϼ̽��ϴ�. ");
	}
	
	}
	
}

