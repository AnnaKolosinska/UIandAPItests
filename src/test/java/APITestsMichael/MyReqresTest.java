package APITestsMichael;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class MyReqresTest {

    private final static String URL = "https://reqres.in/";

    @Test
    public void SingleUserNotFound(){
        Specification.installSpecification(Specification.requesSpec(URL), Specification.responceSpecUnique(404));
        given()
                .when()
                .get("/api/users/23")
                .then().log().all();
    }

    @Test
    public void checkSingleResourse(){
        Specification.installSpecification(Specification.requesSpec(URL), Specification.responceSpecOK200());
        GetNameAndColor user = given()
                .when()
                .get("/api/unknown/2")
                .then().log().all()
                .extract().body().jsonPath().getObject("data", GetNameAndColor.class);
        Assert.assertTrue(user.getName().contains("fu"));
        Assert.assertTrue(user.getColor().contains("#"));
        Assert.assertTrue(user.getYear().equals(2001));

    }
    @Test
    public void checkDelayedResponse(){
        Specification.installSpecification(Specification.requesSpec(URL), Specification.responceSpecOK200());
        List<DelayedRes> users = given()
                .when()
                .get("/api/users?delay=3")
                .then().log().all()
                .extract().body().jsonPath().getList("data", DelayedRes.class);
        Assert.assertNotNull(DelayedRes.class.getName());

        List<String> avatars = users.stream().map(DelayedRes::getAvatar).toList();
        List<String> ids = users.stream().map(x -> x.getId().toString()).toList();
        System.out.println(avatars);
        System.out.println(ids);

    }

    @Test
    public void getResourseList(){
        Specification.installSpecification(Specification.requesSpec(URL), Specification.responceSpecOK200());
        List<ListRes> users = given()
                .when()
                .get("/api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ListRes.class);
        List<Integer> years = users.stream().map(ListRes::getYear).toList();
        for (int i = 0; i < years.size();i++){
            Assert.assertTrue(years.get(i) >= 2000);
    }
        List<String> pantone_value = users.stream().map(ListRes::getPantone_value).toList();
        for (int i = 0; i < pantone_value.size();i++){
            Assert.assertTrue(pantone_value.get(i).startsWith("1"));
        }
    }

    @Test
    public void getRegister(){
        Specification.installSpecification(Specification.requesSpec(URL), Specification.responceSpecOK200());
        RegisterSeccess user = new RegisterSeccess("eve.holt@reqres.in","pistol");
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        RegisterAfter response = given()
                .body(user)
                .when()
                .post("/api/register")
                .then().log().all()
                .extract().as(RegisterAfter.class);
        Assert.assertNotNull(response.getId());
        Assert.assertNotNull(response.getToken());
        Assert.assertEquals(id, response.getId());
        Assert.assertEquals(token, response.getToken());

    }

    @Test
    public void getUpdate(){
        Specification.installSpecification(Specification.requesSpec(URL), Specification.responceSpecOK200());
        Update user = new Update("morpheus", "zion resident");
        UpdateAfter users = given()
                .body(user)
                .when()
                .patch("/api/users/2")
                .then().log().all()
                .extract().as(UpdateAfter.class);
        Assert.assertNotNull(user.getName());
        Assert.assertNotNull(user.getJob());
        Assert.assertNotNull(user.getClass());

    }

    @Test
    public void getEmail(){
        Specification.installSpecification(Specification.requesSpec(URL), Specification.responceError400());
        RegEmail user = new RegEmail("sydney@fife", "");
        RegError users = given()
                .body(user)
                .when()
                .post("/api/register")
                .then().log().all()
                .extract().as(RegError.class);
        Assert.assertEquals("Missing password", users.getError());

    }

    @Test
    public void getListUsers(){
        Specification.installSpecification(Specification.requesSpec(URL), Specification.responceSpecOK200());
        List <ListOfUsers> user = given()
                .when()
                .get("/api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ListOfUsers.class);
        List<String> avatars = user.stream().map(ListOfUsers::getAvatar).toList();
        List<String> ids = user.stream().map(x -> x.getId().toString()).toList();

    }
    @Test
    public void checkLogPass(){
        Specification.installSpecification(Specification.requesSpec(URL), Specification.responceSpecOK200());
        LogPass user = new LogPass("eve.holt@reqres.in", "cityslicka");
        String token = "QpwL5tke4Pnpja7X4";
        LogToken users = given()
                .body(user)
                .when()
                .post("/api/login")
                .then().log().all()
                .extract().as(LogToken.class);
        Assert.assertTrue(user.getEmail().endsWith("@reqres.in"));
        Assert.assertTrue(user.getPassword().startsWith("city"));
        Assert.assertTrue(users.getToken().equals("QpwL5tke4Pnpja7X4"));

    }
    @Test
    public void checkDelete(){
        Specification.installSpecification(Specification.requesSpec(URL), Specification.responceSpecUnique(204));
        given()
                .when()
                .delete("/api/users/2")
                .then().log().all();

    }

}






