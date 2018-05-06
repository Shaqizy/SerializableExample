package com.shayzeq;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable{

    private String name;
    private String surname;
    private int age;

    List<Ticket> list = new ArrayList<>();

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Ticket> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", list=" + list +
                '}';
    }
}

class Ticket implements Serializable{

    String id;

    String title;

    public Ticket(String id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
