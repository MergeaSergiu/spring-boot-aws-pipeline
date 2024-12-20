package spring_boot_cicd.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApi {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World! Deployed successfully ";
    }
}
