package com.kh.poly.chap01.practice.model.vo;

public class Member {

	private String name;
	private int age;
	private char gender;
	private int couponCount; // =0 �Ƚᵵ JVM�� ���ؼ� �⺻������ 0 �����ϹǷ� ��� �Ȱ���
	// private�� ���� ����: �ܺηκ����� ���������� �����ϴ� encapsulation�� ȿ�� (���������� �� �ֵ��� ���ͽ���)
	
	public Member () {}
	public Member (String name, int age, char gender) {
		// �����ϴ� ����ī��Ʈ�� ���� �ʴ´�: ����ī��Ʈ�� �Է��� ���� �ʰڴٴ� �ǹ� << �̷� ���� �� üũ�ؾ��Ѵ�
		this.name = name;
		this.age = age;
		this.gender = gender;	
		// this ��������: ���� ��ü(�� ��ü)�� ���� �ּ� �����Ͻÿ� 
		// �� this() ������: �� �ȿ� �ִ�(���� ��ü�� �ִ�) �ٸ� ������ ȣ���ϰ� ���� �� ���� ��
		//				���� �� Ŭ���� �̸� �Ἥ Member() �̷������� �ϸ� X
		// super: ���� Ŭ���� or �θ� Ŭ���� �� ���� �ּҸ� ����Ű�� ���� ����
	}
	
		
	public String getName () {
		return name;
	} // getter: �ܺο��� �ʵ尪�� ���Ƿ� ��ȯ���� �� �ʿ��ϴ�
	
	public void setName(String name) {
		this.name = name;
	} // setter : ���� ���ϴ� ���̹Ƿ� �������� ���� ������ �ݵ�� void, �º� ���� ��ü��(this.) ~�� �캯 ~�� �ְڴ�.

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getCouponCount() {
		return couponCount;
	}
	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	} 
	
	// object�� toString�� �����ϴ� ����: "�������̵��ؼ� ��ü�� ������ �ִ� �ʵ� ���� �����϶�"�� �ǹ�
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", couponCount=" + couponCount + "]";
	}
	
}
