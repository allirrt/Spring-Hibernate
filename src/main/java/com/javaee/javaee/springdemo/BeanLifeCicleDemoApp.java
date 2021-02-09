package com.javaee.javaee.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCicleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLiveCycle_applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        context.close();


    }
}
