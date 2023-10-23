package com.devmind.springApp.withoutXMLorProperties;

public class TeacherFactory {
    public ITeacher getTeacher(String type){
        return switch (type){
            case "JAVA_TEACHER" -> new JavaTeacher();
            case "JAVA_MATH" -> new MathTeacher();
            case "HISTORY_TEACHER" -> new HistoryTeacher();
            default -> throw new RuntimeException("teacher not found");
        };
    }
}
