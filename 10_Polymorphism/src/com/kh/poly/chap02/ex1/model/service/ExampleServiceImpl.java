package com.kh.poly.chap02.ex1.model.service;

public class ExampleServiceImpl implements ExampleService {

	@Override
	public String javaFeatures() {
		return "��ü���� ��� / GC���� �޸� ���� / �ü�� ������(�̽ļ�) / ����ϱ⽱�ٴµ� ���� �ƴ�  ���" ;
	}

	@Override
	public String defineInheritance() {
		return "�ٸ� Ŭ������ ������ �ִ� ����� ���� �ۼ��� Ŭ�������� ���� ������ �ʰ� \n�� Ŭ������ �ڽ��� ���ó�� ����� �� �ִ� ���"
				+ "\n1) ��� Ŭ������ Object Ŭ������ �ļ��̸�" +
				"\n2) �θ� Ŭ������ �����ڿ� �ʱ�ȭ ����� ��� ���� �ʰ�"
				+ "\n3) �θ��� private ����� ����� �ǳ� ���� ������ �ȵȴ�";
	}

	@Override
	public String definePolymorphism() {
		return "<�������� ���¸� ���´�>�� ������, ����� �̿��� ���" 
				+"\n��� ���迡 �ִ� ���� Ÿ���� �ڽ� ��ü�� ������ �� �ִ� ���" 
				+"\n�����δ� ��ĳ���ð� �ٿ�ĳ������ �ִ�."
				+"\n��ĳ������ �θ� Ÿ���� ������ ������ ��� �ڽ� Ÿ�� ��ü�� �ּҸ� �����ϴ� ��"
				+"\n�ٿ�ĳ������ �̹� �ڽ� ��ü �ּҸ� ���� �θ� ������ ������ �ڽ��� ����� �����ؾ� �� ��," 
				+"\n�θ� Ŭ���� Ÿ���� ������ ������ �ڽ� Ŭ����Ÿ������ ����ȯ �ϴ� ��" 
				+"\n�ڵ����� �̷������ �۾��� �ƴϹǷ� �ݵ�� �ڽ� Ÿ���� �տ� ()�� ����ؾ� �Ѵ�";
	}

	@Override
	public String defineAbstractClass() {
		return "";
	}

	@Override
	public String defineInterface() {
		return null;
	}

	@Override
	public String gugudan(int start, int end) {
		return null;
	}

	@Override
	public String reverseStar(int input) {
		return null;
	}

}
