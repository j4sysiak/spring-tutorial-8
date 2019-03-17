package pl.jaceksysiak.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("pl/jaceksysiak/spring/test/beans/beans.xml");


		Jungle jungle  = (Jungle)context.getBean("jungle");
		
		System.out.println(jungle);
	 
		 ((ClassPathXmlApplicationContext)context).close();

	}

 

}




























