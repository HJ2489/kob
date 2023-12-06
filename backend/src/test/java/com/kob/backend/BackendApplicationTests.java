package com.kob.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("phj"));
        System.out.println(passwordEncoder.encode("pb"));
        System.out.println(passwordEncoder.encode("pc"));
        System.out.println(passwordEncoder.encode("pd"));
        System.out.println(passwordEncoder.encode("pe"));
        System.out.println(passwordEncoder.matches("phj", "$2a$10$ogmBc1Kh7pjfK4cG2RnqY.Q9Pt1besJBpFgjeX6EXf.hyRId2h7wy"));
    }

}
