import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

    @RequestMapping(value="/messages")
    public String home(){
        return "MAVEN PROJECT (SPRING INITIALIZR) SUCCESSFULLY CREATED!!!";
    }
}
