package com.kh.poly.chap02.ex1.model.vo;

public interface Animal {
	
	// �������̽��� �ʵ�� ������ public static final 
	// public static final int SOUL =1;
	
	// �������̽��� �ʵ�� ����������(�տ� �Ⱥ�������) public static final
	int SOUL =1;
	
	
	// �������̽��� �޼ҵ�� ������ public abstract �Դϴ�
	public abstract String breath();
	
	// �������̽��� �޼ҵ�� ����������(�տ� ������) public abstract 
	String eat();
	
	
	// �������̽��� ����ϴ� Ű����
	/* 
	 * �������̽��� 'Ŭ����'�� ���: implements (""�����ϴ�""�� ��. �������� ���� ��)
	 * �������̽��� '�߻� Ŭ����'�� ���: implements
	 * --> ���: �����ư� ""Ŭ������"" �������̽� ��� �� ������ implements!
	 * 
	 * �������̽��� �������̽��� ���: extends 
	 * (�ֳĸ� �������̽� ��ü�� ���� �̿ϼ��̴ϱ� �̿ϼ��� �θ� �̿ϼ��� �ڽ��� �޾Ƽ� �� ū �̿ϼ��� �ϳ��� �Ǵ� ��)
	 * 
	 */
	
	

}
