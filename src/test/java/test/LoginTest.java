package test;

import driver.BaseTest;
import org.junit.Test;
import page.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}
