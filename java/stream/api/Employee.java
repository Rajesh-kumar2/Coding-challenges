package stream.api;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(10, "Rajesh");
        Employee e2 = new Employee(15, "Kumar");
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        list.stream().map(e -> {
            return e.id;
        }).forEach(a -> System.out.println(a));
    }
}
