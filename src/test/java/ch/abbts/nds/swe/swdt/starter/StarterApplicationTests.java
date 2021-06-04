package ch.abbts.nds.swe.swdt.starter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StarterApplicationTests {

	@Test
	void contextLoads() {
	}

}


public class EmptyControllerTestIT {
	@Test
	@DisplayName("/empty/ returns 200")
	public void empty_returns_200() {
		when().
				get("/empty/").
				then().
				statusCode(200);
	}
}