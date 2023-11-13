package com.devmind.myspringapp;

import org.springframework.stereotype.Component;

@Component
public class FrameworkKnowledge implements ITeachingService {

    @Override
    public String teachSomething() {
        return "Frameworks are your friend, not your enemy!";
    }
    public String getSomeKnowledge() {
        return "Frameworks are your friend, not your enemy!";
    }
}