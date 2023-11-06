import models.requestModels.*;
import models.responseModels.*;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example extends BaseTest {
    @Test
    public void getUserList() {
        System.out.println(USER_STEPS.getUserList(2));
    }

    @Test(description = "Получение пользователя по ID")
    public void getUserById() {
        UserResponse userEx = new UserResponse(new DataResponse(2, "janet.weaver@reqres.in", "Janet", "Weaver",
                "https://reqres.in/img/faces/2-image.jpg"), new SupportResponse("https://reqres.in/#support-heading",
                "To keep ReqRes free, contributions towards server costs are appreciated!"));
        UserResponse user = USER_STEPS.getUserById(2, 200);
        USER_STEPS.checkResponse(user, userEx);
        System.out.println(user);
    }

    @Test(description = "Проверка несуществующего пользователя")
    public void getFailedUserById() {
        UserResponse userEx = new UserResponse(null, null);
        UserResponse user = USER_STEPS.getUserById(23, 404);
        USER_STEPS.checkResponse(user, userEx);
        System.out.println(user);
    }

    @Test(description = "Получение списка неизвестных пользователей")
    public void getUNKUser() {
        UNKUserListResponse user = USER_STEPS.getUNKUser();
        System.out.println(user);
    }

    @Test(description = "Получение неизвестного пользователя по iD")
    public void getUNKUserById() {
        UNKUserResponse userEx = new UNKUserResponse(new DataUNKResponse(3, "true red", 2002, "#BF1932", "19-1664"), new SupportResponse("https://reqres.in/#support-heading", "To keep ReqRes free, contributions towards server costs are appreciated!"));
        UNKUserResponse user = USER_STEPS.getUNKUserById(3, 200);
        USER_STEPS.checkUNKResponse(user, userEx);
        System.out.println(user);
    }

    @Test(description = "Проверка несуществующего пользователя")
    public void getFailedUNKUserById() {
        UNKUserResponse userEx = new UNKUserResponse(null, null);
        UNKUserResponse user = USER_STEPS.getUNKUserById(23, 404);
        USER_STEPS.checkUNKResponse(user, userEx);
        System.out.println(user);
    }

    @Test(description = "Создание нового пользователя")
    public void postCreate() {
        UserRequest userRequest = new UserRequest("morpheus", "leader");
        UserChangedResponse userChanged = USER_STEPS.postCreate(userRequest, 201);
        System.out.println(userChanged);
    }

    @Test(description = "Обновление пользователя PUT")
    public void putUpdate() {
        UserRequest userRequest = new UserRequest("morpheus", "zion resident");
        UserChangedResponse userChanged = USER_STEPS.putUpdate(userRequest, 2, 200);
        System.out.println(userChanged);
    }

    @Test(description = "Обновление пользователя PATCH")
    public void patchUpdate() {
        UserRequest userRequest = new UserRequest("morpheus", "zion resident");
        UserChangedResponse userChanged = USER_STEPS.patchUpdate(userRequest, 2, 200);
        System.out.println(userChanged);
    }

    @Test(description = "Удаление пользователя")
    public void deleteUser() {
        USER_STEPS.deleteUser(2, 204);
    }

    @Test(description = "Проверка удачной регистрации")
    public void successfulRegister() {
        LoginRequest loginRequest = new LoginRequest("eve.holt@reqres.in", "pistol");
        RegisterResponse registerResponse = USER_STEPS.userRegister(loginRequest, 200);
        System.out.println(registerResponse);
        Assert.assertTrue(registerResponse.toString().contains("error=null"));
    }

    @Test(description = "Проверка Неудачной регистрации")
    public void unSuccessfulRegister() {
        LoginRequest loginRequest = new LoginRequest("sydney@fife", null);
        RegisterResponse registerResponse = USER_STEPS.userRegister(loginRequest, 400);
        System.out.println(registerResponse);
        Assert.assertTrue(registerResponse.toString().contains("Missing password"));
    }

    @Test(description = "Проверка удачной авторизации")
    public void successfulLogin() {
        LoginRequest loginRequest = new LoginRequest("eve.holt@reqres.in", "cityslicka");
        LoginResponse loginResponse = USER_STEPS.userLogin(loginRequest, 200);
        System.out.println(loginResponse);
        Assert.assertTrue(loginResponse.toString().contains("error=null"));
    }

    @Test(description = "Проверка удачной авторизации")
    public void unSuccessfulLogin() {
        LoginRequest loginRequest = new LoginRequest("eve.holt@reqres.in", null);
        LoginResponse loginResponse = USER_STEPS.userLogin(loginRequest, 400);
        System.out.println(loginResponse);
        Assert.assertTrue(loginResponse.toString().contains("Missing password"));
    }

    @Test(description = "Получение списка пользователей с задержкой")
    @Parameters({})
    public void getDelayUserList() throws Exception {
        System.out.println(USER_STEPS.getDelayUserList());
    }
}
