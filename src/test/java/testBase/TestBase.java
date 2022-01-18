package testBase;

import driverFactory.DriverFactory;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import specification.RequestSpec;
import yaml.BrowserEnvironment;
import yaml.Loader;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static io.restassured.RestAssured.given;

public class TestBase {
    static private Logger logger = LoggerFactory.getLogger(TestBase.class);
    protected WebDriver driver;
    private static BrowserEnvironment browserEnvironment;
    private static DriverFactory driverFactory;

    private static Loader loader;


    public void screenShotMaker() {
        Date nowDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.HH-mm-ss");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(source, new File("src/test/java/screenshots/" + sdf.format(nowDate) + ".png"));
            System.out.println("Screenshot taken");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }
    }

    @BeforeAll
    static void setDriver() throws IOException {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

//        RestAssured.authentication = RestAssured.oauth2("1/1201619311706266:16c92936e884c3d8acefe8ce302a8ca4");

//        loader = new Loader();
//        browserEnvironment = new BrowserEnvironment();
//        driverFactory = new DriverFactory();
//        logger.info("Webdriver initialized");
    }

    @BeforeEach
    void setUp() {

//        driver = browserEnvironment.getDriver();
//        driver = driverFactory.getDriver(loader.getBrowser());
//        logger.info("Webdriver window start");
    }

    @AfterEach
    void tearDown() {
//        driver.quit();
//        logger.info("Webdriver window closed");
    }
}
