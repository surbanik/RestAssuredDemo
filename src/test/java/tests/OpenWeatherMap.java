package tests;

import org.junit.jupiter.api.Test;
import specification.RequestSpec;
import specification.ResponseSpec;
import testBase.TestBase;

import static io.restassured.RestAssured.given;

public class OpenWeatherMap extends TestBase {

    @Test
    public void shouldGetLondonWeather() {

        given()
                .spec(RequestSpec.getRequestSpec()).
        when()
                .get().
        then()
                .spec(ResponseSpec.getResponseSpec());
    }
}
