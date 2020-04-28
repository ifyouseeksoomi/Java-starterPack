package com.kh.poly.chap01.model.service;

import com.kh.poly.chap01.model.vo.Bentley;
import com.kh.poly.chap01.model.vo.Car;
import com.kh.poly.chap01.model.vo.Sonata;

public class PolyService {
	public void example1 () {
		// ������ (polymorphism) & ��ĳ����
		// �θ� Ÿ�� ���� ������ �ڽ� Ÿ�� ��ü�� �����ϴ� ��. 
		// --> �θ� Ÿ�� ������ ���� �ϳ��� �پ��� �ڽ� ��ü�� ������ �� �ִ�.
		
		Car[] cars = new Car[2];
		
		cars[0] = new Sonata(); // �θ�Ÿ�� ��ü�迭�� �ڽ��� �ϳ� ���� ��
		cars[1] = new Bentley();
		
		// �ڡڡ� �θ� Ÿ�� ���������� �ڽ� ��ü ������, 
		// �ڽ� ���ο� �ִ� �ڽ�(�θ�) �κи� ������ �� �ִ�.
		// System.out.println(cars[0].hybrid());
		
		System.out.println(cars[0].toString());
		                     
		// �ٿ� ĳ����
		// �θ�Ÿ�� ���������� �ڽ� ��ü ��ü�� �����ؾߵ� ���
		// �θ� Ÿ�� ���� ���� -> �ڽ�Ÿ�� ���� ������ ""������""(�ٸ����� ""���������"") �ٲٴ� ��!
		// ex. int num = (int) 10.123; (���� ����ȯ �� int�� ���� �տ� '���'������ ����)
		
		// �� ���� �迭����, cars[0]�� �����ϰ� �ִ� �ڽ� ��ü�� Sonata Ÿ��
		// ""Sonata���� ����� �����ϰ���"" �� ��,
		// cars[0]�� �θ� Ÿ�� ���� �������� �ڽ� Ÿ������ ���� ����ȯ(�ٿ� ĳ����) �ϸ� ��
		
		// ex.
		// System.out.println(cars[0].hybrid()); : �̹� cars�� �θ� ��ü�� �� ��Ȳ�̶� �̶��� ������ ����. ���̺긮�� ���ٰ� �Ѵ�. ��¼��
		
		// ����ȯ �����ں��� ��(.) �������� �켱 ������ �� ���� �׷��� �̷� ���� �Ұ�ȣ(�켱���� ���� ����)�� ����
		System.out.println( ( (Sonata)cars[0] ).hybridMode() );
		System.out.println( ( (Bentley)cars[1] ).TakeOutUmbrella() );
		
		// �ٿ� ĳ���� �� ���ǻ���
		// System.out.println( (Bentley)cars[0] ); // �̰� ĳ���ÿ��� �ߴµ�, �ֳĸ� ���� cars[0]�� �ҳ�Ÿ�� �ֱ�� �ߴµ� ���� �����ڵ��ؼ� Bentley�� �ٿ�ĳ�����Ҷ�� �����ϱ�. �ٵ� ������� �ִ� pdf 9������ ����
		
		// instanceof ������ ���
		// - ���������� �����ϰ� �ִ� ��ü�� Ÿ���� Ȯ���ϴ� ������
		// - Ÿ�� ��ġ �� true, �ƴϸ� false ��ȯ
		// <����> instanceof �� ����� true�� ��� == ���ߴ� Ÿ������ �ٿ�ĳ������ �����ϴ�
		
		System.out.println(cars[0] instanceof Sonata);
		// "cars[0] ���� ������ �����ϴ� ��ü�� Ÿ���� Sonata�ΰ�?"�� �ǹ��� : true ���
		// Ʈ���� ""<����> instanceof �� ����� true�� ��� == ���ߴ� Ÿ������ �ٿ�ĳ������ �����ϴ�""
		
		System.out.println(cars[0] instanceof Bentley);
		// �翬�� false ���
		
		System.out.println(cars[0] instanceof Car);
		// "cars[0] ���� ������ �����ϴ� ��ü�� Ÿ���� Car�ΰ�?" : true ��� ����?
		// �׸� �׸��ſ���, �� ���� �׸��� �ҳ�Ÿ ��ü �� �ȿ� �ᱹ Car�� �־����ϱ�
		
		// �ڡڡ� �ٿ�ĳ���� ���ɿ��� �˻� 
		for (int i=0; i<cars.length; i++) { // cars �迭�� �ݺ� �����Ұǵ�, 
			
			if (cars[i] instanceof Sonata) { // ���� ���� ������ ��ü�� Sonata�� �����ϰ� �ִٸ�
				
				System.out.println(((Sonata)cars[i]).hybridMode()); // ���̺긮�� ��� ���� �ϰ�
				
			} else if (cars[i] instanceof Bentley) { // bentley�� �����ϰ� �ִٸ�
				
				System.out.println(((Bentley)cars[i]).TakeOutUmbrella()); // ��� ������
			}
			
		}
		
		
		// ���ε� Ȯ��
		System.out.println(cars[1].drive()); // cars[1]�� ���� �ڵ��ϼ��Ҷ���ϸ� drive() �ߴ°� Car �����̴�. 
		// �׷� ��� "�޸���"�� ���;��ϴµ�, �̰� �����ϸ� "���ƴٴ�"�� �����°�: �̰� �������ε�. �ڵ�����δ� �������ε��ε� ������ �������� �Ǵ� ��
		
		
		
	}
}
