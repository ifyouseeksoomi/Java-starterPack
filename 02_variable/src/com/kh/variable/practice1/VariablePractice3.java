package com.kh.variable.practice1;

public class VariablePractice3 {
	
	public void method3() {
		
		java.util.Scanner method3 = new java.util.Scanner(System.in);
		
		System.out.print("����: ");
		double width = method3.nextDouble();
		
		System.out.print("����: ");
		double length = method3.nextDouble();
		
		method3.nextLine();
		
		System.out.printf("\n����: " + (width*length));
		System.out.printf("\n�ѷ�: " + (width+length)*2);
		
	}

}
