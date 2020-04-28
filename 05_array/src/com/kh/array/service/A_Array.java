package com.kh.array.service;

import java.util.Scanner;

public class A_Array {
	// �迭 
	// - ""���� �ڷ���""�� ������ �ϳ��� �������� �ٷ�� ��.
	// - ����� ������ �ε����� ������.(�ε��� ������ 0)
	
	public void example1() {
		
		
		// �迭�� �ʿ伺�� �ľ��غ���!
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		// ...
	    int num1000=0;
		
		// ���� �ڷ����� ������ ������ �ʿ��� ���
		// ���� ���� ������δ� �Ѱ谡 �ִ�. (Ư�� ���������� �� ���� �� ��� �ٲ�ٰ��ϸ� ����)
	    
	    // �迭 �̿��Ͽ� ����, �Ҵ�, �ʱ�ȭ ����
	    
	    
	    // 1. �迭 ���� (���� ����� ũ�� �ٸ��� �ʴٸ� ��ȣ�� ����.[] == �迭�� ��Ÿ���� ��ȣ)
	    // �ڷ���[] �迭��;
	    // �ڷ��� �迭��[];
	    
	    int[] arr; // int�� �迭 �������� ����
	    // �ڡ� �迭�� ������ ������ �������̴�!!
	    
		
	    // 2. �迭 �Ҵ� (�Ҵ�: �޸𸮻� ������ ���� ������ Ȯ���ϴ� ��)
	    // �̹� ������ �迭��= new �ڷ��� [���ϴ� �迭ũ��];
	    // 							  (==�迭 ĭ��)
	    
	    // �ڡڡ� new �������� �ǹ�
	    // - Heap ������ ���ο� ������ �Ҵ��Ѵ�
	    
	    arr = new int[4]; 
	    // �޸� ���� �׸� ����
	    
	    // 3. �迭 �ʱ�ȭ
	    // �迭�� [�ε���] = ��;
	    arr[0] =10;
	    arr[1] =20;
	    arr[2] =30;
	    arr[3] =40;
	    // arr[4] =50; 
	    // int �� ĭ¥���� ������� ������(�Ҵ��߱� ������), out of range�� �� == ����
	    
	    System.out.println("arr[0]: " + arr[0]);
	    System.out.println("arr[1]: " + arr[1]);
	    System.out.println("arr[2]: " + arr[2]);
	    System.out.println("arr[3]: " + arr[3]);
	    
	    // int �迭 ���� �� 4ĭ �Ҵ�   
	    int arr2[]=new int[4]; // int[] arr2; ���ٴ� ������ �� �� �� int�ʿ� �Ⱥ���
	    
	    // �迭��.length : �迭�� ���̸� ��ȯ
	    for(int i=0; i<arr2.length; i++) { // length: ������ new int[4]��ϱ� 4�� ��ȯ�� ��
	    	// ��   0    ~   4�̸�����      1������
	    	
	    	arr2[i]= (i+1)*5;
	    	// i == 0 --> arr2[0] = 5
	    	// i == 1 --> arr2[1] = 10
	    	// i == 2 --> arr2[2] = 15
	    	// i == 3 --> arr2[3] = 20
	    		    	
	    }
	    
	    // for������ �迭 �� ��� ���
	    for(int i=0; i<arr2.length; i++) {
	    	System.out.println("arr2[" + i + "] =" + arr2[i]); // arr2[0] = 
	    	
	    }
	    
	}
	
	  public void example2() {
	    	
	    	// double�� �迭 darr ���� �� 5ĭ�� �Ҵ��ϰ�
	    	// �� index�� 1.0���� 1�� �����ϴ� ���� �����ϰ� ���
		  
		  double[] darr;
		  darr = new double[5];
		 		  
		  darr[0] = 1.0;
		  darr[1] = 2.0;
		  darr[2] = 3.0;
		  darr[3] = 4.0;
		  darr[4] = 5.0;
		  
		  System.out.println("arr[0]: " + darr[0]);
		  System.out.println("arr[1]: " + darr[1]);
		  System.out.println("arr[2]: " + darr[2]);
		  System.out.println("arr[3]: " + darr[3]);
		  System.out.println("arr[4]: " + darr[4]);
		    
		  
	  }
	  
	  public void example3() {
		  
		  
		  Scanner sc = new Scanner(System.in);
		  int iArr[];
		  
		  System.out.println("�迭 ũ��: ");
		  int size =sc.nextInt();
		
		  // �Էµ� ũ�� ��ŭ�� �迭 �Ҵ�
		  iArr = new int[size];
		  
		  for(int i=0; i<iArr.length; i++) {
			  System.out.print("iArr[" + i + "] = ");
			  iArr[i] = sc.nextInt();
			  sc.nextLine();
		  }
		  
		  for(int i=0; i<iArr.length; i++) {
			  System.out.println("iArr[" + i+"]�� ����� ��: " + iArr[i]);
	    	
	    }
	       
	  }
	  
		public void example4() {
			// �迭 ����, �Ҵ�, �ʱ�ȭ �ѹ��� �ϱ�
			
			// int�� arr ���� �� 5ĭ �Ҵ� �� 
			// 1, 2, 3, 4, 5�� ������ �ε����� �����ϱ�.
			
			int arr[] = {1, 2, 3, 4, 5};
			// �迭 ����	// �迭 �Ҵ� �� �ʱ�ȭ 	     	: �װ� �ѹ��� �� ��
			
			System.out.println("arr �迭�� ����: " + arr.length);
			
			for (int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			
		}
		
		public void example5() {
			// 5���� Ű ������ �Է¹޾� �迭�� �����ϰ�
			// 5���� Ű ��հ��� ���.
			
			Scanner sc= new Scanner(System.in);
			
			double heights[] = new double[5];
			// double�� �迭 heights ���� �� �Ҵ�
			
			// 5�� �Է� -> �ݺ���(for)
			// ��� == �հ�/�ο� ��
			// �հ� --> sum�� �̿��� ����
			
			
			for (int i=0; i<heights.length; i++) {									// i�� �ε��� ��, �׸��� i<5 �̷��� ���߿� �������� ���� : �� �ε��� ���̷� �Ĺ����°� �� ��
				System.out.print((i+1)+"��° �Է�: ");
				heights[i] = sc.nextDouble();										// �Է¹��� ������ ������ �迭�� ������� �迭�ϴ� ����
				sc.nextLine();
			}
			
			// �հ� ���ϱ� : �ϴ� �հ� ���� ���� ����
			
			double sum=0; 															// �̷��� �ᵵ �޸𸮻󿡴� �ڵ�����ȯ�Ǿ 0�� �ƴ϶� 0.0���� ����ǰ� �ȴ�.
			
			for(int i=0; i<heights.length; i++) {									// ��� �ٵ� ���� �������� int i=0; �ߴµ� �� ���� �ֳ�? ���� �ֳĸ� ������ �ѹ� ������ �����
				sum += heights[i];
				
			}
			
			System.out.println("���: "+ sum/heights.length);
			
		}
		 
		
		public void example6 () {
			// �迭�� ����
			// 1) �� ���� �ڷ����� ������ �� �ִ�.
			// 2) �ѹ� ������� �迭�� ũ�� ������ �Ұ����ϴ�. (�ε��� �� ���� �Ұ�) : 3ĭ¥�� �迭 ����� �ϳ� �߰��ϰų�, �����ϰų� �̷� �� ����.
			// ex) �� ĭ¥�� �迭�� ������µ�, ���� ����� �����ʹ� �� ���� ����. ������ ������ ���� ������ 9997�� ������ ������ �׷� ���� ���ٴ� ���.
			
			// �Է¹��� ũ�� ��ŭ�� �迭 �Ҵ��ϱ�
		
			Scanner sc = new Scanner(System.in);
			System.out.println("ũ�� �Է�: ");
			int size = sc.nextInt();
			//sc.nextLine();								// �� �Ⱦ��ĸ� ������ �޴� ���� �����ϱ� ������ ���� �Ƚᵵ �Ǵ� ��!
			
			// �Է¹��� �� ��ŭ�� ũ�⸦ ������ �迭 ���� �� �Ҵ�
			int arr[]=new int[size];
			
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]);					// �������� �ϰ� ���� �����ϸ� 0�� �ټ����� ���´�. int���� �⺻���� 0�̰�, �ε����� 5�� ��� ����. JVM�� �׷��� �⺻ �Ҵ��� ��.
			}
			 
			// ������ ũ�⸦ �Ѿ ��ġ(�ε���)�� ���� �� ��� �Ǵ��� Ȯ��
			// arr[size] = 3; 								// ���� �߻� (ArrayIndexOutofBoundsException): �迭�� �ε��� ������ �Ѿ�� ���� �߻�
			
			// ���� �迭���� 2�� ū �迭�� ���Ӱ� �Ҵ��Ͽ� arr������ ������ �� �ְ� �ڵ� �ۼ�
			arr = new int[size*2];
			System.out.println("\n�þ �迭 ����: " + arr.length);
			System.out.println("arr[size:] : " + arr[size]);
			
		}
		
		public void example7() {
			// �Է¹��� ���ڿ��� char�� �迭�� �� ���ھ� �����ϱ�
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���ڿ� �Է�: ");
			String input = sc.nextLine();
			
			// Hello 	5ĭ¥�� �ʿ�
			// hi 		2ĭ¥�� �ʿ�
			
			// �迭�� ����: �迭��.length 	(<-�� ����)		�迭�� () �Ⱥ���
			// ���ڿ��� ����: ������.length() 	(<-�� �޼ҵ�)		���ڿ��� () ����
								
			// String(���ڿ�)�� ���� ��ŭ�� char �迭 ���� �� �Ҵ�
			char cArr[] = new char[input.length()];				
			// ���⼭ length() �ϴ°Ŵ� �� �ٸ� ��.
			
			for (int i=0; i<cArr.length; i++) {
				cArr[i] = input.charAt(i);
			}										// input�ϳ��� �� ĭ�� �迭 �Ҵ��ϰ�
			
			for (int i=0; i<cArr.length; i++) {
				System.out.println("cArr" + i + " �ε��� ��: " + cArr[i]);
			}										// �� input �� �迭�� ������ ���
			
			System.out.println();
			System.out.println("ã������ ����: ");
			char ch = sc.nextLine().charAt(0);
				
			for(int i=0; i<cArr.length; i++) {
				if(cArr[i] == ch) {
					System.out.println(i);			// ���� �˻��� �������� ���� (���� ����? ������ �̰� �ƴ� ����)
				}
			}
		
		} 

			
		public void example8() {
			// String �迭�� �޸� ����
			
			// String �迭 ����, �Ҵ�, �ʱ�ȭ
			
			String sArr[] = {"���", "�ܹ���", "¥���", "�������", "���ö�"};					// �迭�� �������ڸ��� �ʱ�ȭ�� �Ҷ��� {} ���
			for(int i=0; i<sArr.length; i++) {
				System.out.println(sArr[i]);
			}
		}
		
		public void example9() {
			// �޴��� �ԷµǾ� �ִ� String �迭 ���� �� �ʱ�ȭ ��
			// ������ �߻����� �޴��� �ϳ� �����غ���!!
			
			Scanner sc= new Scanner(System.in);
			
			String menu[] = {"���", "�Ե�����", "����Ƽ", "Į����", "���"};
			
			// �ٵ� ������? ������ ��
			
			// ������ �߻� ��Ű�� ���: Math.random()
			// Math Ŭ����: �ڹٿ��� �����ϴ� ���а��� ����� ����ִ� Ŭ����
			
			// Math.random()�� �߻���Ű�� ������ ����
			// 0 <= x <1 (double������ ���� �߻���Ŵ ��� index�� ������ �Ǵµ�)
			
			double ran = Math.random();
			// 0<= x < 1�� ������ 0 <= x <5�� ������ ������ �� �ְ� ���� �߰� 
			// �� int������ ����ȯ (�ֳĸ� index�� int���� ���ϱ�~!)
			
			int r = (int) (ran*menu.length);
			
			System.out.println("������ ���ɸ޴�: " + menu[r]);
	
	  }
		
		
}  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
	


