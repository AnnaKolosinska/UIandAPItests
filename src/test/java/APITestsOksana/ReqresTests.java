package APITestsOksana;

import APITestsMichael.ListRes;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Clock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class ReqresTests {
    private final static String URL = "https://reqres.in/";

    @Test
    public void checkAvatarToId() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec200Ok());
        List<CreateUsers> users = given()
                .when()
                .get("api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", CreateUsers.class);
        users.forEach(x -> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
        Assert.assertTrue(users.stream().allMatch(x->x.getEmail().endsWith("reqres.in")));

        List<String> avatars = users.stream().map(CreateUsers::getAvatar).collect(Collectors.toList());
        List<String> ids = users.stream().map(x->x.getId().toString()).collect(Collectors.toList());
        for (int i = 0; i <avatars.size() ; i++) {
            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        }
    }
    @Test
    public void successRegTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec200Ok());
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        Registration user = new Registration("eve.holt@reqres.in", "pistol");
        SuccessRegistration successRegistration = given()
                .body(user)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(SuccessRegistration.class);

        Assert.assertNotNull(successRegistration.getId());
        Assert.assertNotNull(successRegistration.getToken());

        Assert.assertEquals(id, successRegistration.getId());
        Assert.assertEquals(token, successRegistration.getToken());

    }
    @Test
    public void tyut(){
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec200Ok());
        Registration user = new Registration("eve.holt@reqres.in", "pistol");
        Map<String, String> user1= new HashMap<>();
        user1.put("email","eve.holt@reqres.in");
        user1.put("password","pistol");
        given()
                .body(user)
//                .contentType(ContentType.JSON)
                .when()
                .post("api/register")
                .then().log().all();

    }
    @Test
    public void unsuccessRegTest(){
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec400Error());
        Registration user = new Registration("sydney@fife","");
        UnSuccessRegistration unSuccessRegistration = given()
                .body(user)
                .post("api/register")
                .then().log().all()
                .extract().as(UnSuccessRegistration.class);
        Assert.assertEquals("Missing password", unSuccessRegistration.getError());
    }

    @Test
    public void sortedYearsTest(){
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec200Ok());
        List<GetColorAndName> colors = given()
                .when()
                .get("api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", GetColorAndName.class);
        List<Integer> years = colors.stream().map(GetColorAndName::getYear).collect(Collectors.toList());
        List<Integer> sortYears = years.stream().sorted().collect(Collectors.toList());
        Assert.assertEquals(sortYears, years);
        System.out.println(years);
        System.out.println(sortYears);
}
    @Test
    public void deleteUserTest(){
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecUnique(204));
        given()
                .when()
                .delete("api/users/2")
                .then().log().all();
    }

 }