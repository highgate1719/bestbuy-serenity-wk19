package restassured.bestbuy.testbase;


import io.restassured.RestAssured;
import org.junit.BeforeClass;
import restassured.bestbuy.utils.PropertyReader;

public class TestBase {

    @BeforeClass
    public static void inIt(){
        RestAssured.baseURI = PropertyReader.getInstance().getProperty("baseURI");
        RestAssured.port = Integer.parseInt(PropertyReader.getInstance().getProperty("port"));
    }
}
