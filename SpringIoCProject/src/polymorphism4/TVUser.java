package polymorphism4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//FactoryPattern factory = new FactoryPattern();
		
		ClassPathXmlApplicationContext container = 
		// 1. 스프링 컨테이너를 생성(구동)한다
		new ClassPathXmlApplicationContext("business-layer.xml");
		
		
		
		// 2. 스프링 컨테이너로부터 테스트할 객체를 검색한다 Lookup
		TV tv1 = (TV) container.getBean("tv");
		TV tv2 = (TV) container.getBean("tv");
		TV tv3 = (TV) container.getBean("tv");
		
		
		System.out.println(tv1.toString());
		System.out.println(tv2.toString());
		System.out.println(tv3.toString());
		
		tv1.powerOn();
		tv1.volumeUp();
		tv1.volumeDown();
		tv1.powerOff();
		
		
		// 3. 스프링컨테이너를 종료한다
		container.close();
		
		
	}
}
