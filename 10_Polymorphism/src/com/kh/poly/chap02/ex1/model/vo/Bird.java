package com.kh.poly.chap02.ex1.model.vo;

public abstract class Bird implements Animal { // 
	public static final int BIRD_LEG =2;
	private String wingType; 
	
	// �⺻ ������
	public Bird () {}
	// �����ڸ� ���� �� ������ �ش� �����ڷ� ���� ��ü ������ ���� ����
	// �ٵ��� ������ ����� ������ �̴㿡 super()�ؼ� ����Ҷ�� �׷��°��� (�ڽ��� super() �����ڸ� ����ؾߵǹǷ�!)
	
	// �� �� �ְų�, �� �� ���ų�, ���ƴ� �ٴϳ� ����� �ٸ��ų� �� �� �ִ�
	// --> ��ü������ �ʰ� ��Ȯ���� --> �߻� �޼ҵ�� ǥ��
	public abstract String fly(); // �̰� �����ϱ� ���� �̰� �߻� Ŭ����.
	
	public String flappingWing() {
		return "������ �ĴڰŸ�";
	}

	// ���ͽ��� ���巹�� �ȸ����Ǵ°� ���Ŵ� �̹� �ۺ�����ƽ���̳��̴�
	public String getWingType() {
		return wingType;
	}

	public void setWingType(String wingType) {
		this.wingType = wingType;
	}

	
	
	
	
}
