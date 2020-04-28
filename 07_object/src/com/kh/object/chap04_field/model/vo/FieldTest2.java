package com.kh.object.chap04_field.model.vo;

public class FieldTest2 {

	public void print() {
		FieldTest1 f1 = new FieldTest1();
		System.out.println(f1.num1);
		System.out.println(f1.num2); 		// 상속을 모르기 때문에 이것도 어찌할 수가 없다
		System.out.println(f1.num3);
		// System.out.println(f1.num4); 	// num4의 접근제한자는 private로 클래스 외부에서는 직접 접근이 불가능하여 에러 발생
	}
}
