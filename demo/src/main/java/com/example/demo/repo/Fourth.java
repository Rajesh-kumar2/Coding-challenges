package com.example.demo.repo;

import org.springframework.stereotype.Service;
@Service("s4")
public class Fourth implements First{
    @Override
    public String firstMethod() {
        return "from fourth";
    }
}
