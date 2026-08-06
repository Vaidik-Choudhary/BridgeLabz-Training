package com.library.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Publisher {

    @Value("Amazon Publications")
    private String name;

    public Publisher() {
        System.out.println("Publisher Bean Created");
    }

    public void display() {
        System.out.println("Publisher : " + name);
    }
}