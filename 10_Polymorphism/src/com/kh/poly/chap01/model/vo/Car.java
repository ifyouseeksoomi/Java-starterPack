package com.kh.poly.chap01.model.vo;

public class Car {
	private String engine;
	private String colour;
	
	public Car () {}

	public Car(String engine, String colour) {
		super();
		this.engine = engine;
		this.colour = colour;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", colour=" + colour + "]";
	}
	
	// ���ε� Ȯ��
	// ���ε��̶�? ���� ������ �޼ҵ�� ȣ��Ǵ� �޼ҵ带 �����ϴ� ��
	
	public String drive () { 
		return "�޸���."; 
	}
	
	// �������� ����� ���¿��� ex) Car c = new Bentley();
	// c.drive()�� ȣ���ϸ� ������ �ܰ迡���� Car�� �ִ� drive()�� ���ε��� ���� : �̰� �ٷ� ""���� ���ε�"" (�ڵ常���� ����, ī�� �ִ� ����̺긦 �ҷ��� �̰Ŵϱ�)
	
	
	
	
	
	
	
}
