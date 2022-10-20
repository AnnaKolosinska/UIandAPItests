package APITestsAnna;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class NewTests {
    private final static String URL = "https://reqres.in/";

    @Test
    public void CreateUserTest() {
        Specifications.installSpecification(Specifications.requestSpecification(URL), Specifications.responseSpecUnique(201));
        String name = "morpheus";
        String job = "leader";
        CreateUser user = new CreateUser("morpheus", "leader");
        SuccessfulCreation successfulCreation = given()
                .body(user)
                .when()
                .post("/api/users")
                .then().log().all()
                .extract().as(SuccessfulCreation.class);
        Assert.assertNotNull(successfulCreation.getName());
        Assert.assertNotNull(successfulCreation.getJob());
        Assert.assertNotNull(successfulCreation.getId());
        Assert.assertNotNull(successfulCreation.getCreatedAt());
        Assert.assertEquals(name, successfulCreation.getName());
        Assert.assertEquals(job, successfulCreation.getJob());
        Assert.assertTrue(successfulCreation.createdAt.contains("2022"));
    }

    @Test
    public void SuccessLogin() {
        Specifications.installSpecification(Specifications.requestSpecification(URL), Specifications.responseSpecOK200());
        LoginUser user = new LoginUser("eve.holt@reqres.in", "cityslicka");
        SuccessfulLogin successfulLogin = given()
                .body(user)
                .when()
                .post("/api/login")
                .then().log().all()
                .extract().as(SuccessfulLogin.class);
        Assert.assertNotNull(successfulLogin.getToken());
        Assert.assertTrue(successfulLogin.getToken().contains("QpwL5tke"));
    }

    @Test
    public void unSuccessLogin() {
        Specifications.installSpecification(Specifications.requestSpecification(URL), Specifications.responseSpecError400());
        LoginUser user = new LoginUser("peter@klaven", "");
        UnSuccessLogin unSuccessLogin = given()
                .body(user)
                .post("/api/login")
                .then().log().all()
                .extract().as(UnSuccessLogin.class);
        Assert.assertNotNull(unSuccessLogin.getError());
        Assert.assertEquals(unSuccessLogin.getError(), "Missing password");
    }


    @Test
    public void checkColoursAndYears() {
        Specifications.installSpecification(Specifications.requestSpecification(URL), Specifications.responseSpecOK200());
        List<ResourcesData> users = given()
                .when()
                .get("/api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ResourcesData.class);
        List<Integer> years = users.stream().map(ResourcesData::getYear).toList();
        for (int i = 0; i < years.size(); i++) {
            Assert.assertTrue(years.get(i) >= 2000);
        }
        List<String> colours = users.stream().map(ResourcesData::getColor).toList();
        for (int i = 0; i < colours.size(); i++) {
            Assert.assertTrue(colours.get(i).startsWith("#"));
            Assert.assertEquals(colours.get(i).length(), 7);
        }
    }

    @Test
    public void updateTest() {
        String name = "morpheus";
        String job = "zion resident";
        Specifications.installSpecification(Specifications.requestSpecification(URL), Specifications.responseSpecOK200());
        UpdateData user = new UpdateData("morpheus", "zion resident");
        UpdateDataResponse response = given()
                .body(user)
                .when()
                .put("/api/users/2")
                .then().log().all()
                .extract().as(UpdateDataResponse.class);
        Assert.assertEquals(name, user.name);
        Assert.assertEquals(job, user.job);
        Assert.assertNotNull(response.updatedAt);
        Assert.assertTrue(response.updatedAt.contains("2022-08"));
    }

    @Test
    public void getUser() {
        Specifications.installSpecification(Specifications.requestSpecification(URL), Specifications.responseSpecOK200());
        Data user = given()
                .when()
                .get("/api/users/2")
                .then().log().all()
                .extract().body().jsonPath().getObject("data", Data.class);
        Assert.assertTrue(user.getEmail().endsWith("reqres.in"));
        Assert.assertTrue(user.getEmail().contains("@"));
        Assert.assertTrue(user.getAvatar().contains("2"));
    }

    @Test
    public void getResource() {
        Specifications.installSpecification(Specifications.requestSpecification(URL), Specifications.responseSpecOK200());
        ResourcesData user = given()
                .when()
                .get("/api/unknown/2")
                .then().log().all()
                .extract().body().jsonPath().getObject("data", ResourcesData.class);
        Assert.assertEquals(user.getPantone_value().length(), 7);
        Assert.assertTrue(user.getPantone_value().contains("-"));
        Assert.assertTrue(user.getYear() <= 2022);
    }

    @Test
    public void UserNotFound() {
        Specifications.installSpecification(Specifications.requestSpecification(URL), Specifications.responseSpecUnique(404));
        given()
                .when()
                .get("/api/users/23")
                .then().log().all();
    }

    @Test
    public void delayResponseTest() {
        Specifications.installSpecification(Specifications.requestSpecification(URL), Specifications.responseSpecOK200());
        List<Data> user = given()
                .when()
                .get("/api/users?delay=3")
                .then().log().all()
                .extract().body().jsonPath().getList("data", Data.class);
        List<Integer> ids = user.stream().map(Data::getId).toList();
        List<Integer> sortedIds = ids.stream().sorted().toList();
        Assert.assertEquals(ids, sortedIds);
        Assert.assertTrue(user.stream().allMatch(x -> x.getAvatar().contains("http")));
    }

    @Test
    public void deleteUser() {
        Specifications.installSpecification(Specifications.requestSpecification(URL), Specifications.responseSpecUnique(204));
        given()
                .when()
                .delete("/api/users/2")
                .then().log().all();
    }

}