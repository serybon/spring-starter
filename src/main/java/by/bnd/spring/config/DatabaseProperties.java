package by.bnd.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@ConfigurationProperties(prefix = "db")
public record DatabaseProperties(
        String username,
        String password,
        String driver,
        String url,
        String hosts,
        PoolProperties pool,
        List<PoolProperties> pools,
        Map<String, Object> properties)
 {
     public static record PoolProperties(Integer size, Integer timeout){

     }
}
