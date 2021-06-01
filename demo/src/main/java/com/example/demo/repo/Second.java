package com.example.demo.repo;

import org.springframework.stereotype.Service;

@Service("s1")
public class Second implements First{
    @Override
    public String firstMethod() {
        return "Hello word from Second class";
    }
}
