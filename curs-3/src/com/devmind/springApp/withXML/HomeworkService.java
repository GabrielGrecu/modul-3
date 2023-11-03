package com.devmind.springApp.withXML;

public class HomeworkService {
    private String homework = "Homework service";

    public void setHomework(String message) {
        this.homework = message;
    }

    public String getHomework(){
        return homework;
    }
}
