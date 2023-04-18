package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ApplicationContext context = new AnnotationConfigApplicationContext(CoreConfiguration.class);
        ConsoleApplication consoleApplication = context.getBean("consoleApplication", ConsoleApplication.class);
        consoleApplication.run();
    }
}
