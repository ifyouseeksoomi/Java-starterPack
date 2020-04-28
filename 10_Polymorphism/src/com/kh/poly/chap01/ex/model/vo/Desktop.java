package com.kh.poly.chap01.ex.model.vo;

public class Desktop extends Electronics { // 자식1
	private String graphicCard;
	
	public Desktop () {}

	public Desktop(boolean power, String brand, String sNum, String graphicCard) { // 부모의 특징까지 싸잡아서 생성자할 때는 alt+shift+s -> o 한 다음에 화살표탭 눌러서 옆에 매개변수 있는거 누르기
		super(power, brand, sNum);
		this.graphicCard = graphicCard;
	}


	public String getGraphicCard () {
		return graphicCard;
	}
	
	public void setGraphicCard (String graphicCard) {
		this.graphicCard = graphicCard;
	}

	@Override
	public String toString() {
		return "Desktop [" + super.toString() + ", graphicCard=" + graphicCard + "]";
	} // super.toString을 끼어 넣은 것: 부모가 오버라이드한 것들도 오버라이드하겠다
	
	
	
	
	
}
