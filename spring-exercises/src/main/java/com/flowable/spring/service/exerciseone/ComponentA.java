package com.flowable.spring.service.exerciseone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentA {

    private ComponentB componentB;

    @Autowired
    public ComponentA(ComponentB componentB) {
        this.componentB = componentB;
    }
    
}

