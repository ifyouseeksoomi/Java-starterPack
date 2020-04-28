package com.kh.poly.chap01.model.service;

import com.kh.poly.chap01.model.vo.Bentley;
import com.kh.poly.chap01.model.vo.Car;
import com.kh.poly.chap01.model.vo.Sonata;

public class PolyService {
	public void example1 () {
		// 다형성 (polymorphism) & 업캐스팅
		// 부모 타입 참조 변수로 자식 타입 객체를 참조하는 것. 
		// --> 부모 타입 참조형 변수 하나로 다양한 자식 객체를 참조할 수 있다.
		
		Car[] cars = new Car[2];
		
		cars[0] = new Sonata(); // 부모타입 객체배열에 자식을 하나 넣은 것
		cars[1] = new Bentley();
		
		// ★★★ 부모 타입 참조변수로 자식 객체 참조시, 
		// 자식 내부에 있는 자신(부모) 부분만 참조할 수 있다.
		// System.out.println(cars[0].hybrid());
		
		System.out.println(cars[0].toString());
		                     
		// 다운 캐스팅
		// 부모타입 참조변수로 자식 객체 전체를 참조해야될 경우
		// 부모 타입 참조 변수 -> 자식타입 참조 변수로 ""강제로""(다른말로 ""명시적으로"") 바꾸는 것!
		// ex. int num = (int) 10.123; (강제 형변환 때 int를 굳이 앞에 '명시'적으로 쓰듯)
		
		// 저 위의 배열에서, cars[0]이 참조하고 있는 자식 객체는 Sonata 타입
		// ""Sonata만의 기능을 수행하고자"" 할 때,
		// cars[0]을 부모 타입 참조 변수에서 자식 타입으로 강제 형변환(다운 캐스팅) 하면 됨
		
		// ex.
		// System.out.println(cars[0].hybrid()); : 이미 cars가 부모 객체가 된 상황이라 이때는 에러가 난다. 하이브리드 없다고 한다. 어쩌지
		
		// 형변환 연산자보다 점(.) 연산자의 우선 순위가 더 높음 그래서 이럴 때는 소괄호(우선순위 가장 높음)를 쓰자
		System.out.println( ( (Sonata)cars[0] ).hybridMode() );
		System.out.println( ( (Bentley)cars[1] ).TakeOutUmbrella() );
		
		// 다운 캐스팅 시 유의사항
		// System.out.println( (Bentley)cars[0] ); // 이거 캐스팅오류 뜨는데, 왜냐면 지금 cars[0]은 소나타에 있기로 했는데 내가 음주코딩해서 Bentley로 다운캐스팅할라고 했으니까. 근데 예방법이 있다 pdf 9페이지 참조
		
		// instanceof 연산자 사용
		// - 참조변수가 참조하고 있는 객체의 타입을 확인하는 연산자
		// - 타입 일치 시 true, 아니면 false 반환
		// <참고> instanceof 의 결과가 true일 경우 == 비교했던 타입으로 다운캐스팅이 가능하다
		
		System.out.println(cars[0] instanceof Sonata);
		// "cars[0] 참조 변수가 참조하는 객체의 타입이 Sonata인가?"의 의미임 : true 출력
		// 트루라면 ""<참고> instanceof 의 결과가 true일 경우 == 비교했던 타입으로 다운캐스팅이 가능하다""
		
		System.out.println(cars[0] instanceof Bentley);
		// 당연히 false 출력
		
		System.out.println(cars[0] instanceof Car);
		// "cars[0] 참조 변수가 참조하는 객체의 타입이 Car인가?" : true 출력 왜지?
		// 그림 그린거에서, 힙 영역 그림에 소나타 객체 그 안에 결국 Car가 있었으니까
		
		// ★★★ 다운캐스팅 가능여부 검사 
		for (int i=0; i<cars.length; i++) { // cars 배열에 반복 접근할건데, 
			
			if (cars[i] instanceof Sonata) { // 만일 현재 접근한 객체가 Sonata에 접근하고 있다면
				
				System.out.println(((Sonata)cars[i]).hybridMode()); // 하이브리드 모드 실행 하고
				
			} else if (cars[i] instanceof Bentley) { // bentley에 접근하고 있다면
				
				System.out.println(((Bentley)cars[i]).TakeOutUmbrella()); // 우산 꺼내라
			}
			
		}
		
		
		// 바인딩 확인
		System.out.println(cars[1].drive()); // cars[1]만 쓰고 자동완성할라고하면 drive() 뜨는게 Car 계층이다. 
		// 그럼 사실 "달리다"가 나와야하는데, 이거 실행하면 "날아다님"이 나오는것: 이게 동적바인딩. 코드상으로는 정적바인딩인데 실행이 동적으로 되는 것
		
		
		
	}
}
