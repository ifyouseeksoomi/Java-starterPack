package com.kh.api.chap01.model.service;

import java.util.Scanner;

public class StringService {
	// String Ŭ����
	// - immutable(�Һ�) ��ü�� �ѹ� ������ ���ڿ��� ���� �Ұ��� 
	// 	 --> ���� �� ���ο� ���ڿ� ��ü�� �����ǰ� �ش� �ּҸ� ��ȯ��
	
	public void example1() {
		// 1) String �� ���� ��, �ּҰ� �ٲ����?
		
		String s1 = "ABC";
		// System.out.println(s1.hashCode());
		// String�� hashCode()�� ���ڿ��� �̿��Ͽ� ���� ���ϴ� ���̱� ������
		// �ּҰ� ������ Ȯ���ϴµ��� ������ 
		// --> System.identityHashCode() ���!
		// --> ��ü�� ���� ���� �ּҸ� �̿��Ͽ� hashCode�� ����� �޼ҵ�
		
		System.out.println("���� �� s1: " + System.identityHashCode(s1));
		
		s1 = "ABCD";  // s1 ����
		System.out.println("���� �� s1: " + System.identityHashCode(s1));
		
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println("str1.equals(str2): " + str1.contentEquals(str2));
		System.out.println("str1==str2: " + (str1==str2));

		// String Literal(���ͷ�)�� String�� ���� ��
		// ���� ���ڿ��� ��� ���� �ּҸ� ��ȯ�Ѵ�.
		// (+String Pool)
		
		String str3 = new String("Hello");
		System.out.println("str3: " + str3);
		
		System.out.println("str1 === str3: " + (str1 == str3));
		// �̰� �� false�ĸ� ���� �Ҵ� ����� ȥ�ڸ� �� ������ ��ü �Ҵ� �� �����ϴ� ������
		// �ٵ� �̶��� �� ������ constant pool �ܺζ�� ��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("str4 �Է�: ");
		String str4 = sc.nextLine();
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str4));
		System.out.println("str1 == str4: " + (str1 == str4));
		
		System.out.println("String ���� �񱳰� �ʿ��ϸ� equals() ����� ��!");
		System.out.println("String�� �Һ��̴�.");
		
	}
	
	public void example2() {
		// StringBuffer
		// - ���ڿ� ������ ������ mutable(����) ��ü
		
		StringBuffer sb = new StringBuffer();
		// StringBuffer ��ü�� �⺻�����ڷ� ���� �� �⺻ ���� ũ�� ""16""�� �Ҵ���.
		
		// capacity: �뷮 Ȯ��
		System.out.println("sb.capacity(): " + sb.capacity());
		
		System.out.println("sb.hashCode(): " + sb.hashCode());
		// hashCode�� ���콺�� ������ ��� object Ŭ������ hashCode��� ���´� �� ����,
		// Stringbuffer Ŭ������ hashCode()�� �������̵� ���� �ʾҴٴ� ���� �ǹ�
		// Object.hashCode() : ��ü �ּҸ� �̿��Ͽ� �ؽ��ڵ� ����
		
		// append(): ���� ���ڿ� �ڿ� �߰�
		sb.append("java api");
		System.out.println("�߰� �� sb.capacity(): " + sb.capacity());
		System.out.println("�߰� �� sb.hashCode(): " + sb.hashCode());
		
		// ����� �����ϴ�, ���� ���ڿ� �ڿ� �߰������� ��� ���� ����.
		// �������� �����ִ� ����̴� (�ӿ��� ��� ������ ��ȭ�ؼ� ������ �������� ī�ĳ� �ؽ��ڵ忡 ��ȭ�� ���ٴ� ��)
		
		sb.append("1234567890"); // ���� �뷮�� 16�� �ʰ� (���� java api�� ���� ���� 18����)
		System.out.println("���߰� �� sb.capacity(): " + sb.capacity());
		System.out.println("���߰� �� sb.hashCode(): " + sb.hashCode());
		
		// �̹����� �ؽ��ڵ�� �״���̳� �ּҴ� ���Ѵ�. (������ +1)*2 ��ŭ����
	
		System.out.println("sb: "+ sb/*.toString()*/); // ������ toString �ٴ� ���̶�� �Ҹ�
		
		// StringBuffer�� String���� ��ȯ�ϴ� ���
		String str = sb.toString();
		// toString�� ��Ȯ�� ��: �ʵ� ������ ��������� ""���ڿ�""�� ��ȯ�϶�
		
		
	}
	
	public void example3() {
		// String.split(������); (StringTokenizer�� ���)
		// --> ���ڿ��� �ش� �����ڸ� �������� �ɰ��� String[] ���·� ��ȯ
		
		String str = "���, ����, ����, ������, ����, ���, ������, �ڵ�";
		
		// ,(����)�� �����ڷ��Ͽ� ����
		String[] arr = str.split(", "); 
 		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void example4() {
		// WrapperŬ����: �⺻�ڷ���(Primitive Data Type, ����Ÿ��)�� ��üȭ ���ִ� Ŭ���� 
	}
	
	
	
}
