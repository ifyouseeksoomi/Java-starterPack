package com.kh.poly.chap02.ex2.model.vo;

public abstract class AllinOnePrinter implements Printer, Scanner {
	// �������̽��� ���߻���� �����ϴ�! , �� �̾�� �� ����ó��
	// Ŭ�������� ��ӿ����� ���� ��� 
	
	// �߻� Ŭ����
	// --> �߻� �޼ҵ尡 ""0�� �̻�"" �����ϴ� Ŭ���� (��� �ȴٴ� ����) 
	// --> �� �߻� �޼ҵ尡 �ϳ��� ���µ��� �߻�Ŭ������ �θ� �� ����
	
	private String brand; // ������
	private String pName; // ��ǰ��
	
	public AllinOnePrinter() {} // �⺻ ������
	// �߻� Ŭ����, �������̽��� �̿��Ͽ� ��ü�� ���� �� �ִ�?  X
	// why? �̿ϼ� Ŭ�����δ� ��ü ������ �Ұ��ϱ� ������~!
	
	// �ƴ� �ٵ� �߻�Ŭ������ �� �����ڸ� �ۼ�?
		// �� AllinOnePrinter�� ��� ���� � �ڽ�Ŭ������ ���ο� �θ�κ��� ���������װ�
		// �װ��� ���ؼ��� �����ڰ� �ݵ�� �ʿ��ϱ� ������ ���� ���̴�
		// --> �� �ڽ� ��ü ���� �� ���ο� �θ� ""�κ�""�� �����ϱ� ���ؼ� �ʿ�� �ϳ�, �̸� �̿��Ͽ� ���� �θ� ""��ü""�� ���� �� ����
		
	public AllinOnePrinter(String brand, String pName) {
		super();
		this.brand = brand;
		this.pName = pName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() { 
		return "AllinOnePrinter [brand=" + brand + ", pName=" + pName + "]";
	}
	
	
	
	
}
