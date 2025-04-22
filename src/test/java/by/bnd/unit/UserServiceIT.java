package by.bnd.unit;

import by.bnd.annotation.IT;
import by.bnd.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

@IT
@RequiredArgsConstructor
public class UserServiceIT {
    private final UserService userService;

    @Test
    public void test() {

    }
}
