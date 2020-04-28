package com.kh.variable.controller;

public class C_Casting {
	/* ��ǻ���� �� ó�� ��Ģ
	 * 1. ���� �ڷ��������� ������ �����ϴ�.
	 * 2. ���� �ڷ��������� ����� �����ϴ�.
	 * 3. ����� ����� ��꿡 ���� �ڷ����� ����.
	 * 
	 * --> ����ȯ�� �̿��ϸ� ���� ��Ģ���� �� �� �ִ�.
	 * 
	 * ����ȯ�� ����
	 * 1. �ڵ� ����ȯ
	 * 2. ����(������) ����ȯ
	 * 
	 * */
	
	// �ڵ� ����ȯ
	// ���� ������ ���� �ڷ����� ū �ڷ��� ���� ���� �� �����Ϸ��� �ڵ����� ���� �ڷ����� ū �ڷ������� ��ȯ ��Ű�� ��
	public void autoCasting() {
	
		int i = 12; // 4 byte
		double d = 3.3; // 8 byte
		double result  = i + d;
						// 12 + 3.3
						// 12.0 + 3.3 = 15.3
		
		System.out.println(i + " + " + d + " = " + (i+d));
		System.out.println(i + " + " + d + " = " + result);  
		// 12+3.3=15.3
		
		// int(4byte) -> long(8byte)
		int i2 = 2147483647;
		long l2 = i2 + 1; 
		
		// �����Ϸ��� 2147483647L + 1L���·� ��ȯ�ؼ� ����� ������. �̰͵� �ڵ� ����ȯ!
		System.out.println("l2�� �� : " + 12);
		
		// float (4byte) -> double (8byte)
		float f3 = 2.13F;
		double d3 = 3.14;
		double result3 = f3 + d3;
		
		System.out.println(f3 + " + " + d3 + " = " + result3);
		// 2.13 + 3.14 = 5.27
		
		// 10���� ���ѼҼ��� 2������ ��ȯ�ϸ� ���� �Ҽ��� �Ǵ� ��찡 ����. �׷��� ��ǻ�ʹ� �Ǽ��� �ε��Ҽ������� ǥ���ϱ� ������ 2���� ���� �Ҽ��� ��Ȯ�� ǥ���ϴµ� �Ѱ谡 �ִ�. �׷��� ������ �߻��Ѵ�.
		
		
		// char(2byte) -> int(4byte)
		int i4 = 'A'; // int�� ������ char���� ���ͷ� �� ����
		/* char -> int �ڵ�����ȯ�� ������ ����
		 * char��� �ڷ��� ������ ���� ��ü�� �����ϴ� ������ �ƴ� 2byte(0~65535) ���� ���� ���ڸ� �����ϰ�, �����ڵ��� ����ǥ���� �ش� ��ȣ�� ��ġ�ϴ� ���ڸ� ã�� ����ϴ� �ڷ����̴�.
		 * --> ���: char�� �������̸鼭 �������̴�.
		 * */
		
		// char �ڷ��� ������ ���� �����ϱ�
		char ch5 = 65;
		
		System.out.println("i4�� ��: " + i4);
		System.out.println("ch5�� ��: " + ch5);
			
		// byte, short, int 
		byte bNum1 = 1;
		byte bNum2 = 10;
		//byte bResult = bNum1 + bNum2; 
		
		// byte, short, char, int �� �װ��� �ڷ����� int ���ͷ��� ���� �ʱ�ȭ�� �� �ִ�.
		// �̴� int �ڷ����� �����ϰ� ���� �� ���� �����ϴ�.
		// �ʱ�ȭ �� ���� byte, short, char �ڷ��� ������ ���� �̿��Ͽ� ���(����) ���� �� ������ int������ ���� ó���� ����ȴ�.
		
		// byte �������� ���� �� ������ ���� int������ ó���Ǳ� ������  bResult�� �� ������ �Ұ����� ����.
		// --> int�� ����� byte�� ���� ����ȯ�ϸ� ���� ����! ��� �ϳĸ�
		byte bResult = (byte) (bNum1 + bNum2); 
		
}
	// ���� ����ȯ		
		public void forcedCasting() {
			// ���� ������ ū �ڷ��� -> ���� �ڷ������� ������ ��ȯ��Ű�� ��
			
		int iNum1 = 10;
		long lNum1 = 10; // ���⼭ 10L�̶�� ���� �Ƚᵵ ������ �ڵ� ����ȯ�� �Ͼ�ϱ� ��� ��
		// ���α׷��ֿ��� '=' ��ȣ�� ���� �����ڸ� �ǹ�
		// -> ���Ե� �����̴�
		// ����ó�� long�� ������ int ���ͷ� ���� ������ ��� int ���ͷ� ���� long���� ���ͷ� �ڵ� ����ȯ�Ͽ� �����.
		
		// int result2 = (int) (iNum1 + lNum1);
		// iNum1+lNum1�� ���� ��� �ڷ�����? long
		// int = long ���Կ��� ����� ��
		
		// ���� �ذ���
		// ��� 1. ����ڰ� Ÿ���� ����. �� result Ÿ���� long������ ��ȯ�Ѵ�. �� int result -> long result�� �ٲ۴�.
		// ��� 2. iNum1 + lNum1�� ���� ����� int������ ���� ����ȯ�Ѵ�. �� �׳� iNum1+lNum1 -> (int) (iNum1 + lNum1)
		// ��� 3. lNum1�� int������ ���� ����ȯ��Ų��.
		int result3 = iNum1 + (int)lNum1;
			
			
		}
		
		
				
	
}