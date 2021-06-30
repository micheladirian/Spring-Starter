package ch.abbts.nds.swe.swdt.starter.employee;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class EmployeeControllTestIT {

@Tag("IT")
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

}
