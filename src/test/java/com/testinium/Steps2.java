package com.testinium;


import io.restassured.response.Response;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

/**
 * The type Steps.
 */
public class Steps2 {

    protected Logger log = Logger.getLogger(getClass());

    /**
     * The Response.
     */
    Response response;
    /**
     * The JSONObject.
     */
    JSONObject object = null;

    String getUrl = "https://jsonplaceholder.typicode.com/posts/54";
    String postUrl = "https://jsonplaceholder.typicode.com/posts";

    int number = 3;

    @Test
    public void givenNumber_whenEven_thenTrue() {
        assertTrue(number % 2 == 0);
    }

    @BeforeClass
    public void setup() {
        number = 12;
    }

    @AfterClass
    public void tearDown() {
        number = 0;
    }


    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"First-Value"}, {"Second-Value"}, {"First-Value"}, {"Second-Value"}, {"First-Value"}, {"Second-Value"}};
    }

//    @Test (dataProvider = "data-provider")
//    public void myTest (String val) {
//        System.out.println("Passed Parameter Is : " + val);
//    }

    @Test
    public void getRequestMethod3() {
        log.info("get request to " + getUrl);
        response = given().when().get(getUrl);
        Assert.assertEquals("200", String.valueOf(response.getStatusCode()));
        Assert.assertEquals(54, response.jsonPath().getInt("id"));
    }
    /*@Test
    public void getRequestMethod01() {
        log.info("get request to " + getUrl);
        response = given().when().get(getUrl);
        Assert.assertEquals("200", String.valueOf(response.getStatusCode()));
        Assert.assertEquals(2, response.jsonPath().getInt("id"));
    }*/
    @Test
    public void getRequestMethod302() {
        log.info("get request to " + getUrl);
        response = given().when().get(getUrl);
        Assert.assertEquals("200", String.valueOf(response.getStatusCode()));
        Assert.assertEquals(1, response.jsonPath().getInt("userId"));
    }


    @Test
    public void getRequestMethod3052() {
        log.info("get request to " + getUrl);
        response = given().when().get(getUrl);
        Assert.assertEquals("500", String.valueOf(response.getStatusCode()));
        Assert.assertEquals(2, response.jsonPath().getInt("userId"));
    }


    @Test
    public void postRequest3() {
        log.info("post to " + postUrl);
        object = new JSONObject();
        object.put("id", 53);
        object.put("name", "Dursun");
        object.put("surname", "Kurt");
        log.info("post body:" + object.toString());
        response = given().body(object.toString()).when().post(postUrl);
        Assert.assertEquals("201", String.valueOf(response.getStatusCode()));
        Assert.assertEquals(101, response.jsonPath().getInt("id"));
    }
    /* @Test
     public void postRequest2() {
         log.info("post to " + postUrl);
         object = new JSONObject();
         object.put("id", 54);
         object.put("name", "Dursun");
         object.put("surname", "Kurt");
         log.info("post body:" + object.toString());
         response = given().body(object.toString()).when().post(postUrl);
         Assert.assertEquals("201", String.valueOf(response.getStatusCode()));
         Assert.assertEquals(101, response.jsonPath().getInt("id"));
     }*/
    @Test
    public void postRequest33() {
        log.info("post to " + postUrl);
        object = new JSONObject();
        object.put("id", 62);
        object.put("name", "Dursun");
        object.put("surname", "Kurt");
        log.info("post body:" + object.toString());
        response = given().body(object.toString()).when().post(postUrl);
        Assert.assertEquals("201", String.valueOf(response.getStatusCode()));
        Assert.assertEquals(100, response.jsonPath().getInt("id"));
    }
    @Test
    public void postRequest34() {
        log.info("post to " + postUrl);
        object = new JSONObject();
        object.put("id", 54);
        object.put("name", "Dursun");
        object.put("surname", "Kurt");
        log.info("post body:" + object.toString());
        response = given().body(object.toString()).when().post(postUrl);
        Assert.assertEquals("401", String.valueOf(response.getStatusCode()));
        Assert.assertEquals(101, response.jsonPath().getInt("id"));
    }
    @Test
    public void postRequest35() {
        log.info("post to " + postUrl);
        object = new JSONObject();
        object.put("id", 54);
        object.put("name", "Dursun");
        object.put("surname", "Kurt");
        log.info("post body:" + object.toString());
        response = given().body(object.toString()).when().post(postUrl);
        Assert.assertEquals("200", String.valueOf(response.getStatusCode()));
        Assert.assertEquals(101, response.jsonPath().getInt("id"));
    }
    @Test
    public void postRequest36() {
        log.info("post to " + postUrl);
        object = new JSONObject();
        object.put("id", 54);
        object.put("name", "Dursun");
        object.put("surname", "Kartal");
        log.info("post body:" + object.toString());
        response = given().body(object.toString()).when().post(postUrl);
        Assert.assertEquals("201", String.valueOf(response.getStatusCode()));
        Assert.assertEquals(101, response.jsonPath().getInt("id"));
    }
    @Test
    public void postRequest37() {
        log.info("post to " + postUrl);
        object = new JSONObject();
        object.put("id", 54);
        object.put("name", "Furkan");
        object.put("surname", "Kurt");
        log.info("post body:" + object.toString());
        response = given().body(object.toString()).when().post(postUrl);
        Assert.assertEquals("201", String.valueOf(response.getStatusCode()));
        Assert.assertEquals(101, response.jsonPath().getInt("id"));
    }





}
