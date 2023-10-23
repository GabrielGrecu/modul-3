package com.devmind.springApp.withoutXMLorProperties;


public class MyFirstSpringApp {

    public static void main(String[] args) {

        TeacherFactory teacherFactory = new TeacherFactory();

        String teacher = "JAVA_TEACHER";

        ITeacher theTeacher = teacherFactory.getTeacher(teacher);

        System.out.println(theTeacher.getHomework());
    }

}
