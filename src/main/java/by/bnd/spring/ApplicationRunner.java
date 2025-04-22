package by.bnd.spring;


import by.bnd.spring.config.DatabaseProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.core.SpringProperties;

@ConfigurationPropertiesScan
@SpringBootApplication
public class ApplicationRunner {
    public static void main(String[] args) {

        var context = SpringApplication.run(ApplicationRunner.class, args);
        System.out.println(SpringProperties.getProperty("test.msg"));
        System.out.println(context.getBean("connectionPool1"));
        System.out.println(context.getBean(DatabaseProperties.class));

    }
}


