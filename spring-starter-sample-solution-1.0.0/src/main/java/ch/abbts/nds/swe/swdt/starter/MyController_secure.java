package ch.abbts.nds.swe.swdt.starter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

//In der @RestController Annotation werden die zu Verwendung stehenden WEB-Abfragen hinterlegt
@RestController
@RequestMapping(path = "/employees-secure")
public class MyController_secure {
    @GetMapping(path = "/", produces = "application/json")
    public List<String> employees() {
        return Arrays.asList(new String[]{
                "Herr Michel",
                "Herr Halter",
                "Frau Durrer"
        });
    }

}