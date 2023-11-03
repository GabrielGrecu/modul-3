package com.devmind.springApp.withXML;

public class JavaTeacher implements ITeacher {

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private WisdomWordsService wisdomWordsService;

    private HomeworkService homeworkService;

    public JavaTeacher(WisdomWordsService wisdomWordsService, HomeworkService homeworkService, int age) {
        this.wisdomWordsService = wisdomWordsService;
        this.homeworkService = homeworkService;
    }

    @Override
    public String getHomework() {
        return "java teacher ";
    }

    @Override
    public String getWisdom() {
        return wisdomWordsService.getMessage();
    }

}