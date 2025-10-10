package example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageResource {

    @RequestMapping(value = "/simpleMessageWelcome")
    public String simpleMessageWelcome() {
        return "WELCOME TO THE MICRO-SERVICE CLASS USING SPRING BOOT!!!";
    }

}
