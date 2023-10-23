package com.devmind.springApp.homework;

import com.devmind.springApp.withXML.ITeacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Animal animal = context.getBean("dog", Animal.class);
        System.out.println(animal.makeSound());

    }

}
