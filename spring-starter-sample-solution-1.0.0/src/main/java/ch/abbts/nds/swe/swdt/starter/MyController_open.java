package ch.abbts.nds.swe.swdt.starter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

//In der @RestController Annotation werden die zu Verwendung stehenden WEB-Abfragen hinterlegt
@RestController
@RequestMapping(path = "/employees")
public class MyController_open {
    @GetMapping(path = "/", produces = "application/json")
    public List<String> employees() {
        return Arrays.asList(new String[]{
                "Adrian Michel",
                "Peter Halter",
                "Fredy Durrer",
                "Ueli von Ah"
        });
    }

}
