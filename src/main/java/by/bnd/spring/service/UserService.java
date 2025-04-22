package by.bnd.spring.service;

import by.bnd.spring.database.repository.UserRepository;
import by.bnd.spring.mapper.UserMapper;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;


@ToString
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
}
