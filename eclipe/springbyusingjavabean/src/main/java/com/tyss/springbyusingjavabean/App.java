package com.tyss.springbyusingjavabean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
        Car bean = context.getBean(Car.class);
        System.out.println(bean);
    }
}
