package com.devmind.springApp.withXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ITeacher teacher = context.getBean("historyTeacher", ITeacher.class);
        System.out.println(teacher.getHomework());

    }

}
