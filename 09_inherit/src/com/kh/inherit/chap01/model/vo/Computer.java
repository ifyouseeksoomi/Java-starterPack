package com.kh.inherit.chap01.model.vo;

// Computer Ŭ������ Product Ŭ������ ���
// ��� Ű����: extends
// �θ��� ��� + �ڽ��� ��� -> �θ𺸴� ������ Ȯ��(����)��

public class Computer extends Product { // ���� ��Ű�� �ȿ� �־ ����Ʈ �ʿ� X
	private String cpu;
	private int ram;
//	private String pName;
//	private int price;
	
	// �⺻������
	public Computer() {
		super (); // '����'�� �ǹ̷�, ��ǻ�͸� ���� �� product�� ����� �� ������ ��ǻ�͸� ������'�ǹ� // + 
				  // �⺻�����ڴ� �ۼ����� �ʾƵ� JVM�� ���� ������ �ܰ迡�� �ڵ� �߰��ȴ�.
	}

	// ������ �ڵ��ϼ� 
	// alt + shift + s -> o (Generate Constructor using Fields... )
	public Computer(String cpu, int ram, String pName, int price) {
		super();
		this.cpu = cpu;
		this.ram = ram;
//		this.pName = pName;
//		this.price = price;
	}

	// getter / setter 
	// alt + shift + s -> r
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

//	public String getpName() {
//		return pName;
//	}
//
//	public void setpName(String pName) {
//		this.pName = pName;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
	

	// �ʵ� ���� ��� ��ȯ�ϴ� �޼ҵ�
	public String selectField() {
		return cpu + " / " + ram;
	// + pName + " / " + price;
	}
	

}
