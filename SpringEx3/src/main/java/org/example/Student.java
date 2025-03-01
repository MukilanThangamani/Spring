package org.example;

public class Student {
    public Student(){
        System.out.println("student constructor");
    }

    private String name;
    private int age;
    private Writer writer;

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public Student(String name, int age, Writer writer) {
        System.out.println("cons called");
        this.name = name;
        this.age = age;
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void show(){
        System.out.println("name:"+getName());
        System.out.println("age :"+getAge());
        writer.write();
    }
}
