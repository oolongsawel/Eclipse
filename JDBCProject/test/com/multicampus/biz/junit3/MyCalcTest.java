package com.multicampus.biz.junit3;

import com.multicampus.biz.junit.MyCalc;

import junit.framework.TestCase;

public class MyCalcTest extends TestCase {  //TestCase 상속해야함

	private MyCalc calc;
	
	protected void setUp() throws Exception {
		System.out.println("====> setUp()호출");
		
		//테스트에 사용할 데이터 설정
		calc = new MyCalc(10, 3);
	}

	protected void tearDown() throws Exception {
		System.out.println("====> tearDown()호출");
		
		//테스트 종료전에 데이터 초기화
		calc = null;
	}

	public void testPlus() {
		System.out.println("====> testPlus()호출");
		assertEquals("예측했던 값과 다른 결과가 리턴됨" , 13, calc.plus());
	}

	public void testMinus() {
		System.out.println("====> testMinus()호출");
		assertEquals(7, calc.minus());
	}

}
