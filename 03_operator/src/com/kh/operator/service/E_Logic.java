package com.kh.operator.service;

import java.util.Scanner;

public class E_Logic {
	// �� ������
	// - �� �� �ΰ��� ���ϴ� ������
	
	// && (AND): �� �� true�� ���� true ��ȯ (�ϳ��� false�� false)
	// --> '�׸���', ~�鼭, ~�̸鼭, ~����, ~����, ~���� �̷� ��
	// ex) 1���� 100 ���� 
	//     �����̸鼭 �Ȱ��� �� ���: ����&&�Ȱ�
	
	// || (OR): �� �� false�� ���� false ��ȯ (�ϳ��� true�� true)
	// --> '�Ǵ�', ~�ų�, ~�̰ų� �̷� ��
	// ex) ����Ʈ���� �Ｚ �Ǵ� LG�� ���: �Ｚ||LG
	
	public void example1() {
	// ���ڱ� ����Ű!: �� �� ���� -> ������ �࿡ Ŀ�� ��ġ �� ctrl+d
		
	// �Է¹��� ������ 1~100������(1 �̻� 100 ����) �������� Ȯ���ϱ�

	Scanner sc= new Scanner(System.in);
	
	System.out.println("���� �ϳ� �Է�: ");
	int input = sc.nextInt();
	sc.nextLine();
	
	// 1 <= input <= 100 �̳� �ϴ°ǵ�, ������ ���α׷��� ���������� �� ���� ����. 
	// �ֳĸ� �񱳿����ڴ� �� �ѹ��ۿ� �����ŵ�. �׷��� �� ���� �ѷ� ������ �۾��� �ʿ�!
	
	boolean result = (1 <= input) && (input <= 100);
	// �� ��, &&�� �ƴ϶� ||�� ���� ��� ���� ������ �ȴ�.
	
	System.out.println("1���� 100 ������ ���ΰ�? " + result);
   }

	
	public void example2 () {
		// �Է��� ���ĺ��� �빮��(A~Z)���� �˻�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է�: ");
		char ch = sc.nextLine().charAt(0);
		
		// 'A' <= ch <= 'Z' ó�� ���� �츮�� ���ظ� �� �� ������ ��ǻ�ʹ�?
		// ������� ��ǻ�͵� �̿� ����! �ֳ�,
		// char�ڷ����� ���� ����Ǵ� ���� �����̱� ������ ���� �� ������ ��ǻ�� ���忡����
		// ������ ������ �ν��� ��.
		// A~Z�� 65���� 1�� �����ϸ鼭 ������� �����Ǿ� �ִٴ� ������ �̿�
		
		boolean result = (ch >= 'A') && (ch <= 'Z');
		
		System.out.println("���� �빮�� Ȯ��: " + result);
	}
	
	
	public void example3 () {
		// �Է¹��� ���ĺ���  Y���� �˻�(��ҹ��ڱ��� x)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ĺ� �ϳ� �Է�:  ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		System.out.println("Y or y�ΰ�?: " + result);

	}
	public void example4 () {
		// ���� + ��� + �� + ��
			
		int a = 2;
		int b = 3;
			
		boolean c = a > b; // a=2, b=3, c=false
		boolean d = ++a <= b++; //  a=3, b:3 ��� �� 4(���� �׳� b=4��� ǥ��), d=true 
			
		System.out.println("a : " +a); // 3 
		System.out.println("b : " +b); // 4
		System.out.println("c : " +c); // f
		System.out.println("d : " +d); // t
			
		System.out.println();
			
		System.out.println("!c : " + !c); // !false == true
		System.out.println("c != d : " + (c != d)); // true
			
		System.out.println();
			
		System.out.println("(a % b) == 1 : " + ((a % b) == 1));  // 3%4 == 3 false
		System.out.println("(a == 3) && (b == 4) : " + ((a == 3) && (b == 4))); // true
		System.out.println("!d || (a-b) > 0 : " + (!d || (a-b) > 0)); 
		// !d == false, a-b == -1 > 0 �̶� false 
		// ��� false || false == false
			
		System.out.println();
			
		System.out.println("!(c == d) && ((a * b == 10) || ( b % 2 == 0)) : " + (!(c == d) && ((a * b == 10) || ( b % 2 == 0)))); // t
		// !(c == d) == true
		// (a*b) == 10 == false
		// (b%2) == 0 == true
		// true && (false || true) �� �ᱹ true && true
		// �׸��Ͽ� true
		
		











	}
}





