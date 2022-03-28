package page;

import methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;

    public LoginPage() {
        {methods = new Methods ();}

    }
    public void login() {
        methods.findElement(By.xpath("//a[contains(@href, 'https://www.kitapyurdu.com/index.php?route=account/login')]")).click();
        methods.findElement(By.xpath("//*[@id='login-email']")).sendKeys("mert.tabak@testinium.com");
        methods.findElement(By.xpath("//*[@id='login-password']")).sendKeys("hocam100bekliyorum");
        methods.findElement(By.cssSelector(".fa.ky-show-password.js-show-toggle-pw.fa-eye")).click();
        methods.findElement(By.xpath("//*[@class='ky-btn ky-btn-orange w-100 ky-login-btn']")).click();
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".attention")));
        System.out.println("Hoşgeldiniz Mert Tabak..");
        methods.waitBySeconds(3);





    }

}
