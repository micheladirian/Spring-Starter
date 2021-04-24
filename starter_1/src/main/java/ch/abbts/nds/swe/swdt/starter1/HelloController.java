package ch.abbts.nds.swe.swdt.starter1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot \n \t Hallo Adi, das ist von @RequestMapping ()";
    }

}