package singletonDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	private static ApplicationContext ap;

	public static void main(String[] args) {

		ap = new ClassPathXmlApplicationContext("singletonDemo/XMLForSingleton.xml");
		SingletonTestClass s= (SingletonTestClass) ap.getBean("s");
		System.out.println("value of s.i :"+s.i);
		
		SingletonTestClass s1= (SingletonTestClass) ap.getBean("s");
		s1.i=6;
		System.out.println("value of s.i :"+s.i);
		
	}

}
