package io.spring.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    @GetMapping("/")
    public String home(){
        return ("<h1>Hey Welcome EVERYONE !!</h1>");
    }
    @GetMapping("/user")
    public String user(){
        return ("<h1>Hey Welcome USER !!</h1>");
    }
    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Hey Welcome ADMIN !!</h1>");
    }
}
