package com.kh.api.chap02.model.service;

public class WrapperService {
	/* Wrapper Class
	 * - ���� Ÿ��(�⺻ �ڷ���)�� ��ü�� �����ϴ� Ŭ����
	 * - ��? Wrapper Class�� �� ����ϴ°�?
	 * 1) �⺻ �ڷ������δ� ������ �� ���� �Ӽ�, ����� ����ϱ� ����
	 * ex. �Ӽ�: �� �ڷ����� �ִ�, �ּҰ�, ����Ʈ ũ�� ��ȯ ��ȯ
	 * 	   String ����("1") <-> int ���� (1) :������ 1�� ������ 1�� �ٲٴ� ��
	 * 
	 * 2) �⺻ �ڷ����� ��¿ �� ���� ��ü�� �ٷ��ߵǴ� ��찡 ����
	 * 	  -- �޼ҵ��� �Ű������� ��ü�� �䱸�� ��
	 * 	  -- �⺻ �ڷ����� �ƴ� ��ü�� ���� �����ؾ� �� ��
	 * 	  -- ��ü���� �񱳰� �ʿ��� ��
	 * 	   
	 */
		
	public void example() {
		/* 
		 * byte		Byte
		 * short	Short
		 * int		Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * char		Character
		 * boolean	Boolean
		 * 
		 * */
		
		// Integer Wrapper Ŭ������ �����ϴ� ��� �ʵ�
		System.out.println(Integer.BYTES); // int byte ũ�� =4
		// ��� ��ü ������ ���ߴµ� �ʵ忡 ������ �� �ִ�? --> �ֳĸ� public static final int BYTES �̴ϱ�
		// Ŭ������.�빮�� --> �� �Ǹ� ����ƽ���̳��̴� �� �� �ִ� ��
		
		System.out.println(Integer.SIZE); // int bit ũ�� =4*8=32
		System.out.println(Integer.MAX_VALUE); // int �ִ밪
		System.out.println(Integer.MIN_VALUE); // int �ּҰ�		
		
		// String �ڷ��� --> �⺻ �ڷ���(int)���� ��ȯ
		String str = "100, 200, 300, 400";
		
		String[] arr = str.split(", ");
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += Integer.parseInt(arr[i]); // ���ڿ��� ��Ʈ������ �ٲ�� ��� ��
			// parseXXX : String ������ �⺻ �ڷ����� ���¸� ������ ������ �ش� �ڷ������� ��ȯ (�Ľ�, parsing)
			// ex) "100" --> 100
		}
		
		System.out.println("�հ�: " + sum);
		
		// �⺻ �ڷ���(int) --> String ��ȯ
		String s1 = Integer.valueOf(123).toString();
		// �̷��� ��ó���ϸ� �ڿ��� string�ΰ�, toString�� ���� �ʵ尪 ""���ڿ�""�� ��ȯ�̴ϱ�
		String s2 = 123 + "";
		// Ȥ�� �̷� ����� ���� ���� �����ϰ� �� Stringȭ �Ǿ����
		
		
		// Boxing: �⺻ �ڷ��� --> ���� Ŭ���� ��ü��
		
		// int�� 427�� Integer ��ü�� ��ȯ(����)
		Integer it1 = new Integer(427);
		Integer it2 = new Integer("427");
		// -> ���� Ŭ���� ����� �ֵ� ����: Collection ����
		//	  --> Collection�� ������ ��ü�� ���� �����ϱ� ������ �⺻ �ڷ����� ��ü�� ��ȯ�� �ʿ䰡 ����!
			  
		
		
		// UnBoxing: ����Ŭ���� ��ü --> �⺻ �ڷ���
		int iNum1 = it1.intValue(); 
		int iNum2 = (int)it2; // ����Ŭ���� ��ü�� it2�� int������ ���� ����ȯ
			
		
		// �� JDK 1.5�� �߰��� ��� 
		// : Auto Boxing / Auto UnBoxing
		// �ڵ����� �⺻ �ڷ��� <-> ����Ŭ���� ��ü�� ����ȯ
		Integer it3 = 1000; // Auto Boxing
		int iNum3 = it3; // Auto UnBoxing
		
		
				
				
				
				
				
				
				
				
				
				
				
				
	}
	
}
