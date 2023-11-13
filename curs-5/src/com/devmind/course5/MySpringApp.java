package com.devmind.course5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Teacher teacher = context.getBean("teacher", Teacher.class);
        teacher.doHomwork();

        Task firstTask = context.getBean("task", Task.class);
        firstTask.run();
        firstTask.generateId();


//        School firstSchool = context.getBean("school", School.class);
//        School secondSchool = context.getBean("school", School.class);
//
//        System.out.println(firstSchool.getAddress().getStreetName());
//
//        System.out.println(firstSchool == secondSchool);
        context.close();
    }




}
