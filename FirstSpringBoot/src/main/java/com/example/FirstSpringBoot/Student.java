package com.example.FirstSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student {

    @Autowired
    @Qualifier("pencil")
    private Writer writer;

   // @Autowired
    //setter injection
    /*public void setPen(Pen pen){
        System.out.print("setter called");
        this.pen = pen;
    }*/
    public void show(){
        System.out.println("student class");
    }
    public void writeExam(){
        writer.write();
    }
}