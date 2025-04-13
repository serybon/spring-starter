package by.bnd.spring.database.repository.pool;

import lombok.ToString;

@ToString
public class ConnectionPool {
    private String username;
    private String password;
    private String poolSize;
    private String url;

    public ConnectionPool(String username, String password, String poolSize, String url) {
        this.username = username;
        this.password = password;
        this.poolSize = poolSize;
        this.url = url;
    }
}
