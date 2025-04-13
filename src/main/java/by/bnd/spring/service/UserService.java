package by.bnd.spring.service;

import by.bnd.spring.database.repository.UserRepository;
import by.bnd.spring.mapper.UserMapper;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor(force = true)
@Setter
@ToString
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
}
