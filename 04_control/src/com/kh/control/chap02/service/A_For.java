package com.kh.control.chap02.service;

import java.util.Scanner;

public class A_For {
	/* 
	 * [ǥ����]
	 * for(�ʱ��; ���ǽ�; ������) {
	 * 		�ݺ� ������ �ڵ�;
	 * }
	 * 
	 * [ǥ���� ��ü ����]
	 * �ʱ��: for�� ������ �ݺ���� ���� ����� ������ �����ϴ� �κ�
	 * ���ǽ�: �ݺ����� �ݺ��� �����ϱ� ���� ������ �ۼ��ϴ� �κ�
	 * 		- ���ǽ��� true�̸� �ݺ� O, ���ǽ��� false�̸� �ݺ� ����
	 * 		- ���ǽ��� �� �ݺ� ���۽ø��� �˻縦 ����.
	 * ������: �ʱ���� ���� �Ǵ� ���� ���� ��ȭ�� �ִ� ��
	 * 		- �� �ݺ� ���� ��, �ʱ���� ���� �Ǵ� ���� ��Ŵ.  
	 * 
	 * 
	 * [ex.]
	 * for(1; 5 ����; �ʱ��+1) --> 6 ���
	 * 
	 */

	public void example1() {
		// 1���� 5���� �ָ��� ����ϱ�
	
		//     �ʱ��;    ���ǽ�;  ������
		for ( int i=1 ; i<=5 ; i++  ) {  // ���� �����Ŀ����� ����, ���� ũ�� ����� ���°� �̹� �����ݷк��� ) �����ȿ� �����ڰ� ++ �ϳ��� �갥�� ����X
			
			System.out.println(i);
		}
	}		
		// ����ϸ� 1, 2, 3, 4, 5�� ���� �ǵ� �̰� ��� �Ǵ°ųĸ�
		// 1�� ������ ��(�ʱ��) ���ǽĿ� �����ϱ� �������� ���µ� ���⼭ i=1�� �����°� �ƴ϶� �̰͵� ���� �����. 
		// �׷��� �׿��� 1, 2, 3, 4, 5 ��µǴ� ����.  
	
	
	
	public void example2() {
		// 5���� 1���� ����ϱ�
		
		for (int i=5 ; (i>0) && (i<6) ; i-- ) {
			System.out.println(i);
		}
	}
	
		// �ٵ�, ���� ������ �ͺ��ٵ� 1 2 3 4 5 ����ߴ� ���� �׳� �� �����°� �� ����.
		// -> for (int i=5; i>=1; i--)
	
	
	
	public void example3() {
		// 1���� 50���� Ȧ�� ��� ���

		for (int i=1; i<51; i+=2) {
			System.out.println(i);
		}
	}
	
	
	public void example4() {
		// ������ 7�� ����ϱ� 
		
		int dan=7;
		for (int i=1; i<=9; i++) {
			System.out.println(dan + "X" + i + "=" + (dan*i));
		}
	}
	
	
	public void example5() {
		// ������ �ϳ� �Է¹޾� �ش� ���� 2~9 ���� ������ �˻��Ͽ� 
		// ���� ���, �ش���� �������� ����ϱ�
		// �ƴ� ���, "2~9 ������ ���� �Է��ϼ���" ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2���� 9������ ������ �ϳ� �Է��ϼ���. ");
		int dan = sc.nextInt();
		sc.nextLine();
		
		if ((dan>=2) && (dan<=9)) {
			for (int i=1; i<=9; i++) {
				System.out.printf("%d X %d =%d\n", dan, i, dan*i);			
					}
				}
	
	}
	

	public void example6() {
		// 1~100������ ��
		
		int sum=0;
		// 1���� 100������ ������ ���� ������ ���� sum
		// �� ������ ����� ���ÿ� �ʱ�ȭ (���⿡���� �ʼ� �۾�)
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	
	}
	
	
	public void example7() {
		// 1~�Է¹��� ���������� ��								scanner ���+for��
		// ��, �Է��ϴ� ���� 1�� �ʰ��� ��������.					scanner ���
		// 1������ �� �Է½�, "�߸� �Է��ϼ̽��ϴ�." ��� 				if-else��
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1�� �ʰ��ϴ� ���� �ϳ��� �Է��Ͻÿ�. ");
		int input = sc.nextInt();
		sc.nextLine();

		if (input<=1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else { 
			
			int sum = 0;
			
			for ( int i=1; i<=input; i++ ) {
				sum+=i;
			}
			
			System.out.println(sum);	
		}
	}
	
	public void example8() {
		// ��ø for�� (���� for��)
		
		// 1���� 5���� ��µǴ� ������ �ټ��� ����ϱ�
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) { 
				System.out.print(j+ " ");
			}
			
			System.out.println(); 			// 1 2 3 4 5 ��� �� �ٹٲ� �ڵ�
		
		}
	
	}
	
	public void example9() {
		// 0�� 0�ʺ��� 9�� 59��
	
		for(int min=0; min<10; min++) {  // ��
			
			for (int sec=0; sec<60; sec++) { // ��
				
				System.out.printf("%2d�� %2d��\n", min, sec);
		}
	}
		
		
	}
	
	
	public void example10() {
		// ������ 2�ܺ��� 9�ܱ��� ��� ���
		
		// 2~9���� �ݺ��ϴ� for���� ���� �ٱ��ʿ� �����.
		for (int dan=2; dan<10; dan++) {
			
			// �� �ȿ�, �ش� �ܿ� �������� ��(1~9)�� �ݺ��ϴ� for���� �����.
			for (int su=1; su<10; su++) {
				System.out.printf("%2d*%2d=%2d ", dan, su, dan*su);				
			}
			
			System.out.println("\n"); // �ٹٲ�
		}
	}
	

	public void example11() {
		// �� ��� (* �̿�)
		// 1. �� 5�� 5�� ���
		
		for(int i=0; i<5; i++) {		// 0���� �����ؼ� [ 0 1 2 3 4 ] 5ȸ �ݺ� ����. ����� ���� ����� ����.
			
			for(int j=0; j<5; j++) {    // ���� 0���� �����ؼ� [ 0 1 2 3 4 ] 5ȸ �ݺ� ����.
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
				
		// for (char star=1; star<6; star++) {
		//	System.out.println("*");
		
	}
	
	
	public void example12() {
		// �� ��� (* �̿�)
		// 2. ���� 1, 2, 3, 4�� ���
		
		// *
		// **
		// ***
		// ****
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
			
		
	}
		
		
}

	

