package com.kh.poly.chap01.ex.model.service;

import com.kh.poly.chap01.ex.model.vo.Electronics;
import com.kh.poly.chap01.ex.model.vo.Tablet;

public class ElectronicsService {

	// 필드로 부모타입 객체배열을 선언 및 할당하여 자식 객체들을 한번에 관리 pdf p.5
	private Electronics[] el = new Electronics[3];  // 왜 () 안해 ?? : 지금 이거 객체생성아니고 객체배열선언임
			// (부모타입객체)
	
	private int index =0;
	// 일반적인 배열 넣기 안하고 내부로부터 받아오겠다. 그게 뭐냐면 아래 있음
	
	// 내부에서 생성된 객체 주소를 전달받아 el 배열에 추가 
	
	/* public void insert(Desktop desk) {}
	public void insert(Laptop desk) {} 
	public void insert(Tablet tap) {} */
	
	// 오버로딩을 사용해도 되나, 코드 길이가 너무 길어 비효율적 (사실 이대로 쓰면 거의 10줄 나옴)
	// --> ""다형성을 적용""하여 ""매개변수의 타입을 부모타입으로 하여"" ""자식 객체 주소를 전달받도록"" 함
	// 먼소리냐면
	
	public void insert(Electronics e) { // 이건 매개변수에 다형성 적용
		        // 별안간 Electronicsview에 생성자 만들면서 여기에 값 들어갔음 (0x200)
		el[index++] =e; // 이건 객체 배열에 다형성 적용
		
		// index번째 el요소에 전달받은 자식 객체 주소를 추가하고 
		// index를 1 증가시킴
	
	}
	
		// 전체 정보 조회
		public String selectAll() {
			String str = "\n@@@@@ 전체 상품 조회 @@@@@\n";
					
			for(int i=0; i<el.length; i++) {
				str += el[i].toString() + "\n";
						// 부모(electronics) 호출하겠다. 즉 지금까지는 정적인데 동적바인딩되는게
				// el[i].toString() : 부모의 toString()을 호출하고 있지만 (정적 바인딩)
				// 실제 실행 시 자식의 오버라이딩된 toString()을 호출함 (동적 바인딩)
			}
			
			return str;
				
		} 
		
		// 각 기기 정보 조회
		/* public Desktop selectOne(int i) {}
		   public Laptop selectOne(int i) {} */
		// 전자 기기 하나씩의 정보를 반환해야되는 경우
		// 기기별로 타입이 모두 다르므로 반환형을 다르게 해서 메소드를 작성해야 함.
		// 하지만, 오버로딩은 성립하지 않는데 이유는 ""매개변수가 모두 동일하므로""
		// 그래서 메소드를 따로따로 만들어야 하지만 번거롭고 효율적이지 않음.
		// 그래서, 이번에는 --> ★★★ 반환형에 다형성을 적용해본다. 
		
		public Electronics selectOne(int i) {
			return el[i-1]; 
		}
		
		// 기기 판매 가능 여부(품절)
		public String selectSoldOut(Electronics e) {
			if (e instanceof Tablet) { // 만약 지금 니가 받은 e가 태블릿 타입이라면,
				return "판매 불가[품절]";
			} else {
				return "판매 가능";
			}
		}
		
}










