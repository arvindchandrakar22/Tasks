package io.springboot.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome !! Lets Learn Spring Security !!</h1>");
    }
    @GetMapping("/user")
    public String user(){
        return ("<h1>Hey Hello, Welcome USER !!</h1>");
    }
    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Hey Hello, Welcome ADMIN !!</h1>");
    }
}
