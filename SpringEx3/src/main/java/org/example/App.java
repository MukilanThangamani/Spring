package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        Student student = (Student) context.getBean("std1");
        student.show();
    }
}
