package com.devmind.springApp.homework;

import com.devmind.springApp.withXML.ITeacher;
import com.devmind.springApp.withXML.JavaTeacher;

public class MyContainer {
    private Animal animal;

    public Animal getAnimal(){
        if(animal == null){
            animal = new Dog();
        }
        return animal;
    }
}
