package com.example.springbean;

import com.example.springbean.entity.Car;
import com.example.springbean.entity.Engine;
import com.example.springbean.entity.VNEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBeanApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBeanApplication.class, args);
        Car car = applicationContext.getBean(Car.class);

        VNEngine engine = applicationContext.getBean(VNEngine.class);
        engine.run();
    }

}
