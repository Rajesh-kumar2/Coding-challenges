package com.example.demo.controller;

import com.example.demo.repo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ControllerDemo {

    @Autowired
    private Employee e1;
    @Autowired
    private Employee e2;

    @GetMapping("/demos")
    public String gerMessage() {

        System.out.println(e1.equals(e2));
        System.out.println(e1.getId());
        System.out.println(e2.getId());

        return "Hello world! ";
    }

    @GetMapping("/getMap")
    //public ResponseEntity<Map<String, Employee>> getAsMap() {
    public Map<String, Employee> getAsMap() {

        Map<String, Employee> map = new HashMap<>();
        map.put("rajesh", new Employee() {{
            setId(10);
            setName("Rajesh");
        }});
        map.put("raj", new Employee() {{
            setId(15);
            setName("Rajesh");
        }});
        //return new ResponseEntity<>(map, HttpStatus.OK);
        return map;
    }

    @GetMapping("/getList")
    //public ResponseEntity<List<Employee>> getAsList() {
    public List<Employee> getAsList() {

       List<Employee> list = new ArrayList<>();
        list.add(new Employee() {{
            setId(10);
            setName("Rajesh");
        }});
        list.add(new Employee() {{
            setId(15);
            setName("Rajesh");
        }});
        //return new ResponseEntity<>(list, HttpStatus.OK);
        return list;
    }

}
