package edu.eci.secureapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")  // permite llamadas desde Apache
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Secure Spring Server!";
    }

    @GetMapping("/api/user")
    public String user(@RequestParam String name) {
        return "Welcome, " + name + "!";
    }
}