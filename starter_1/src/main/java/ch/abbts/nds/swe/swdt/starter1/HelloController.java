// Packet name
package ch.abbts.nds.swe.swdt.starter1;

// Import von bereits existierenden Klassen
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

//In der @RestController Annotation werden die zu Verwendung stehenden WEB-Abfragen hinterlegt
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot \n \t Hallo Adi, das ist von @RequestMapping ()";
    }

    @RequestMapping("/xx")
    public String Index_1() {
        return "Das ist ein anderer Request";
    }

    @RequestMapping("/xx/xx")
    public String Index_2() {
        return "Test: Greeadsssss jajajajajajajaja estMapping ()";
    }
}