package by.bnd.spring.database.repository;

import by.bnd.spring.bpp.InjectBean;
import by.bnd.spring.database.repository.pool.ConnectionPool;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@ToString
public class UserRepository {
    //@InjectBean
    @Autowired
    private ConnectionPool connectionPool;

}
