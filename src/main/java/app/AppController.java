package app;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class AppController {

    @RequestMapping("/")
    User home() {
        User user = new User();
        user.setName("Naneen");
        user.setLastname("SKE");
        user.setAddress("Bangkok 10200");

        return user;
    }

//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(AppController.class, args);
//    }

}