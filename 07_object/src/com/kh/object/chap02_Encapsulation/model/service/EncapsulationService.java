package com.kh.object.chap02_Encapsulation.model.service;

import com.kh.object.chap02_Encapsulation.model.vo.Player;

public class EncapsulationService {

	public void createPlayer() {
		
		Player p1 = new Player();
		// player ��ü ����
		
		// p1.name = "ȫ�浿";
		// p1.event = "LOL"; 			
			// �����߻�: name, event�� private�� �Ӽ����� �������Ƿ� �ڵ� �ϼ���� X. �ܺ� ������ ���ܵǾ� ����.
		
		// setter�� �̿��Ͽ� p1�� �̸� ����
		p1.setName("ȫ�浿");
		p1.setEvent("����");
		p1.setUniform("����Ű");
		p1.setKookdae(true);
		
		// getter�� �̿��Ͽ� p1�� ���õ� name ������
		System.out.println("p1�� �̸�: " + p1.getName());
		System.out.println("p1�� ����: " + p1.getEvent());
		System.out.println("p1�� ������: " + p1.getUniform());
		System.out.println("p1�� ���뿩��: " + p1.getKookdae());
	}
}

