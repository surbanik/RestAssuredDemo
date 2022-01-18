package testBase;


import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class TestBase {




    @BeforeAll
    static void setDriver(){
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

//        RestAssured.authentication = RestAssured.oauth2("1/1201619311706266:16c92936e884c3d8acefe8ce302a8ca4");

    }

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }
}
