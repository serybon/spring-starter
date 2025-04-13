package by.bnd.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

public class SpringRunner {
    public static void main(String[] args) {
        Object userRepository;
        try (var context = new ClassPathXmlApplicationContext("application.xml")) {
            userRepository = context.getBean("repo1");
        }
        System.out.println(userRepository);

    }
}


