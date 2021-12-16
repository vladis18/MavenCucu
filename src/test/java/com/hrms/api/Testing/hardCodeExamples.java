package com.hrms.api.Testing;

import com.hrms.pages.EmployeeListPage;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;


public class hardCodeExamples {
     String baseURI = RestAssured.baseURI="http://hrm.syntaxtechs.net/syntaxapi/api";
     String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MzcxOTQ3MjEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYzNzIzNzkyMSwidXNlcklkIjoiMzE1MCJ9.mkaemWtX46LZUtWX2MjeVjSVGP5BmU0Ki1l8Ue6f2xM";


    @Test
    public void sampleTest(){
         //preparing request to get one employeed
        RequestSpecification preparingGetOneEmployeeRequest=given().header("Authorization", token).header("Content-Type","Application-json")
                .queryParam("employee_id","25064A");
        //sending the request to the endpoint
     Response getOneEmployeeResponse=  preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");
//        System.out.println(getOneEmployeeResponse.asString());
//        System.out.println(getOneEmployeeResponse.prettyPrint());
        getOneEmployeeResponse.prettyPrint();;

        getOneEmployeeResponse.then().assertThat().statusCode(200);
    }
    @Test
    public void aPostCreateEmployee(){

       RequestSpecification createEmployeeRequest= given().header("Authorization",token).
                header("Content-Type","Application/json").body("{\n" +
                        "        \"emp_firstname\": \"Sasha\",\n" +
                        "        \"emp_lastname\": \"Izagerbasha\",\n" +
                        "        \"emp_middle_name\": \"Ofigeievna\",\n" +
                        "        \"emp_gender\": \"M\",\n" +
                        "        \"emp_birthday\": \"1999-05-22\",\n" +
                        "        \"emp_status\": \"Employee\",\n" +
                        "        \"emp_job_title\": \"Developer\"\n" +
                        "        }");
      Response createEmployeeResponse= createEmployeeRequest.when().post("/createEmployee");
      createEmployeeResponse.prettyPrint();

      createEmployeeResponse.then().assertThat().statusCode(201);

        JsonPath js = createEmployeeResponse.jsonPath();
        String  emp_ID = js.getString("Employee.employee_id");
        System.out.println(emp_ID);
        assertThat (emp_ID,equalTo("160337A"));


      String employeeID= createEmployeeResponse.jsonPath().getString("Employee.employee_id");
        System.out.println("emp id "+ employeeID);

createEmployeeResponse.then().assertThat().body("Message",equalTo("Employee Created"));
createEmployeeResponse.then().assertThat().body("Employee.emp_firstname",equalTo("Sasha"));

    }
    @Test
    public void bGetCreatedEmployee(){
       RequestSpecification getCreatedEmployee= given().header("Authorization", token).header("Content-Type","Application-json")
                .queryParam("employee_id","25140A");
       Response getEmployeeResponse =getCreatedEmployee.when().get("/getOneEmployee/php");
       //getEmployeeResponse.prettyPrint();
        String empID=getEmployeeResponse.body().jsonPath().getString("employee.employee_id");
         System.out.println(getEmployeeResponse.body().jsonPath().getString("employee.employee_id"));
         boolean verifyEmployeeID= empID.equalsIgnoreCase("25140A");
        System.out.println(verifyEmployeeID);
    }
}
