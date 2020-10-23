package polymorphism4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//FactoryPattern factory = new FactoryPattern();
		
		ClassPathXmlApplicationContext container = 
		// 1. ������ �����̳ʸ� ����(����)�Ѵ�
		new ClassPathXmlApplicationContext("business-layer.xml");
		
		
		
		// 2. ������ �����̳ʷκ��� �׽�Ʈ�� ��ü�� �˻��Ѵ� Lookup
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
		
		
		// 3. �����������̳ʸ� �����Ѵ�
		container.close();
		
		
	}
}
