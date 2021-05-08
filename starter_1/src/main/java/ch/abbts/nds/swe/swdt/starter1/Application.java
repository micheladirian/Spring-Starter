// Packet name
package ch.abbts.nds.swe.swdt.starter1;

// Import von bereits existierenden Klassen
import java.util.Arrays;

// Import von bereits existierenden spring Klassen
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

// Die Spring Boot-Annotation wird verwendet, um eine Konfigurationsklasse zu markieren,
// die eine oder mehrere @Bean-Methoden deklariert und außerdem die Autokonfiguration und das Scannen von Komponenten auslöst.
// Es ist dasselbe wie das Deklarieren einer Klasse mit den Annotationen
// @Configuration, @EnableAutoConfiguration und @ComponentScan.
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	// Wird nicht verwendet.....!!!
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
