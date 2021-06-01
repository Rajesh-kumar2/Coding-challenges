package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Third {

    @Autowired
    private Second s1;

    @Autowired
    private Fourth s4;

    public String m1(){
        System.out.println( s4.firstMethod());
        return s1.firstMethod();
    }
}
