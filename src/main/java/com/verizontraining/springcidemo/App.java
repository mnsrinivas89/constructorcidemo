package com.verizontraining.springcidemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/verizontraining/springcidemo/config.xml");
	    Book book = (Book) ctx.getBean("book");
	    //System.out.println(book);
	    Country country = (Country) ctx.getBean("country");
	    //System.out.println(country);
	    Club club = (Club) ctx.getBean("club");
	    
	    System.out.println(club);
	    

	}
}
