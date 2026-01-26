package com.reflection.basiclevel;

import java.lang.reflect.Field;

public class PrivateFieldDemo {
    public static void main(String[] args) throws Exception {
        Person p = new Person();

        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true); 

        field.set(p, 30); 
        System.out.println("Age: " + field.get(p));
    }
}