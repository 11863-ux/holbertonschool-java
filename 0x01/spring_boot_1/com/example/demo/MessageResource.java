package example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/messages")
public class MessageResource {

    @GetMapping(value = "/simpleMessageWelcome")
    public String simpleMessageWelcome() {
        return "WELCOME TO THE MICRO-SERVICE CLASS USING SPRING BOOT!!!";
    }

    @GetMapping(value = "/login/{username}/{password}")
    public String login(@PathVariable String username, @PathVariable String password) {
        if(username.isEmpty() || password.isEmpty()) {
            return "USER AND PASSWORD NOT PROVIDED";
        }
        else if(username.length()>15 || password.length()>15) {
            return "USER AND PASSWORD INVALID";
        }else return "LOGIN SUCCESSFUL!!!";
    }

}
