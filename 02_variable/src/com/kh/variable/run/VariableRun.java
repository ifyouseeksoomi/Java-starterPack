package com.kh.variable.run;

import com.kh.variable.controller.A_Variable;
import com.kh.variable.controller.B_Constant;
import com.kh.variable.controller.C_Casting;
import com.kh.variable.controller.D_Overflow;
import com.kh.variable.controller.E_Printf;
import com.kh.variable.controller.F_Scanner;

public class VariableRun {
	public static void main(String[] args) {
		
		A_Variable var = new A_Variable() ;
		
		// ���� ��� X
		//var.noVariable();
		
		// ���� ��� O
		//var.usingVariable();
		
		// ���� ����
		//var.declareVariable();
		
		// ���� ����� ���ÿ� �ʱ�ȭ
		//var.initVariable();
		
		B_Constant cont = new B_Constant();
		
		//cont.finalVariable();
		
		C_Casting cast = new C_Casting();
		
		// �ڵ� �� ��ȯ
		//cast.autoCasting();
		
		D_Overflow of = new D_Overflow();
		// of.overflowEx();
		
		E_Printf pf = new E_Printf();
		// pf.printfMethod();
		
		F_Scanner scan = new F_Scanner();
		// scan.scannerEx1();
		scan.scannerEx2();
		
		}
	
	
}
