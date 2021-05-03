package com.springcore.lifecyclemethod;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Applife {
	public static void main( String[] args )
    {
    	// create and configure beans//configure the xml file
    	
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecyclemethod/configlife.xml");
		Popcorn p=(Popcorn) context.getBean("pop");
		Pepsi p1=(Pepsi) context.getBean("pep");
		System.out.println(p);
		System.out.println(p1);		 
		context.registerShutdownHook();
		}
}
