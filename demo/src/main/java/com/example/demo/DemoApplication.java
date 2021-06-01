package com.example.demo;

import com.example.demo.controller.ControllerDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableConfigurationProperties
public class DemoApplication{

    @Autowired
    private ControllerDemo cd;

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

   /* @Override
    public void run(String... args) throws Exception {
        cd.gerMessage();
    }*/
}
