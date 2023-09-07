package com.example.demo;

import com.example.org.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {


    @GetMapping("/")
    public String ping() {

        return "pong";
    }

    @GetMapping("/org")
    public String org(@RequestParam("username") String username, @RequestParam("password") String password) {
        User app = new User();
        app.setUsername(username);
        app.setPassword(password);
        
        return app.toString();
    }

}
