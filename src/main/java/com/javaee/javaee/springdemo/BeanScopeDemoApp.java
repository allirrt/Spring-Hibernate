package com.javaee.javaee.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach theCoach1 = context.getBean("myCoach", Coach.class);

        boolean b = theCoach.equals(theCoach1);
        boolean b1 = theCoach == theCoach1;

        System.out.println(b);
        System.out.println(b1);
        context.close();
    }
}
