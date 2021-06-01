package com.example.demo.config;


import com.example.demo.repo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    private  PropConfiguration props;

    public BeanConfig(PropConfiguration props) {
        this.props = props;
    }

    @Bean
    CommandLineRunner command(){
        return args -> {
            System.out.println("Hello from command line runner separate");
            System.out.println("age: " + props.getAge());
            System.out.println("name: " + props.getName());
            System.out.println("Sal: " + props.getSal());
        };
    }

    @Bean(name = {"e1", "e23"})
    @Scope("singleton")
    public Employee getEmpInstance() {
        return new Employee() {{
            setId(10);
        }};
    }

    @Bean(name = "e2")
    @Scope("singleton")
    public Employee getEmpInstanceAgain() {
        return new Employee() {{
            setId(10);
        }};
    }
}
