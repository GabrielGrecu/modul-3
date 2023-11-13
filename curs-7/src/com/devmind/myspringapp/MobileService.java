package com.devmind.myspringapp;

import org.springframework.stereotype.Component;

@Component
public class MobileService implements ITeachingService{
    @Override
    public String teachSomething() {
        return "some mobile knowledge";
    }
}
