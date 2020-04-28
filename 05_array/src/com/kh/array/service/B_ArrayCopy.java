package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {
	// ���� ���� : �����ϴ� �迭�� ���� �ּҸ��� ����
	// ���� ���� : �����ϰ��� �ϴ� �迭�� ������ �ڷ���, ũ�⸦ ������ �迭�� ����� ���� �����͸� �Ȱ��� �ۼ�(����)�ϴ� ��
	//       : ��� �ַ� ���� ���� ���ĸ�, ���������͸� �����ϸ鼭 �� �����͸� �����ٰ� ���� �߰��۾��� �ϰ� ���� �� (example4)
		
	// �ᱹ ��.���� ��.���� ���̴� ���������͸� ������ �� �ִ��� �������� ������ ��!
				
		
	public void example1 () {
		// ���� ���� �� ���������� ���� ���� Ȯ��
		
		int origin[] = {10, 20, 30, 40, 50};
		
		// ���� ���� ����
		int copyArr[] = origin;
		// �迭 ������ ������ ����� �ּҰ��� �����ؿ�
		
		// ������ ���� �� ����
		System.out.println(Arrays.toString(origin));
		// Arrays�� �ڹٿ��� �����ϴ� �⺻ Ŭ������ : �迭�� ���ϰ� ����ϰų� �Ǵ� �߰����� ����� �����ϴ� Ŭ����
		// Arrays.toString(�迭��)
		// : �迭 ���� �����͸� �ѹ��� ���
		
		// ������ ���� �� ���纻
		System.out.println(Arrays.toString(copyArr));
		
		// ���纻�� �����͸� ����
		copyArr[2] = 10000;
		
		System.out.println("\n���纻 �� ���� ��");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// �迭�� �ؽ��ڵ� ���
		// �ؽ��ڵ��? �ּҰ��� �ؽ��Լ���°� �̿��Ͽ� ����� ����
		// �ؽ��Լ���? Ư�� ���ڿ��� ������ ������ ���·� ����. 
		// ex. 1234 �� �ؽ��Լ��� �־����� asdfjiowejtkalsd�� ���Դ�. 
		//     �� ���ڿ��� Ư�� ���̸�ŭ���� �ƹ����Գ� �������ִ� ��
		
		// ����: ���� �ּҰ��� ���� ��� �ؽ��ڵ嵵 ���� ���̴�
		System.out.println("\norigin�� hashCode(): " + origin.hashCode());
		System.out.println("copyArr�� hashCode(): " + copyArr.hashCode());
		
	}
	
	public void example2() {
		// for���� �̿��� ���� ���� + ���������� ���� Ȯ��
		
		int[] origin = {1, 2, 3, 4, 5}; 
		// index��ȣ�� origin0, origin1, origin2, origin3, origin4 �̷��� �Ǵ� �Ű� ���� 1, 2, 3, 4, 5�ΰŴ�
		
		// ���� ���縦 �Ϸ��� ���� �ڷ���, ���� ũ�� �̻��� �迭�� ���� �� �Ҵ��ؾ���
		int[] copyArr = new int[origin.length];				// 60~63 �̰��� ���� ������ process
														 	// for���� ���Ŀ� ���ī�ǽ����� �Ҽ��� �ִ�
		for(int i=0; i<copyArr.length; i++) {
			copyArr[i] = origin[i]; 						// ���� ���� �Ϸ�!
															
		
			}

		System.out.println("���� ��: ");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// ���纻 ������ ����
		copyArr[2] = 9999;
		
		System.out.println("���� ��: ");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// �� �迭�� �ؽ��ڵ� ��� (�ٸ��� Ȯ��)
		System.out.println("\norigin�� hashCode(): "+ origin.hashCode());
		System.out.println("copyArr�� hashCode(): "+ copyArr.hashCode());
		
}
	
	public void example3() {
		// System.arraycopy()�� �̿��� ���� ���� + ���������� ���� Ȯ��
		
		int[] origin = {1, 2, 3, 4, 5};
				
		// ���� ���縦 �Ϸ��� ���� �ڷ���, ���� ũ�� �̻��� �迭�� ���� �� �Ҵ��ؾ���
		int[] copyArr = new int[origin.length];
				
		//ex2�� �޸� ���� for���� ����� �ý����� ���ī��(�ڹ� �⺻ ������)�� ����
		// System.arraycopy(�����迭��, ������� �ε��� ����, ���纻 �迭��, ���纻���� ����� ��ġ ����, ���� ����)
		System.arraycopy(origin, 0, copyArr, 0, origin.length);

		System.out.println("���� ��: ");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// ���纻 ������ ����
		copyArr[2] = 9999;
				
		System.out.println("���� ��: ");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
				
		// �� �迭�� �ؽ��ڵ� ��� (�ٸ��� Ȯ��)
		System.out.println("\norigin�� hashCode(): "+ origin.hashCode());
		System.out.println("copyArr�� hashCode(): "+ copyArr.hashCode());
				
	}
	
	public void example4() {
		// ó���� �迭 ũ�⸦ �Է��ϰ� �ش� ũ�⸸ŭ�� �Է��� �����Ͽ� �� �ε����� ���� �ʱ�ȭ��.
		// �Է� �Ϸ� ��, �߰������� �� �Է��� ������ �ִ��� ����� ���� ���, �߰��� �ʿ��� �迭 ũ�⸦ �Է¹޾� 
		// �ٽ� �þ �迭 ũ�⸸ŭ �Է��� ����.
		
		// �߰������� �Է��� ������ ���ٸ� 
		// �迭�� ����� ��� ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 ũ�� �Է�: ");
		int size = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[size];		// �迭 �ʱ�ȭ�� (size�� ���� size ������ �迭�� ����ڴٴ� �ǹ�)
		
		int i=0;						// �� �ε����� �����ϱ� ���� �ʱ�ȭ ��, 0���� �ϴ°� ���� 0 1 2 3�̷��� ���ϱ� / �� �� �ʱ�� ���� �ʵ��� ����
		while(true) {					// ���ǹ��� �� true���°�: ���� �������� �� ����������
			System.out.print(i + "��° �ε��� �Է�: ");	
			arr[i] =sc.nextInt();
			sc.nextLine();
			
			i++;						// ���� i�� �ε������� �� �̻��� ���̸� �������״ϱ� �̷����� �Ʒ����� �������� ���µ�
			
			// ������ i���� ���� �迭 ���̿� ���ٸ�, (�� �ε����� �� �̻��� �����)
			if(i==arr.length) {
				System.out.print("�߰��� �Է��Ͻðڽ��ϱ�? (�ƹ��ų�/n) : ");
				char ch = sc.nextLine().charAt(0);
				
				if(ch == 'n') {
					break;				// 'n' �Է½� �ݺ��� ���� / �� �б⹮�� ���� �������ִ� while��(129)���� �ۿ��� ��
				} else {
					System.out.print("�߰��� �迭 ����: ");
					size += sc.nextInt();
					sc.nextLine();
					
					// ���� ����� �迭 ���� �� �Ҵ� (�� ���� �� ���� ���⼭ �ϳĸ� �߰��� �迭 ���̸� ���� ����, ���� ���簡 �ʿ������°Ŵϱ�)
					int[] copyArr = new int[size];
					
					// ���� ���� ����
					System.arraycopy(arr, 0, copyArr, 0, arr.length);
					
					// arr������ ���� ����� �迭 �ּҸ� ���� (���� ����)
					// = ������ ���� ���� ��, �Ʒ� ������ ����������� �ϴ� ����
					arr = copyArr;
				}
			}
		}
		
		// arr�� ����� ���� ��� ���
		for(int j=0; j<arr.length; j++) {
			System.out.println("arr[" + j + "] =" + arr[j]);
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
