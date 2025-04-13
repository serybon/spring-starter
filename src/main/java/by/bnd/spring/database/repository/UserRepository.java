package by.bnd.spring.database.repository;

import by.bnd.spring.database.repository.pool.ConnectionPool;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import lombok.ToString;

@ToString
public class UserRepository {
    private ConnectionPool connectionPool;

    @PostConstruct
    public void init(){
        System.out.println("Init UserRepository");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy UserRepository");
    }
}
