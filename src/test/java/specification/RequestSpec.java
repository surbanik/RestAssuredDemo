package specification;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;


public class RequestSpec {

    public static RequestSpecification getRequestSpec(){
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri("https://samples.openweathermap.org/data/2.5/weather");
        builder.addParam("q", "London,uk" );
        builder.addParam("appid", "b1b15e88fa797225412429c1c50c122a1" );
        return builder.build();

    }

}
