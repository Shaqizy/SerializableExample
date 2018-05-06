package com.shayzeq;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        Person p = new Person("Игорь", "Фролов", 22);

        ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream("data.ser"));
        p.getList().add(new Ticket("12","sdsd"));
        dos.writeObject(p);
        dos.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("data.ser"));
        Person rp = (Person) inputStream.readObject();
        System.out.println("rp = " + rp);
        inputStream.close();
    }
}
