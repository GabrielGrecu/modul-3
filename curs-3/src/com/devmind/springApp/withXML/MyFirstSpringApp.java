package com.devmind.springApp.withXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ITeacher teacher = context.getBean("javaTeacherXML", ITeacher.class);
        System.out.println(teacher.getHomework());
        System.out.println(teacher.getWisdom());
        System.out.println(teacher.getHomework());

        ITeacher mathTeacher = context.getBean("mathTeacher", MathTeacher.class);
        System.out.println(mathTeacher.getWisdom());

        JavaTeacher javaTeacher = context.getBean("javaTeacherXML", JavaTeacher.class);
        System.out.println(javaTeacher.getAge());

    }

}
