package by.bnd.spring.database.repository;

import by.bnd.spring.bpp.InjectBean;
import by.bnd.spring.database.repository.pool.ConnectionPool;

import jakarta.annotation.Resource;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@ToString
public class UserRepository {
//    @InjectBean
//    @Autowired
    @Resource(name = "connectionPool1")
    private ConnectionPool connectionPool;

    @Value("${db.pool.size}")
    private Integer poolSize;

}
