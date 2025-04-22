package by.bnd.spring.database.repository;

import by.bnd.spring.database.repository.pool.ConnectionPool;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;

@ToString
@Repository
public class UserRepository {

    private ConnectionPool connectionPool1;
    private Integer poolSize;
    private List<ConnectionPool> connectionPoolList;

    public UserRepository(ConnectionPool connectionPool1) {
        this.connectionPool1 = connectionPool1;

    }
}
