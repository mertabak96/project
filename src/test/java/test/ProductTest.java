package test;

import driver.BaseTest;
import org.junit.Test;
import page.LoginPage;
import page.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void productTest () {
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        loginPage.login();
        productPage.selectProduct();

    }

}
