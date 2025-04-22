package by.bnd.spring.mapper;

import by.bnd.spring.dto.UserDto;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@ToString
@Component
public class UserMapper {
    @Autowired
    private UserDto userDto;
}
