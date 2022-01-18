package specification;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;

import static org.hamcrest.Matchers.*;

public class ResponseSpec {

    public static ResponseSpecification getResponseSpec() {
        ResponseSpecBuilder builder = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectStatusCode(200)
                .expectBody("sys", hasValue("GB"))
                .expectBody("name", equalTo("London"))
                .expectBody("wind.speed", is(4.1f))
                .expectResponseTime(lessThan(5000L));
        return builder.build();
    }

    public static ResponseSpecification postResponseSpec() {
        ResponseSpecification responseSpec = RestAssured.expect();
        return responseSpec
                .time(Matchers.lessThan(5000L))
                .contentType(ContentType.JSON)
                .log().all()
                .statusCode(201);
    }
}
