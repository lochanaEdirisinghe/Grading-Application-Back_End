package lk.lochana.gradingapplication;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class GradingApplicationTests {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String paswrd="danuka";
        String encodedpaswrd=encoder.encode(paswrd);
        System.out.println(encodedpaswrd);
    }

    @Test
    void contextLoads() {
    }

}
