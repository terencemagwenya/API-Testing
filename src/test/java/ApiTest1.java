import io.restassured.RestAssured;
import io.restassured.response.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTest1 {

    @Test
    void test1(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Time taken :"+response.getTime());
        System.out.println("Status Code :"+response.getStatusCode());
        System.out.println("Hearder :"+response.getContentType());
        System.out.println("Body"+response.getBody().prettyPrint());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);

    }

}
