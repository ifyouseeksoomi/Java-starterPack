package com.kh.object.chap06_constructor.model.vo;

public class UserME {
	
	
	// * ���� Ŭ���� ���ο� �����ڰ� �ۼ����� ���� ��� 
	// JVM�� ���ؼ� ������ �ܰ迡�� �⺻ �����ڰ� �ڵ����� �߰��ȴ� : public User() {}
	
	private String userId = null;
	private String userPwd = null;
	private String userName;
	private int age;
	private char gender;
	
	/* �����ε�(Over Loading, ����)
	 * �� Ŭ���� ������ ������ �̸��� �޼ҵ带 ������ �ۼ��ϴ� ���
	 * 
	 * - �����ε��� ����
	 * 0. �޼ҵ���� �����ؾ� ��
	 * 1. �Ű������� ���� (�ٸ�)
	 * 2. �Ű������� Ÿ�� (�ٸ�)
	 * 3. �Ű������� ���� (�ٸ�)
	 *
	 * 0����(�ʼ�) + �� 1~3 �� ���� �� ""�ϳ���"" ���� �� �����ε� ����
	 */
	
	// �Ű����� �ִ� ������
	// ��ü ������ ���ÿ� �Ű������� ���޹��� ������, �ʵ带 �ʱ�ȭ�ϴ� �������� ���
	public UserME (String userId, String userPwd, String userName, int age, char gender) {
		this(userName, age, gender);
		//this(userId, userPwd);		// this �����ڴ� ������ ù �ٸ� �ν�! --> �� �� �̻� �ۼ� �Ұ�
		
		// this() ������
		// - ���� Ŭ�������� �ٸ� �����ڸ� ȣ���� �� ���
		// ** this() �����ڴ� �ݵ�� ȣ���Ϸ��� �������� ���� ù��°�ٿ� �ۼ��Ǿ�� �Ѵ�.
		
		// this() ������ ��� �� ����
		// 1) �ߺ� �ڵ� ����
		// 2) �ڵ� ���� ����
		
		this.userId= userId;
		this.userPwd = userPwd;
		/*this.userName= userName;
		this.age =age;
		this.gender = gender;*/
	}

	public UserME (String userId, String userPwd) {
		this.userId = userId; // "���⿡�ٰ� �Ű������� �޾ƿ�(�����) �������̵� �ʱ�ȭ�ϰڴ�"
		this.userPwd = userPwd; 
	}
	
	// �Ű������� ������ �ٸ��Ƿ� �����ε��� ����
	public UserME (String userName, int age, char gender) {
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}
	
	// �����Ͱ� �Ű������� ������ �ٲ������ �� �����ε��� ����
	public UserME (char gender, String userName, int age) {
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}
	
	// ���� �����Ͱ� �Ű������� ������ ������, Ÿ���� �ٸ��Ƿ� �����ε��� ����
	public UserME (String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	// ���� �Ͱ� ������ �ٸ���? �׷��� �ʴ� ������ �̸� �Ⱥ��� String�� ��! 
	// �� ����, Ÿ��, ���� ��� ��ġ --> �����ε� �Ұ�
	/* public User (String userName, String userId, String userPwd) {
			this.userId = userId;
			this.userPwd = userPwd;
			this.userName = userName;
	} */

	
	public UserME() {
		
	}
	
	
	


	
	
}
