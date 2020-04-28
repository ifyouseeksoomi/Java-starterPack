package com.kh.object.chap02_Encapsulation.model.vo;

// vo(Value Object): ��(������)�� ������ �� �ִ� ��ü�� ����� ���� Ŭ����

public class Player { // ������� �߻�ȭ�� Ŭ����
	
	// ----- �Ӽ� -----
	// * ĸ��ȭ ��Ģ: Ŭ������ ��� ����(�ʵ�)�� private�� �ٿ� �ܺηκ����� ���� ������ �����ϴ� ��
	
	// public String name; 			// �̸� (ĸ��ȭ ������)
	private String name; 			// �̸�
	private String event; 			// ����
	private String uniform;			// ������
	private boolean kookdae; 		// ���� ����
	
	// ----- ��� -----
	// Ŭ���� ���ο� ���� �� �ִ� ����� ����
	// 1) ��� ����(�ʵ�)�� �̿��� ���� ó���� �ϴ� ���
	// 2) �Ӽ�(�ʵ�)�� �ܺο��� ���� ������ �� �ִ� ���			// ����: �Ӽ�=�������=�ʵ�
	// 	  --> getter / setter �޼ҵ�  					// �ʵ帶�� getter setter�� �� �־� ����
	
	
	// name�� ���� get/setter �ۼ�
	
	// ""getter"": ��ü�� ���� ""�ܺη� ��ȯ""�ϴ� ""����� ����""�� ""�޼ҵ�""
	// �ܺο��� ������ �� �ֵ��� ""public����"" �����ؾ� ��
	
		public String getName() {	
		// --> String (��ȯ��): �޼ҵ� ���� �� ""��ȯ�Ǵ�"" ���� �ڷ���
		
			// return: �޼ҵ� ���� �� ȣ���� ������ ���������� ���� �ۼ�.
			return name; 
			// �ܺο��� getName() ȣ�� �� ��ü�� ����Ǿ��ִ� name ��ȯ
			
		}
		
	// ""setter"": ��ü�� ���� ""���""�ϴ� ����� ������ �޼ҵ�
	// �ܺο��� ������ �� �ֵ��� ""public����"" ����
			
		public void setName(String name) {
							// �ٷ� �� ��ȣ�ӿ� ���� ���� �Ű�����(�Ķ����)
							// �޼ҵ� ȣ�� �� ���޵Ǵ� ���� �޾ƿ�
							// �ش� ��� ���� �� �ʿ��� ��
			// name= name;
			// �Ű������� �Ű������� �ְڴٴ°� �ƴ϶�
			
			this.name = name;
			// ���⼭�� this�� "�� Ŭ������" or "���� ��ü��" ��. �� ""���� ��ü�� ���� �ּ�""�� ����Ŵ
			// �º��� name�� �캯�� name ���� �ٸ� ���� ���� �� �� ����
			
		
		}
		
		// event get/setter �ۼ��غ���
		
		// ""getter""
		
		// public ��ȯ�� get������() { 					// ������ ������ �빮�ڷ� �� ��
		// 	 return ������(�ʵ��);
		// }
		
		public String getEvent() {
			return event; 
		}
		
		// ""setter""
		
		// public void set������(�Ű�����) { 			// ������ ������ �빮�ڷ� �� ��
							  // �Ű������� set�Ϸ��� �ʵ�� ���� �ڷ��� ������ �ۼ�
		// 		this.�ʵ�� = �Ű�������;
		// }
		
			public void setEvent(String event) {
				this.event = event;
			}

		
		// uniform, kookdae getter/setter �ۼ��غ���
		public String getUniform () {
			return uniform;
		}
			public void setUniform(String uniform) {
				this.uniform = uniform;
			}
		
			
		public boolean getKookdae () {
			return kookdae;
		}
			public void setKookdae(boolean kookdae) {
				this.kookdae = kookdae;
			}
		



}
	
	


