import common.DriverHandler;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AbsaApi extends DriverHandler {

    String url = getProp().getProperty("api.url");
    String url2 = getProp().getProperty("api.url2");
    String url3 = getProp().getProperty("api.url3");

    //@BeforeMethod

    @Test
    public void getDogList() {
        given().
                contentType(ContentType.JSON).
                log().all().
                when().
                get(url).
                then().log().all().assertThat().statusCode(200);

        given().
                queryParam("message", "retriever").
                when().get(url).
                then().log().body().assertThat().statusCode(200);
    }

    @Test
    public void getSubbreedList() {
        given().
                queryParam("message", "retriever").
                when().get(url2).
                then().log().body().assertThat().statusCode(200);
    }

    @Test
    public void getRandom() {
        given().
                queryParam("message", "golden").
                when().get(url3).
                then().log().body().assertThat().statusCode(200);
    }


}
