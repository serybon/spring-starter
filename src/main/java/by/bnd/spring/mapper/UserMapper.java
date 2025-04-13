package by.bnd.spring.mapper;

import by.bnd.spring.dto.UserDto;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor(force = true)
@Setter
@ToString
@RequiredArgsConstructor
public class UserMapper {
    private final UserDto userDto;
}
