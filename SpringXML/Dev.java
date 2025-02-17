package org.example;

public class Dev {

    private Computer comp;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public Dev(int age){
        this.age = age;
    }

    public Dev(){
        System.out.println("constructor of dev class ");
    }
    public void build(){
        comp.compile();
        System.out.println("working on some project..");
    }
}
