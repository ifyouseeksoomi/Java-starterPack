package com.kh.poly.chap01.ex.model.service;

import com.kh.poly.chap01.ex.model.vo.Electronics;
import com.kh.poly.chap01.ex.model.vo.Tablet;

public class ElectronicsService {

	// �ʵ�� �θ�Ÿ�� ��ü�迭�� ���� �� �Ҵ��Ͽ� �ڽ� ��ü���� �ѹ��� ���� pdf p.5
	private Electronics[] el = new Electronics[3];  // �� () ���� ?? : ���� �̰� ��ü�����ƴϰ� ��ü�迭������
			// (�θ�Ÿ�԰�ü)
	
	private int index =0;
	// �Ϲ����� �迭 �ֱ� ���ϰ� ���ηκ��� �޾ƿ��ڴ�. �װ� ���ĸ� �Ʒ� ����
	
	// ���ο��� ������ ��ü �ּҸ� ���޹޾� el �迭�� �߰� 
	
	/* public void insert(Desktop desk) {}
	public void insert(Laptop desk) {} 
	public void insert(Tablet tap) {} */
	
	// �����ε��� ����ص� �ǳ�, �ڵ� ���̰� �ʹ� ��� ��ȿ���� (��� �̴�� ���� ���� 10�� ����)
	// --> ""�������� ����""�Ͽ� ""�Ű������� Ÿ���� �θ�Ÿ������ �Ͽ�"" ""�ڽ� ��ü �ּҸ� ���޹޵���"" ��
	// �ռҸ��ĸ�
	
	public void insert(Electronics e) { // �̰� �Ű������� ������ ����
		        // ���Ȱ� Electronicsview�� ������ ����鼭 ���⿡ �� ���� (0x200)
		el[index++] =e; // �̰� ��ü �迭�� ������ ����
		
		// index��° el��ҿ� ���޹��� �ڽ� ��ü �ּҸ� �߰��ϰ� 
		// index�� 1 ������Ŵ
	
	}
	
		// ��ü ���� ��ȸ
		public String selectAll() {
			String str = "\n@@@@@ ��ü ��ǰ ��ȸ @@@@@\n";
					
			for(int i=0; i<el.length; i++) {
				str += el[i].toString() + "\n";
						// �θ�(electronics) ȣ���ϰڴ�. �� ���ݱ����� �����ε� �������ε��Ǵ°�
				// el[i].toString() : �θ��� toString()�� ȣ���ϰ� ������ (���� ���ε�)
				// ���� ���� �� �ڽ��� �������̵��� toString()�� ȣ���� (���� ���ε�)
			}
			
			return str;
				
		} 
		
		// �� ��� ���� ��ȸ
		/* public Desktop selectOne(int i) {}
		   public Laptop selectOne(int i) {} */
		// ���� ��� �ϳ����� ������ ��ȯ�ؾߵǴ� ���
		// ��⺰�� Ÿ���� ��� �ٸ��Ƿ� ��ȯ���� �ٸ��� �ؼ� �޼ҵ带 �ۼ��ؾ� ��.
		// ������, �����ε��� �������� �ʴµ� ������ ""�Ű������� ��� �����ϹǷ�""
		// �׷��� �޼ҵ带 ���ε��� ������ ������ ���ŷӰ� ȿ�������� ����.
		// �׷���, �̹����� --> �ڡڡ� ��ȯ���� �������� �����غ���. 
		
		public Electronics selectOne(int i) {
			return el[i-1]; 
		}
		
		// ��� �Ǹ� ���� ����(ǰ��)
		public String selectSoldOut(Electronics e) {
			if (e instanceof Tablet) { // ���� ���� �ϰ� ���� e�� �º� Ÿ���̶��,
				return "�Ǹ� �Ұ�[ǰ��]";
			} else {
				return "�Ǹ� ����";
			}
		}
		
}










