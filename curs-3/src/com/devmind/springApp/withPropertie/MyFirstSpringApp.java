package com.devmind.springApp.withPropertie;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyFirstSpringApp {

    public static void main(String[] args) {

        // create the object
        TeacherFactory teacherFactory = new TeacherFactory();

        String teacherType = "";
        try(InputStream input = new FileInputStream("config.properties")){
            Properties prop = new Properties();

            prop.load(input);
            teacherType = prop.getProperty("teacherType");
        } catch (IOException ex){
            ex.printStackTrace();
        }

        ITeacher theTeacher = teacherFactory.getTeacher(teacherType);
        // use the object
        System.out.println(theTeacher.getHomework());
    }

}
