package com.multicampus.biz.junit3;

import com.multicampus.biz.junit.MyCalc;

import junit.framework.TestCase;

public class MyCalcTest extends TestCase {  //TestCase ����ؾ���

	private MyCalc calc;
	
	protected void setUp() throws Exception {
		System.out.println("====> setUp()ȣ��");
		
		//�׽�Ʈ�� ����� ������ ����
		calc = new MyCalc(10, 3);
	}

	protected void tearDown() throws Exception {
		System.out.println("====> tearDown()ȣ��");
		
		//�׽�Ʈ �������� ������ �ʱ�ȭ
		calc = null;
	}

	public void testPlus() {
		System.out.println("====> testPlus()ȣ��");
		assertEquals("�����ߴ� ���� �ٸ� ����� ���ϵ�" , 13, calc.plus());
	}

	public void testMinus() {
		System.out.println("====> testMinus()ȣ��");
		assertEquals(7, calc.minus());
	}

}
