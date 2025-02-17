package org.example;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("constructor in laptop class ");
    }
    public void compile(){
        System.out.println("compiling in laptop");
    }
}
