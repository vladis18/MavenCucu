package practice;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class TestToken {

   @Test
    public void authenticate() {
       Credentials credentials = new Credentials();


        RestAssured.baseURI="http://hrm.syntaxtechs.net/syntaxapi/api";
        credentials.setUsername("vbabayan@yahoo.com");
        credentials.setPassword("syntax");
        AuthenticationToken authenticationToken =

                RestAssured.given()
                        .accept("application/json")
                        .contentType("application/json")
                        .body(credentials)
                        .expect()
                        .statusCode(200)
                        .when()
                        .post("/login")
                        .then()
                        .log().all()
                        .extract()
                        .body().as(AuthenticationToken.class);
       System.out.println("hello");

        assertNotNull(authenticationToken.getToken());
    }
}
class Credentials {

    private String username;
    private String password;
    public String  setUsername(String username){
        return  this.username=username;
    }
    public String setPassword(String password){
        return this.password=password;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    // Getters and setters
}
    //Then define class to represent the authentication token:

class AuthenticationToken {

    private String token;
    public Object setToken(Object token){
        return token;
    }

    public  Object getToken(){
         return this.token=token;
    }

    // Getters and setters
}
//And finally perform the request to exchange the credentials for the token:

class GetNewToken{
    @Test public void testStatusCode(){
        //RestAssured.baseURI="http://hrm.syntaxtechs.net/syntaxapi/api";
        //String response=
//      RestAssured.given().params("username", "wahmed", "password", "wahmed123").auth().preemptive().when().post("/oauth/token").asString();
        //JsonPath jsonPath = new JsonPath(response); String accessToken = jsonPath.getString("access_token");
    }

//@Test public void testStatusCode(){
        /* RestAssured.baseURI = System.getProperty("qa-takehome.dev.aetion.com:4440/login");
        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme(); authScheme.setUserName("wahmed"); authScheme.setPassword("wahmed123"); RestAssured.authentication = authScheme; */ }

//}