package com.kh.variable.practice1;

public class VariablePractice3 {
	
	public void method3() {
		
		java.util.Scanner method3 = new java.util.Scanner(System.in);
		
		System.out.print("가로: ");
		double width = method3.nextDouble();
		
		System.out.print("세로: ");
		double length = method3.nextDouble();
		
		method3.nextLine();
		
		System.out.printf("\n면적: " + (width*length));
		System.out.printf("\n둘레: " + (width+length)*2);
		
	}

}
