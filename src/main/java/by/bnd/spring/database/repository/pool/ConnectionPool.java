package by.bnd.spring.database.repository.pool;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class ConnectionPool {
    private String username;
    private String password;
    private Integer poolSize;
    private String url;

    public ConnectionPool(
            @Value("${db.username}") String username,
            @Value("${db.password}") String password,
            @Value("${db.pool.size}") Integer poolSize,
            @Value("${db.url}") String url)     {
        this.username = username;
        this.password = password;
        this.poolSize = poolSize;
        this.url = url;
    }
}
