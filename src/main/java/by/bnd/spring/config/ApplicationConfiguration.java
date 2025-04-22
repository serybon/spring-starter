package by.bnd.spring.config;

import by.bnd.spring.database.repository.UserRepository;
import by.bnd.spring.database.repository.pool.ConnectionPool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;


@Configuration
public class ApplicationConfiguration {

    @Bean("connectionPool1")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public ConnectionPool connectionPool(@Value("${db.username}")String username) {
        return new ConnectionPool(username, "admin", 20, "url");
    }

    @Bean
    public ConnectionPool connectionPool2() {
        return new ConnectionPool("mysql", "123", 200, "url");
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository(connectionPool2());
    }
}
