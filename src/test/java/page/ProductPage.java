package page;

import methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import static java.awt.SystemColor.text;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void selectProduct() {
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//*[@id='search-input']")).sendKeys("oyuncak");
        methods.findElement(By.xpath("//*[@class='common-sprite button-search']")).click();
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("(//*[@class='product-cr'])[8]"));
        methods.waitBySeconds(4);
        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart'])[5]"));
        methods.findElement(By.xpath("(//*[@class='fa fa-heart'])[5]")).click();
        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart'])[6]"));
        methods.findElement(By.xpath("(//*[@class='fa fa-heart'])[6]")).click();
        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart'])[7]"));
        methods.findElement(By.xpath("(//*[@class='fa fa-heart'])[7]")).click();
        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart'])[8]"));
        methods.findElement(By.xpath("(//*[@class='fa fa-heart'])[8]")).click();
        Assert.assertTrue(methods.isElementVisible(By.xpath("(//*[@class='fa fa-heart red'])[6]")));
        System.out.println("Ürün Başarıyla Favorilere Eklendi..");
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart red'])[5]"));
        methods.findElement(By.xpath("(//*[@class='fa fa-heart red'])[5]")).click();
        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart red'])[6]"));
        methods.findElement(By.xpath("(//*[@class='fa fa-heart red'])[6]")).click();
        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart red'])[7]"));
        methods.findElement(By.xpath("(//*[@class='fa fa-heart red'])[7]")).click();
        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart red'])[8]"));
        methods.findElement(By.xpath("(//*[@class='fa fa-heart red'])[8]")).click();
        methods.findElement(By.xpath("//*[@class='swal2-header']"));
        methods.findElement(By.xpath("//*[@class=\"swal2-header\"]//*[contains(text(),\"Ürün başarılı bir şekilde\")]"));
        methods.waitBySeconds(5);
        methods.findElement(By.xpath("//*[@id='header-bottom']//div[@class='logo-text']")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//*[@class='lvl1catalog']")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//*[@title='Puan Kataloğundaki Türk Klasikleri']")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//*[@class='sort']//select//option[contains(text(),\"Yüksek Oylama\")]")).click();
        methods.waitBySeconds(2);
        methods.hoverElement(By.xpath("(//*[contains(text(),\"Tüm Kitaplar\")])[3]"));
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//a[contains(@href, 'kategori/kitap-hobi/1_212.html')]")).click();
        methods.waitBySeconds(2);
        methods.hoverElement(By.xpath("//div[@class=\"menu top my-list\"]//a[@class=\"common-sprite\"]"));
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//a[contains(@href, 'https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0')]")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("(//*[@class=\"fa fa-heart-o\"])[3]\n")).click();
        methods.waitBySeconds(3 );
        methods.findElement(By.cssSelector("#cart-items")).click();
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector("#js-cart")).click();
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector("[name=\"quantity\"]")).clear();
        methods.waitBySeconds(2);
        methods.findElement(By.cssSelector("[name=\"quantity\"]")).sendKeys("3");
        //methods.findElement(By.xpath("//*[@class=\"fa fa-refresh green-icon\"] ")).click();
        //methods.waitBySeconds(5);
        //methods.findElement(By.cssSelector(".right>a")).click();
        //methods.waitBySeconds(3);
        methods.findElement(By.xpath("//*[@class=\"button red\"] ")).click();
        methods.waitBySeconds(3);
        methods.findElement(By.xpath("//a[contains(@href, '#tab-shipping-new-adress')]\t")).click();
        methods.findElement(By.cssSelector("[name=\"firstname_companyname\"]")).sendKeys("Mert");
        methods.findElement(By.cssSelector("[name=\"lastname_title\"]")).sendKeys("Tabak");
        methods.selectByText(By.xpath("//*[@id=\"address-zone-id\"]\t"), "İstanbul");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//*[@id=\"address-county-id\"]\t"), "TUZLA");
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//input[@id='district']")).sendKeys("CEDİDİYE MAH");
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector("[name=\"address\"]")).sendKeys("Mimar Sinan Caddesi No:93");
        methods.findElement(By.cssSelector("[name=\"postcode\"]")).sendKeys("34");
        methods.findElement(By.cssSelector("[name=\"telephone\"]")).sendKeys("2323241414");
        methods.findElement(By.cssSelector("[name=\"mobile_telephone\"]")).sendKeys("5319729469");
        methods.findElement(By.cssSelector("[name=\"tax_id\"]")).sendKeys("17123349268");
        methods.waitBySeconds(5);
        methods.findElement(By.xpath("//*[@id=\"button-checkout-continue\"]\t")).click();
        methods.waitBySeconds(4);
        methods.findElement(By.xpath(" //*[@id=\"button-checkout-continue\"]\t")).click();
        methods.waitBySeconds(4);
        methods.findElement(By.xpath("//*[@id=\"credit-card-owner\"]\t  ")).sendKeys("Mert Tabak");
        methods.findElement(By.xpath("//*[@id=\"credit_card_number_1\"]\t  ")).sendKeys("4043");
        methods.findElement(By.xpath("//*[@id=\"credit_card_number_2\"]\t  ")).sendKeys("0872");
        methods.findElement(By.xpath("//*[@id=\"credit_card_number_3\"]\t  ")).sendKeys("7470");
        methods.findElement(By.xpath("//*[@id=\"credit_card_number_4\"]\t  ")).sendKeys("0028");
        methods.findElement(By.cssSelector("[name=\"firstname_companyname\"]")).sendKeys("Mert");
        methods.selectByText(By.cssSelector("[name=\"credit_card_expire_date_month\"]"),"09");
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("[name=\"credit_card_expire_date_year\"]"),"2028");
        methods.waitBySeconds(2);
        methods.findElement(By.cssSelector("[name=\"credit_card_security_code\"]")).sendKeys("843");
        methods.click(By.xpath("//*[@id='button-checkout-continue']"));
        methods.waitBySeconds(4);
        methods.findElement(By.cssSelector("[name='agree']")).click();
        methods.findElement(By.xpath("//input[@type=\"submit\"]\t   ")).click();



















        methods.waitBySeconds(2);








    }

}