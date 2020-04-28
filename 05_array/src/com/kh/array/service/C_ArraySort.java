package com.kh.array.service;

import java.util.Arrays;

public class C_ArraySort { // �迭 ����
	
	public void example1() {
		// �� ������ ���� ���� �ٲٱ� / ������Ʈ �ʱ� ���� ����
		
		int a = 10;
		int b = 20;
		
		// �� ������ ���� �ٲٱ� ���� �ӽ� ���� ����
		
		int tmp;
		
		tmp = a; 					// 1) a: 10, b: 20, tmp: 10
		a = b;						// 2) a: 20, b: 20, tmp: 10
		b= tmp; 					// 3) a: 20, b: 10, tmp: 10
		
		// �̷��ٰ� ���߿� tmp �Ⱦ��� �˾Ƽ� GC�ȴٴ� ���
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		// ��¥ �ٲ�����..
			
	}
	
	public void example2() {
		// �迭 ������ �ε������� �� �ٲٱ�
		int[] arr = {2, 1, 3};
		
		int tmp = arr[0];
		arr[0]= arr[1];
		arr[1]=tmp;
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void example3() {
		// ���� ���� (insertion sort) / ������Ʈ �ʱ� ����
		// ���� �˰��� �� ���� �����ϰ� �⺻�� �Ǵ� �˰���
		
		int[] arr = {2, 5, 4, 1, 3};
		// ������������ ����!
		
		// ���� ������ �� ��° ��(�� 1���ε���)���� ����!
		for(int i=1; i<arr.length; i++) {
			// i�� ���ؼ� ���õ� �ε���: �� ��ü
			// 1�� �ε����� ��ü: 0~0
			// 2�� �ε����� ��ü: 0~1
			// 3�� �ε����� ��ü: 0~2
			// 4�� �ε����� ��ü: 0~3
			// �ٵ� ���� ~n ���� n�� �� i�̸��̳�! �׷��� ������ © ���� �ִٴ� �Ҹ�
			
			for(int j=0; j<i; j++ ) {
				// i�� �񱳵Ǳ� ���� j �ε���: �� ���
				
				// �������� ������ ���� �� ����
				if(arr[i] < arr[j]) { // �̰� >�� < �ٲٸ� ����/���� ���� �ٲ�
					// �� if ���ǹ��� ���� '��ü�� ��󺸴� ������'
					int tmp = arr[i]; // i�� j�� �ƹ��ų� ����
					arr[i] = arr[j];
					arr[j] = tmp;
				} // if end
			} // ���� for end
		} // �ٱ� for end
		
		System.out.println(Arrays.toString(arr));
	
	}
	
	public void example4() {
		// ���� ���� (Selection Sort)
		// �񱳵��� ���� �迭 ��ü�� Ž���Ͽ� �ּڰ��� ã�� 
		// �迭�� ���ʺ��� ä�������� ���� ���
		
		// �� �������� ���� ���� ��� ���� ������ ���̴� ���� ���
		// ������ 100�� �̻���� �������ϰ� �ް��ϰ� �Ͼ
		
		int[] arr= {2, 1, 4, 5, 3};
		System.out.println("���ʹ迭: " + Arrays.toString(arr));
		
		int min=0; 
			// �� ���� �迭 ��(�� ���� ����) ���� ���� ���� �����ϰ� �ִ� �ε����� ����
		for (int i=0; i<arr.length-1; i++) {
			// �� ���� ������ �迭�� ���� -1����°���� ������ �Ϸ��
			
			min = i;
			for (int j=i+1; j<arr.length; j++) {
				// ������ �����ϰ� ���ʿ��� ���� ���� ���� ã��
				
				if(arr[j] < arr[min] ) {
				   //����     	//����
					min =j; // �� �ε����� ���� �۾Ҵ� ��� ��
				} // if end
			} // ���� for end
			
			int tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
			
			System.out.println(i+1 + "����" + Arrays.toString(arr));
		
	}

}
}
