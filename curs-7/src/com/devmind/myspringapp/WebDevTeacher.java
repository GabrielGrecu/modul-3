package com.devmind.myspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebDevTeacher {
    ITeachingService iTeachingService;

    @Autowired
    TipsAndTricksService tipsAndTricksService;

    @Autowired
    public WebDevTeacher(ITeachingService iTeachingService) {
        this.iTeachingService = iTeachingService;
    }

    public void teach() {
        System.out.println(iTeachingService.teachSomething());
    }

    public void printTip() {
        System.out.println(tipsAndTricksService.getTip());
    }
}