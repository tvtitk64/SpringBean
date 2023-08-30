package com.example.springbean.entity;

import org.springframework.stereotype.Component;

@Component
public class VNEngine implements Engine{
    @Override
    public void run() {
        System.out.println("Hello world");
    };
}
