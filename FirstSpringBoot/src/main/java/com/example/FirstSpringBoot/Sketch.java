package com.example.FirstSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Sketch implements Writer {
    public void write(){
        System.out.println("writing using sketch");
    }
}
