
package com.kh.inherit.chap02.model.vo;

public class Book extends Object {
	// extends Object 미 작성시
	// JVM에 의해서 컴파일 단계에서 자동 추가
	
	// object class는 
	
	private String title;
	private String author;
	private int price;
	
	// 기본생성자
	public Book() {}
	
	// 매개변수 있는 생성자 써보기
	public Book (String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//public String selectField () {
	//	return author + title + price;
		
	/* @Override 어노테이션
	 * - annotation: 
	 *   컴파일러에게 특정 코드나 상황을 알려주는 역할
	 *   
	 * - @Override: 
	 *   컴파일러에게 해당 부모 메소드가 자식에 의해서 오버라이딩(재정의)되었다는 것을 ""알려주는"" 역할임
	 * 
	 * + 과거에는 오버라이드 표시가 필수였으나, 현재는 없어도 상관이 없다.
	 * 	  대신, 개발자들간의 코드 공유 시 가독성을 위하여 필히 작성하는 편이 좋음. 
	 */
	
	
	
	
	
	@Override
	public String toString() {
		// Object.toString() 용도
		// 생성된 객체의 필드 정보를 모두 출력하는 메소드를 따로 만들지말고 
		// 이를 오버라이딩해서 사용하도록 자바에서 제공하는 메소드
		return title + " / " + author + " / " + price; // selectField 쓰지 말고 이거 쓸 것 
	}
	
	

	
	// hashCode()
		// 동등No, 동일비교할 때(동일 객체 검사) 사용함 + 검색속도 향상용
		
		// HashSet, HashMap, HashTable 등등에서 사용됨
	
	@Override
	public int hashCode() {
		// 중복되지 않는 hashCode를 만드는데에 왜 31을 사용하는가?
		// --> 31은 홀수이면서 적당히 큰 소수이고 비트연산이 굉장히 빠르게 진행될 수 있는 수고
		//	       이 수를 통해 만들어지는 hashCode의 충돌이 가장 적어서 전통적으로 사용되고 있음.
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	// Object.equals () 오버라이딩
	// 객체가 같은지를 판별
	// 오버라이딩 전 equals()의 역할: 두 객체의 시작주소가 같은지를 판별
	// 오버라이딩 후 equals()의 역할: 객체가 가지고 있는 필드 값이 같은지를 판별
	
	
	
	/*
	@Override 
	public boolean equals(Object obj) {
		
		// 1. 객체의 시작 주소가 같은지 비교
		// 시작 주소가 같다 == true
		if(this == obj) {
			return true;
		} 
		
		// 2. 전달받은 주소가 null인지 판별
		// null의 의미: 참조하는 곳이(주소값)이 없다
		// 전달받은 주소가 null인 경우 비교 가치가 없음. 무조건 false.
		if(obj == null) {
			return false;
		}
		
		// 클래스 형변환 필요(오버라이드 규칙에 의해 76번에서 Object을 써야하므로)
		// obj는 Object을 참조하는 변수였지만
		// 이를 Book을 참조하는 변수로 형변환
		Book other = (Book) obj; // 다형성
		
		// 3. 두 객체간의 필드 값 비교 시작
		
		// 제목 비교
		if(this.title != null && other.title != null) { 
			// 제목이 모두 null이 아닐 때만 비교해라. null이면 비교하는 의미가 없다고 했으니까.
			// "두 book 객체에 모두 title이 있을 경우
			
			if(!this.title.equals(other.title)) { 
			// title이 같지 않다면 다른 것 --> false (즉 두 책 제목이 같을 경우 이 코드 실행 X)
				return false; 
			}
			
		} else {	// 둘 중 하나 또는 둘다 null인 경우는 다른 것 --> false
			return false;
		}
		
		
		// 저자 비교
		if (this.author != null && other.author!=null) {
		
			if (!this.author.equals(other.author)) {
				return false;
			}
			
		} else {
			return false; 
		}	
	
		
		// 가격비교
		if(this.price!=other.price) {
			// price는 기본자료형이기 때문에
			// 주소 비교가 필요 없고 값 자체만 비교하면 됨
			return false;
		}
		
		// 여기까지 코드가 진행되었다면
		// == 필드값이 모두 같다
		// == ""동등"" 객체이다 (동등 != 동일)
		
		return true;
		
		// 동등 vs. 동일
		// 동등: 서로 다른 객체이나 값이 같다
		// 동일: 완죠니 같은 객체 의미
		
	}
	*/
	
	public String informationTransfer () {
		return "내부에 작성된 정보를 읽는 사람에게 전달한다." ;
		
	}
	
	
	
	
}
		
	
	



