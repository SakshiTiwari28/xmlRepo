package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class GreetingApp 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ctx =new ClassPathXmlApplicationContext("Greetings.xml");
       // Greeting cf = ctx.getBean("festivalGreeting",Greeting.class);
        Greeting cf = ctx.getBean("rakhi",Greeting.class);
        System.out.println(cf.sayGreeting());
    }
}
