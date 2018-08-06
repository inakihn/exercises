package com.flowable.spring.service.exerciseone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentB {
    private ComponentA componentA;

    @Autowired
    public ComponentB(ComponentA componentA) {
        this.componentA = componentA;
    }
    
}

