package com.alireza.usc;

public class Employee {
    int age;
    String name;
    long id;
    float salary;
    public Employee(){
//        this.age=age;
//        this.name=name;
//        this.id = id;
//        this.salary = salary;
        age = 0;name = null;id = 0;salary = 0;
    }

    public String toString(){
        return name+"\t"+age+"\t"+id+"\t"+salary;
    }

}
